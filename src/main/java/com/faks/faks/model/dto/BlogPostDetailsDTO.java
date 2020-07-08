package com.faks.faks.model.dto;

import com.faks.faks.model.entity.BlogPost;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class BlogPostDetailsDTO extends BlogPostDTO {
    private String body;

    public static BlogPostDetailsDTO fromEntity(BlogPost blogPost) {
        BlogPostDetailsDTO blogPostDetailsDTODTO = new BlogPostDetailsDTO();
        blogPostDetailsDTODTO.setId(blogPost.getId());
        blogPostDetailsDTODTO.setBody(blogPost.getBody());
        blogPostDetailsDTODTO.setPublish(blogPost.getPublish());
        blogPostDetailsDTODTO.setTitle((blogPost.getTitle()));
        blogPostDetailsDTODTO.setDescription((blogPost.getDescription()));
        blogPostDetailsDTODTO.setAuthor((blogPost.getAuthor()));
        blogPostDetailsDTODTO.setImage((blogPost.getImage()));
        blogPostDetailsDTODTO.setDateAdded(blogPost.getDateAdded());
        blogPostDetailsDTODTO.setReadTime(blogPost.getReadTime());

        return blogPostDetailsDTODTO;
    }

    public static List<BlogPostDTO> fromList(List<BlogPost> blogPosts) {
        return blogPosts.stream().map(BlogPostDTO::fromEntity).collect(Collectors.toList());
    }
}
