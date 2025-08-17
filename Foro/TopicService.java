package com.foro.service;

import com.foro.model.Topic;
import com.foro.repository.TopicRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TopicService {

    private final TopicRepository repository;

    public TopicService(TopicRepository repository) {
        this.repository = repository;
    }

    public List<Topic> getAllTopics() {
        return repository.findAll();
    }

    public Topic createTopic(Topic topic) {
        return repository.save(topic);
    }

    public void deleteTopic(Long id) {
        repository.deleteById(id);
    }
}
