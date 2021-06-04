package com.faks.faks.service;

import com.faks.faks.model.command.results.ResultsFilterCommand;
import com.faks.faks.model.command.results.ResultsSaveCommand;
import com.faks.faks.model.dto.ResultsDTO;

import java.util.List;

public interface ResultsService {

    ResultsDTO findResult(ResultsFilterCommand command);

    List<ResultsDTO> filterResults(ResultsFilterCommand command);

    ResultsDTO save(ResultsSaveCommand command);

    Boolean delete(Long id);

}
