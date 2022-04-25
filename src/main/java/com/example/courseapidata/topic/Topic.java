package com.example.courseapidata.topic;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Topic {
    @Id
    private Integer id;
    private String name;
    private String description;

    public Topic(Integer id, String name, String description) {
        this.name = name;
        this.id = id;
        this.description = description;
    }

    public Topic() {

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
