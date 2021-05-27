package com.faks.faks.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Answers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String question;

    private boolean correctAnswer;

    private Integer score;

    @ManyToOne
    @JoinColumn(name = "results_id")
    private Results results;
}
