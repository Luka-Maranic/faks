package com.faks.faks.model.command.results;

import com.faks.faks.model.entity.Answers;
import com.faks.faks.model.entity.Results;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class ResultsSaveCommand {
    private Long id;
    private String name;
    private Float totalScore;
    private List<Answers> answers;

    public Results convertToEntity() {
        Results results = new Results();
        results.setId(this.id);
        results.setName(this.name);
        results.setTotalScore(this.totalScore);
        results.setAnswers(this.answers);
        return results;
    }
}
