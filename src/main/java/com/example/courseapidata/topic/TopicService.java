package com.example.courseapidata.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;
    

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        // topicRepository.findAll().forEach(topic -> topicList.add(topic));  using lambda expression works too just fine
        return topics;
    }

    public Topic getTopicById(Integer id) {
        return topicRepository.findById(id).get();
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void setNewTopic(Topic topic) {
        // topics.add(topic);
        topicRepository.save(topic);
    }

    public void updateExistingTopic(Topic topic) {
        if (topicRepository.existsById(topic.getId()))
            topicRepository.save(topic);
    }

    public void deleteSpecificTopic(Integer id) {
        // topics.removeIf(t -> t.getId().equals(id));
        topicRepository.deleteById(id);
    }
    
}
