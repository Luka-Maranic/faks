package com.faks.faks.controller;

import com.faks.faks.model.command.results.ResultsFilterCommand;
import com.faks.faks.model.command.results.ResultsSaveCommand;
import com.faks.faks.model.dto.ResultsDTO;
import com.faks.faks.service.ResultsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/results")
public class ResultsController {

    private final ResultsService resultsService;

    public ResultsController(ResultsService resultsService) {
        this.resultsService = resultsService;
    }

    @PostMapping("/find-result")
    public ResultsDTO findResult(@RequestBody ResultsFilterCommand command) {
        return resultsService.findResult(command);
    }

    @PostMapping("/find-all")
    public List<ResultsDTO> findAll(@RequestBody ResultsFilterCommand command) {
        return resultsService.filterResults(command);
    }

    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody Long id) {
        return resultsService.delete(id);
    }

    @PostMapping("/save")
    public ResultsDTO save(@RequestBody ResultsSaveCommand command) {
        return resultsService.save(command);
    }
    
}
