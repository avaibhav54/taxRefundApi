package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Course;

public interface courseService {

	public List<Course> getCourses();
	public Course getCourseById(long id);
	public Course addCourse(Course course);
	public Course updateCourse(Course course);
	public void deleteCourse(long id);
	
}
