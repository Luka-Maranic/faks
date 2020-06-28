package com.faks.faks.model.command.course;

import com.faks.faks.model.entity.Course;
import lombok.Data;

@Data
public class SaveCourseCommand {
    private Long id;
    private String name;

    public Course toEntity (Course course){
        Course entity = new Course();
        entity.setId(course.getId());
        entity.setName(course.getName());

        return entity;
    }

    public Course updateEntity (Course course){
        course.setId(this.id);
        course.setName(this.name);

        return course;
    }
}
