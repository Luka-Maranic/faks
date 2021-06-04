package com.faks.faks.model.command.results.question;

import lombok.Data;

@Data
public class QuestionFilterCommand {
    private Long id;
    private String question;
    private String correctAnswer;
    private Integer score;
}
