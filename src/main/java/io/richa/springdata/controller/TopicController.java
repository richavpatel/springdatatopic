package io.richa.springdata.controller;

import io.richa.springdata.model.Topic;
import io.richa.springdata.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/topics")
public class TopicController {

    @Autowired
    TopicService topicService;

    @PostMapping
    public @ResponseBody
    Topic addTopic(@RequestBody Topic topic) {
        return topicService.addTopic(topic);
    }

    @GetMapping
    public List<Topic> getAllTopic() {
        return topicService.getAllTopic();
    }

    @GetMapping(value = "/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @PutMapping(value = "/{id}")
    public Topic updateTopic(@PathVariable String id, @RequestBody Topic topic) {
        return topicService.updateTopic(id, topic);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }


}
