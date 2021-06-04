package com.faks.faks.model.dto;

import com.faks.faks.model.entity.Answers;
import com.faks.faks.model.entity.Results;
import lombok.Data;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Data
public class ResultsDTO {

    private Long id;
    private String name;
    private Float totalScore;
    private List<Answers> answers;

    public static ResultsDTO of(Results results) {
        ResultsDTO cmd = new ResultsDTO();
        cmd.id = results.getId();
        cmd.name = results.getName();
        cmd.totalScore = results.getTotalScore();
        cmd.answers = results.getAnswers();

        return cmd;
    }

    public static List<ResultsDTO> of(List<Results> resultsList) {
        return resultsList.stream()
                .map(ResultsDTO::of)
                .collect(Collectors.toList());
    }

}
