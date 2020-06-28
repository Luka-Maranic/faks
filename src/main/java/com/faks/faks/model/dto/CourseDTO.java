package com.faks.faks.model.dto;

import com.faks.faks.model.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseDTO {

    private Long id;
    private String name;

    public static CourseDTO fromEntity(Course course){
        CourseDTO courseDTO = new CourseDTO();
        courseDTO.setId(course.getId());
        courseDTO.setName(course.getName());

        return courseDTO;
    }

    public static List<CourseDTO> fromList(List<Course> courses){
        return courses.stream().map(CourseDTO::fromEntity).collect(Collectors.toList());
    }
}
