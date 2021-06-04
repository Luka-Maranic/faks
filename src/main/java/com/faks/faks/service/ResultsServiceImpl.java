package com.faks.faks.service;

import com.faks.faks.model.command.results.ResultsFilterCommand;
import com.faks.faks.model.command.results.ResultsSaveCommand;
import com.faks.faks.model.dto.QuestionnaireDTO;
import com.faks.faks.model.dto.ResultsDTO;
import com.faks.faks.model.entity.Results;
import com.faks.faks.repository.ResultsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResultsServiceImpl implements ResultsService {

    private final ResultsRepository resultsRepository;

    public ResultsServiceImpl(ResultsRepository resultsRepository) {
        this.resultsRepository = resultsRepository;
    }

    @Override
    public ResultsDTO findResult(ResultsFilterCommand command) {
        Results results = this.resultsRepository
                .findById(command.getId()).orElse(null);
        return ResultsDTO.of(results);
    }

    @Override
    public List<ResultsDTO> filterResults(ResultsFilterCommand command) {
        List<Results> resultsList = this.resultsRepository.findAll();
        return ResultsDTO.of(resultsList);
    }

    @Override
    public ResultsDTO save(ResultsSaveCommand command) {
        return ResultsDTO.of(this.resultsRepository.save(command.convertToEntity()));
    }

    @Override
    public Boolean delete(Long id) {
        this.resultsRepository.deleteById(id);
        return true;
    }
}
