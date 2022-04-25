package com.example.courseapidata.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseApiController {

    // TODO: you should take a look how to inject dependencies in spring
    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/courses/{topicId}")
    public List<Course> getAllCourses(@PathVariable Integer topicId) {
        return courseService.getAllCourses(topicId);
    }

    // TODO: specify the method for this endpoint
    @RequestMapping("/topics/{topicId}/courses")
    public Course getCourseById(@PathVariable Integer topicId) {
        return courseService.getCourseById(topicId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/courses")
    public void addCourse(@RequestBody Course course) {
        courseService.addCourse(course);
    }

    // TODO: Id is not used here
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable Integer id) {
        courseService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/courses/{id}")
    public void deleteCourseById(@PathVariable Integer id) {
        courseService.deleteCourse(id);
    }

}
