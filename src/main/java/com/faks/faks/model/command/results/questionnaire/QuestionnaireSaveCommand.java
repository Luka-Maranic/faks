package com.faks.faks.model.command.results.questionnaire;

import com.faks.faks.model.entity.Questionnaire;
import com.faks.faks.model.entity.Questions;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class QuestionnaireSaveCommand {
    private Long id;
    private String name;
    private List<Questions> questions;

    public Questionnaire convertToEntity() {
        Questionnaire questionnaire = new Questionnaire();
        questionnaire.setId(this.id);
        questionnaire.setName(this.name);
        questionnaire.setQuestions(this.questions);
        return questionnaire;
    }
}
