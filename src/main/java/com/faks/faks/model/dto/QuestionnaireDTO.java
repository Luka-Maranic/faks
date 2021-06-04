package com.faks.faks.model.dto;

import com.faks.faks.model.entity.Answers;
import com.faks.faks.model.entity.Questionnaire;
import com.faks.faks.model.entity.Questions;
import com.faks.faks.model.entity.Results;
import lombok.Data;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Data
public class QuestionnaireDTO {
    private Long id;
    private String name;
    private List<Questions> questions;

    public static QuestionnaireDTO of(Questionnaire questionnaire) {
        QuestionnaireDTO cmd = new QuestionnaireDTO();
        cmd.id = questionnaire.getId();
        cmd.name = questionnaire.getName();
        cmd.questions = questionnaire.getQuestions();

        return cmd;
    }

    public static List<QuestionnaireDTO> of(List<Questionnaire> questionnaireList) {
        return questionnaireList.stream()
                .map(QuestionnaireDTO::of)
                .collect(Collectors.toList());
    }
}
