package io.richa.springdata.repository;

import io.richa.springdata.model.Course;
import io.richa.springdata.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course,String > {



    public  List<Course> findByTopicId(String topicId);

}
