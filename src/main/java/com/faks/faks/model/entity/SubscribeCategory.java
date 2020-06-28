package com.faks.faks.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class SubscribeCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name ="category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name ="subscribe_id")
    private Subscribe subscribe;
}
