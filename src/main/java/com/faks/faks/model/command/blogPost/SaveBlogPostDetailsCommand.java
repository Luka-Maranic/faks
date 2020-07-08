package com.faks.faks.model.command.blogPost;

import com.faks.faks.model.entity.BlogPost;
import lombok.Data;

import java.util.Date;
import java.util.stream.Collectors;

@Data
public class SaveBlogPostDetailsCommand {
    private Long id;
    private Boolean publish;
    private String title;
    private String description;
    private String body;
    private String author;
    private String image;
    private Date dateAdded;
    private Long readTime;

    public BlogPost toEntity() {
        BlogPost blogPost = new BlogPost();
        blogPost.setId(this.id);
        blogPost.setPublish(this.publish);
        blogPost.setTitle(this.title);
        blogPost.setDescription(this.description);
        blogPost.setBody(this.body);
        blogPost.setAuthor(this.author);
        blogPost.setImage(this.image);
        blogPost.setDateAdded(this.dateAdded);
        blogPost.setReadTime(this.readTime);

        return blogPost;
    }
}
