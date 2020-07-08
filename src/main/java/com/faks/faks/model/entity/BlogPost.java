package com.faks.faks.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "blog_post")
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean publish;

    private String title;

    private String description;

    private String author;

    private String image;

    private String body;

    private Date dateAdded;

    private Long readTime;

}
