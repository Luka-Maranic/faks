package com.faks.faks.controller.course;

import com.faks.faks.model.command.course.SaveCourseCommand;
import com.faks.faks.model.dto.CourseDTO;
import com.faks.faks.service.course.CourseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/course")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/save")
    public CourseDTO saveCourse(@RequestBody SaveCourseCommand command){
        return courseService.saveCourse(command);
    }
}
