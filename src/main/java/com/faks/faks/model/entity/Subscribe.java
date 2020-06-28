package com.faks.faks.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Subscribe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String email;

    private Boolean active;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinTable( name="subscribe_category",
    joinColumns = @JoinColumn(name="subscribe_id"),
    inverseJoinColumns = @JoinColumn(name="category_id"))
    private List<Category> categories;

}
