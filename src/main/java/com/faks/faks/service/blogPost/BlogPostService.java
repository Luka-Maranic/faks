package com.faks.faks.service.blogPost;

import com.faks.faks.model.command.base.ApiBasePageCommand;
import com.faks.faks.model.command.blogPost.DeleteBlogPostCommand;
import com.faks.faks.model.command.blogPost.FilterBlogPostCommand;
import com.faks.faks.model.command.blogPost.SaveBlogPostDetailsCommand;
import com.faks.faks.model.dto.BlogPostDTO;
import com.faks.faks.model.dto.BlogPostDetailsDTO;
import com.faks.faks.model.dto.base.base.ApiBaseDTO;
import com.faks.faks.model.dto.base.base.ApiBasePageDTO;

public interface BlogPostService {

    ApiBaseDTO<BlogPostDetailsDTO> saveBlogPostDetails(SaveBlogPostDetailsCommand command);

    Boolean deleteBlogPost(DeleteBlogPostCommand command);

    ApiBasePageDTO<BlogPostDTO> filterBlogPost(ApiBasePageCommand<FilterBlogPostCommand> command);

    ApiBaseDTO<BlogPostDetailsDTO> filterBlogPostDetails(FilterBlogPostCommand command);
}
