package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.courseDao;
import com.example.demo.entities.Course;

@Service
public class courseServiceImpl implements courseService{
	//List<Course> list=new ArrayList<>();
	
	@Autowired
	private courseDao courseDao;
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		
		return this.courseDao.findAll();
	}

	@Override
	public Course getCourseById(long id) {
		// TODO Auto-generated method stub
//		
//		for(Course co:list)
//		{
//			if(co.getId()==id)
//			{
//				return co;
//			}
//		}
//		return null;
		
		return this.courseDao.getById(id);
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
//		list.add(course);
//		System.out.println(list);
		this.courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		return this.courseDao.save(course);
	}

	@Override
	public void deleteCourse(long id) {
		// TODO Auto-generated method stub
		this.courseDao.deleteById(id);
	}
	

}
