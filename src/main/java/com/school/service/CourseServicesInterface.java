package com.school.service;

import com.school.beans.Course;

import java.util.List;

public interface CourseServicesInterface {

    //Get method
     List<Course> getAllCourses();

    //Create method
     Course save(Course course);

     //findById method
    Course findById(Long id);

    //Update method
    Course  update(Long id);
//    Course  updateCourse(Course course);

    //Delete method
    void delete(Long id);


}
