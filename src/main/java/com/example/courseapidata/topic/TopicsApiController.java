package com.example.courseapidata.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicsApiController {
    @Autowired
    TopicService topicService = new TopicService();

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopicById(@PathVariable Integer id) {
        return topicService.getTopicById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void setNewTopic(@RequestBody Topic topic) {
        topicService.setNewTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics")
    public void updateExistingTopic(@RequestBody Topic topic) {
        topicService.updateExistingTopic(topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteSpecificTopic(@PathVariable Integer id) {
        topicService.deleteSpecificTopic(id);
    }

}
