package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Course;
import com.example.demo.services.courseService;

@RestController
public class myController {
	
	@Autowired
	public courseService courseService;

	@GetMapping("/home")
	public String home() {
		return "This is Welcome page";
	}
	//get the courses
	
	@GetMapping("/courses")
	public List<Course> getCourse()
	{
		return this.courseService.getCourses();
	}
	
	@GetMapping("/course/{cid}")
	public Course getCourse(@PathVariable("cid") String cid)
	{
		long id=Long.parseLong(cid);
		return this.courseService.getCourseById(id);
	}
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseService.addCourse(course);
		 
	}
	
	@PutMapping("/course")
	public Course updateCourse(@RequestBody Course course)
	{
		return this.courseService.updateCourse(course);
	}
	
	
	@DeleteMapping("/course/{cid}")
	public void deltetCourse(@PathVariable("cid") String cid)
	{
		long id=Long.parseLong(cid);
		 this.courseService.deleteCourse(id);
				
	}
}
