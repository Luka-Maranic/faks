package com.faks.faks.service;

import com.faks.faks.model.command.results.question.QuestionFilterCommand;
import com.faks.faks.model.command.results.question.QuestionSaveCommand;
import com.faks.faks.model.dto.QuestionsDTO;
import com.faks.faks.model.entity.Questions;
import com.faks.faks.repository.QuestionsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionsServiceImpl implements QuestionsService {

    private final QuestionsRepository questionsRepository;

    public QuestionsServiceImpl(QuestionsRepository questionsRepository) {
        this.questionsRepository = questionsRepository;
    }

    @Override
    public QuestionsDTO findQuestions(QuestionFilterCommand command) {
        Questions questions = this.questionsRepository
                .findById(command.getId()).orElse(null);
        return QuestionsDTO.of(questions);
    }

    @Override
    public List<QuestionsDTO> filterQuestions(QuestionFilterCommand command) {
        List<Questions> questions = this.questionsRepository.findAll();
        return QuestionsDTO.of(questions);
    }

    @Override
    public QuestionsDTO save(QuestionSaveCommand command) {
        return QuestionsDTO.of(this.questionsRepository.save(command.convertToEntity()));
    }

    @Override
    public Boolean delete(Long id) {
        this.questionsRepository.deleteById(id);
        return null;
    }
}
