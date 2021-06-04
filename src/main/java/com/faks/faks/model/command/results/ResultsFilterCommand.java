package com.faks.faks.model.command.results;

import lombok.Data;

@Data
public class ResultsFilterCommand {
    private Long id;
    private String name;
    private Float totalScore;
}
