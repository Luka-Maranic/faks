package com.faks.faks.repository;

import com.faks.faks.model.entity.Results;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultRepository extends JpaRepository<Results, Long> {
}
