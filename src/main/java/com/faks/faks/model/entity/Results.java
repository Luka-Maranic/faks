package com.faks.faks.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Results {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Float totalScore;

    @OneToMany(mappedBy = "answers", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Answers> answers;
}
