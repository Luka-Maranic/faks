package com.faks.faks.service;

import com.faks.faks.model.command.results.questionnaire.QuestionnaireFilterCommand;
import com.faks.faks.model.command.results.questionnaire.QuestionnaireSaveCommand;
import com.faks.faks.model.dto.QuestionnaireDTO;
import com.faks.faks.model.entity.Questionnaire;
import com.faks.faks.repository.QuestionnaireRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionnaireServiceImpl implements QuestionnaireService {

    private final QuestionnaireRepository questionnaireRepository;

    public QuestionnaireServiceImpl(QuestionnaireRepository questionnaireRepository) {
        this.questionnaireRepository = questionnaireRepository;
    }

    @Override
    public QuestionnaireDTO findQuestionnaire(QuestionnaireFilterCommand command) {
        Questionnaire questionnaire = this.questionnaireRepository
                .findById(command.getId()).orElse(null);
        return QuestionnaireDTO.of(questionnaire);
    }

    @Override
    public List<QuestionnaireDTO> filterQuestionnaires(QuestionnaireFilterCommand command) {
        List<Questionnaire> questionnaires = this.questionnaireRepository.findAll();
        return QuestionnaireDTO.of(questionnaires);
    }

    @Override
    public QuestionnaireDTO save(QuestionnaireSaveCommand command) {
        return QuestionnaireDTO.of(this.questionnaireRepository.save(command.convertToEntity()));
    }

    @Override
    public Boolean delete(Long id) {
        this.questionnaireRepository.deleteById(id);
        return true;
    }
}
