package io.richa.springdata.service;

import io.richa.springdata.model.Topic;
import io.richa.springdata.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

    @Autowired
    TopicRepository topicRepository;

public Topic addTopic(Topic  topic){
    return topicRepository.save(topic);
}
public List<Topic> getAllTopic(){
    return topicRepository.findAll();
}

public Topic getTopic(String id){
    return topicRepository.findById(id).get();
}
public Topic updateTopic(String id, Topic topic){
    topic.setId(id);
    return topicRepository.save(topic);
}
public void deleteTopic(String id){
    topicRepository.deleteById(id);
}
}

