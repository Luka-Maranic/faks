package com.faks.faks.service;


import com.faks.faks.model.command.results.questionnaire.QuestionnaireFilterCommand;
import com.faks.faks.model.command.results.questionnaire.QuestionnaireSaveCommand;
import com.faks.faks.model.dto.QuestionnaireDTO;

import java.util.List;

public interface QuestionnaireService {

    QuestionnaireDTO findQuestionnaire(QuestionnaireFilterCommand command);

    List<QuestionnaireDTO> filterQuestionnaires(QuestionnaireFilterCommand command);

    QuestionnaireDTO save(QuestionnaireSaveCommand command);

    Boolean delete(Long id);
}
