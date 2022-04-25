package com.example.courseapidata.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    public List<Course> findByTopicId(Integer topicId);

}

