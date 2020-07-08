package com.faks.faks.controller;

import com.faks.faks.model.command.base.ApiBasePageCommand;
import com.faks.faks.model.command.blogPost.DeleteBlogPostCommand;
import com.faks.faks.model.command.blogPost.FilterBlogPostCommand;
import com.faks.faks.model.command.blogPost.SaveBlogPostDetailsCommand;
import com.faks.faks.model.dto.BlogPostDTO;
import com.faks.faks.model.dto.BlogPostDetailsDTO;
import com.faks.faks.model.dto.base.base.ApiBaseDTO;
import com.faks.faks.model.dto.base.base.ApiBasePageDTO;
import com.faks.faks.service.blogPost.BlogPostService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/blog")
public class BlogPostController {

    private final BlogPostService blogPostService;

    public BlogPostController(BlogPostService blogPostService) {
        this.blogPostService = blogPostService;
    }

    @ApiOperation(value = "Save BlogPost")
    @PostMapping("/save")
    public ApiBaseDTO<BlogPostDetailsDTO> saveBlogPost(@RequestBody SaveBlogPostDetailsCommand command) {
        return blogPostService.saveBlogPostDetails(command);
    }

    @ApiOperation(value = "Delete BlogPost")
    @PostMapping("/delete")
    public Boolean deleteBlogPost(@RequestBody DeleteBlogPostCommand command) {
        return blogPostService.deleteBlogPost(command);
    }

    @ApiOperation(value = "Filter BlogPost")
    @PostMapping("/filter")
    public ApiBasePageDTO<BlogPostDTO> filterBlogPost(@RequestBody ApiBasePageCommand<FilterBlogPostCommand> command) {
        return blogPostService.filterBlogPost(command);
    }

    @ApiOperation(value = "Filter BlogPostDetails")
    @PostMapping("/filterDetails")
    public ApiBaseDTO<BlogPostDetailsDTO> filterBlogPostDetails(@RequestBody FilterBlogPostCommand command) {
        return blogPostService.filterBlogPostDetails(command);
    }

}
