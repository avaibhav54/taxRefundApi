package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Course;

public interface courseDao extends JpaRepository<Course,Long> {

}
