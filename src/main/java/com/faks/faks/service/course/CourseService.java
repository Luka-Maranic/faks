package com.faks.faks.service.course;

import com.faks.faks.model.command.course.SaveCourseCommand;
import com.faks.faks.model.dto.CourseDTO;

public interface CourseService {
    CourseDTO saveCourse (SaveCourseCommand command);

}
