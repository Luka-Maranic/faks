package com.faks.faks.model.command.results.question;

import com.faks.faks.model.entity.Questions;
import lombok.Data;

@Data
public class QuestionSaveCommand {

    private Long id;
    private String question;
    private String correctAnswer;
    private Integer score;

    public Questions convertToEntity() {
        Questions questions = new Questions();
        questions.setId(this.id);
        questions.setCorrectAnswer(this.correctAnswer);
        questions.setQuestion(this.question);
        questions.setScore(this.score);
        return questions;
    }
}
