package com.faks.faks.model.dto;

import com.faks.faks.model.entity.Questions;
import com.faks.faks.model.entity.Questions;
import lombok.Data;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Data
public class QuestionsDTO {

    private Long id;
    private String question;
    private String correctAnswer;
    private Integer score;

    public static QuestionsDTO of(Questions questions) {
        QuestionsDTO cmd = new QuestionsDTO();
        cmd.id = questions.getId();
        cmd.question = questions.getQuestion();
        cmd.correctAnswer = questions.getCorrectAnswer();
        cmd.score = questions.getScore();

        return cmd;
    }

    public static List<QuestionsDTO> of(List<Questions> questionsList) {
        return questionsList.stream()
                .map(QuestionsDTO::of)
                .collect(Collectors.toList());
    }
}
