package io.richa.springdata.service;

import io.richa.springdata.model.Course;
import io.richa.springdata.model.Topic;
import io.richa.springdata.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

public void addCourse(Course  course){

    courseRepository.save(course);
}
public List<Course> getAllCourse(String topicId){
    List<Course> courses = new ArrayList<>();

     courseRepository.findByTopicId(topicId).
             forEach(courses::add);
    return courses;
}

public Course getCourse(String id){

    return courseRepository.getOne(id);
}
public void updateCourse(Course course){
    courseRepository.save(course);
}
public void deleteCourse(String id){

    courseRepository.deleteById(id);
}
}

