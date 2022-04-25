package com.example.courseapidata.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository CourseRepository;

    public List<Course> getAllCourses(Integer topicId) {
        List<Course> courseList = new ArrayList<>();
        courseList.addAll(CourseRepository.findByTopicId(topicId));
        return courseList;
    }

    public Course getCourseById(Integer topicId) {
        return CourseRepository.findById(topicId).get();
    }

    public void addCourse(Course course) {
        CourseRepository.save(course);
    }

    public void updateCourse(Course course) {
        if (CourseRepository.existsById(course.getId()))
            CourseRepository.save(course);
    }

    public void deleteCourse(Integer id) {
        // courses.removeIf(t -> t.getId().equals(id));
        CourseRepository.deleteById(id);
    }

}
