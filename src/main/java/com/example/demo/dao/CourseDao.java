package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

	List<Course> findAll();

	
	

}
