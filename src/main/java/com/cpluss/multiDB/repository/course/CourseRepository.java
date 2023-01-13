package com.cpluss.multiDB.repository.course;

import com.cpluss.multiDB.model.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
