package com.faks.faks.service.course;

import com.faks.faks.model.command.course.SaveCourseCommand;
import com.faks.faks.model.dto.CourseDTO;
import com.faks.faks.model.entity.Course;
import com.faks.faks.repository.CourseRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public CourseDTO saveCourse(SaveCourseCommand command) {
        Course course = new Course();
        course.setId(command.getId());
        courseRepository.save(command.toEntity(course));
        return CourseDTO.fromEntity(course);
//        try {
//            Company company = new Company();
//            command.setId(command.getCompanyId());
//            Licence licence = licenceRepository.findById(command.getId()).orElse(new Licence());
//            if (command.getId() == null) {
//                licence = licenceRepository.save(command.toEntity(company));
//            } else {
//                licence = licenceRepository.save(command.updateLicence(licence, company));
//            }
//            return ApiBaseDTO.generateSuccessResponse(LicenceDTO.fromEntity(licence));
//        } catch (Exception e) {
//            return ApiBaseDTO.generateErrorResponse(ErrorInfo.GENERAL_ERROR);
//        }
        }
}
