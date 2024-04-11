package com.learnspingboot.learnjavaspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
//    /courses
//    Course: id, name, author
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
//        return here
        return Arrays.asList(
                new Course(1, "Learn AWS", "Naveen"),
                new Course(2, "Learn Java", "Naveen"),
                new Course(3, "Learn GCP", "Naveen")
        );
    }
}
