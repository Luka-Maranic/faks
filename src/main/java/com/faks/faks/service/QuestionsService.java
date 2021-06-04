package com.faks.faks.service;


import com.faks.faks.model.command.results.question.QuestionFilterCommand;
import com.faks.faks.model.command.results.question.QuestionSaveCommand;
import com.faks.faks.model.dto.QuestionsDTO;

import java.util.List;

public interface QuestionsService {

    QuestionsDTO findQuestions(QuestionFilterCommand command);

    List<QuestionsDTO> filterQuestions(QuestionFilterCommand command);

    QuestionsDTO save(QuestionSaveCommand command);

    Boolean delete(Long id);
}
