package io.richa.springdata.controller;

import io.richa.springdata.model.Course;
import io.richa.springdata.model.Topic;
import io.richa.springdata.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class CourseController {

    @Autowired
    CourseService courseService;


    @GetMapping(value = "/topics/{id}/courses")
    public List<Course> getAllCourse(@PathVariable String id) {

        return courseService.getAllCourse(id);
    }

    @PostMapping(value = "/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course) {
        course.setTopic(new Topic("topicId", "", ""));
        courseService.addCourse(course);
    }

    @PutMapping(value = "/topics/{topicId}/courses/{id}")
    public void updateCourse(@PathVariable String id, @RequestBody Course course, @PathVariable String topicId) {
        courseService.updateCourse(course);
    }

    @GetMapping(value = "/topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable String id) {
        return courseService.getCourse(id);
    }

    @DeleteMapping(value = "/topics/{topicId}/courses/{id}")
    public void deleteCourse(@PathVariable String id) {
        courseService.deleteCourse(id);
    }


}
