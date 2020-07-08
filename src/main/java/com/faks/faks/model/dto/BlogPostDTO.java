package com.faks.faks.model.dto;

import com.faks.faks.model.entity.BlogPost;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class BlogPostDTO {
    private Long id;
    private Boolean publish;
    private String title;
    private String description;
    private String author;
    private String image;
    private Date dateAdded;
    private Long readTime;

    public static BlogPostDTO fromEntity(BlogPost blogPost) {
        BlogPostDTO blogPostDTO = new BlogPostDTO();
        blogPostDTO.setId(blogPost.getId());
        blogPostDTO.setPublish(blogPost.getPublish());
        blogPostDTO.setTitle((blogPost.getTitle()));
        blogPostDTO.setDescription((blogPost.getDescription()));
        blogPostDTO.setAuthor((blogPost.getAuthor()));
        blogPostDTO.setImage((blogPost.getImage()));
        blogPostDTO.setDateAdded(blogPost.getDateAdded());
        blogPostDTO.setReadTime(blogPost.getReadTime());

        return blogPostDTO;
    }

    public static List<BlogPostDTO> fromList(List<BlogPost> blogPosts) {
        return blogPosts.stream().map(BlogPostDTO::fromEntity).collect(Collectors.toList());
    }
}
