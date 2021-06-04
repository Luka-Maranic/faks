package com.faks.faks.controller;

import com.faks.faks.model.command.results.questionnaire.QuestionnaireFilterCommand;
import com.faks.faks.model.command.results.questionnaire.QuestionnaireSaveCommand;
import com.faks.faks.model.dto.QuestionnaireDTO;
import com.faks.faks.service.QuestionnaireService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/questionnaire")
public class QuestionnaireController {

    private final QuestionnaireService questionnaireService;

    public QuestionnaireController(QuestionnaireService questionnaireService) {
        this.questionnaireService = questionnaireService;
    }

    @PostMapping("/find-questionnaire")
    public QuestionnaireDTO findQuestionnaire(@RequestBody QuestionnaireFilterCommand command) {
        return questionnaireService.findQuestionnaire(command);
    }

    @PostMapping("/find-all")
    public List<QuestionnaireDTO> findAll(@RequestBody QuestionnaireFilterCommand command) {
        return questionnaireService.filterQuestionnaires(command);
    }

    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody Long id) {
        return questionnaireService.delete(id);
    }

    @PostMapping("/save")
    public QuestionnaireDTO save(@RequestBody QuestionnaireSaveCommand command) {
        return questionnaireService.save(command);
    }
}
