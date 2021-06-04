package com.faks.faks.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Questionnaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "questionnaire",fetch=FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Questions> questions;

}
