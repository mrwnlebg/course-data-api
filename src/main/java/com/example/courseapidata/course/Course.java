package com.example.courseapidata.course;


import com.example.courseapidata.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

// TODO: idem
@Entity
public class Course {
    @Id
    private Integer id;
    private String name;
    private String description;
    @ManyToOne
    private Topic topic;

    public Course(String name, Integer id, String description, Integer topicId) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.topic = new Topic(topicId, "", "");
    }

    public Course() {

    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
