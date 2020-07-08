package com.faks.faks.service.blogPost;

import com.faks.faks.model.command.base.ApiBasePageCommand;
import com.faks.faks.model.command.blogPost.DeleteBlogPostCommand;
import com.faks.faks.model.command.blogPost.FilterBlogPostCommand;
import com.faks.faks.model.command.blogPost.SaveBlogPostDetailsCommand;
import com.faks.faks.model.dto.BlogPostDTO;
import com.faks.faks.model.dto.BlogPostDetailsDTO;
import com.faks.faks.model.dto.base.base.ApiBaseDTO;
import com.faks.faks.model.dto.base.base.ApiBasePageDTO;
import com.faks.faks.model.dto.base.base.ErrorInfo;
import com.faks.faks.model.dto.base.base.PageDTO;
import com.faks.faks.model.entity.BlogPost;
import com.faks.faks.model.specification.BlogPostSpecification;
import com.faks.faks.repository.BlogPostRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BlogPostServiceImpl implements BlogPostService {

    private final BlogPostRepository blogPostRepository;

    public BlogPostServiceImpl(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    @Override
    @Transactional
    public ApiBaseDTO<BlogPostDetailsDTO> saveBlogPostDetails(SaveBlogPostDetailsCommand command) {
        return ApiBaseDTO.generateSuccessResponse(BlogPostDetailsDTO.fromEntity(blogPostRepository.save(command.toEntity())));
    }

    @Override
    public Boolean deleteBlogPost(DeleteBlogPostCommand command) {
        blogPostRepository.deleteById(command.getId());
        return true;
    }

    @Override
    @Transactional
    public ApiBasePageDTO<BlogPostDTO> filterBlogPost(ApiBasePageCommand<FilterBlogPostCommand> command) {
        Page<BlogPost> blogPosts = blogPostRepository.findAll(BlogPostSpecification.getBlogPostSpecification(command.getCommand()),
                command.getPagination().generatePagingAndSortingRequest());
        return ApiBasePageDTO.setApiPageResponse(BlogPostDTO.fromList(blogPosts.getContent()), PageDTO.ofPage(blogPosts));
    }

    @Override
    @Transactional
    public ApiBaseDTO<BlogPostDetailsDTO> filterBlogPostDetails(FilterBlogPostCommand command) {
        return blogPostRepository.findById(command.getId())
                .map(blogPost -> ApiBaseDTO.generateSuccessResponse(BlogPostDetailsDTO.fromEntity(blogPost)))
                .orElseGet(() -> ApiBaseDTO.generateErrorResponse(ErrorInfo.GENERAL_ERROR));
    }
}
