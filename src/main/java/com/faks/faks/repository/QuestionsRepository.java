package com.faks.faks.repository;

import com.faks.faks.model.entity.Questions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionsRepository extends JpaRepository<Questions, Long> {

    List<Questions> findByQuestionLike(String question);

}
