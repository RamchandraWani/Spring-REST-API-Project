package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CourseDao;
import com.example.demo.entity.Course;
@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseDao courseDao;
	
	List<Course> list;
	
	public CourseServiceImpl() {
		
		super();
		
//		list = new ArrayList<>();
//		list.add( new Course((long) 145 ,"java Core Course", " this course contains basic of java"));
//		list.add( new Course(4343,"Spring Boot course"," creating rest api using spring boot"));
		


		// TODO Auto-generated constructor stub
	}



	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
//		return list;
		return courseDao.findAll();
	}



	@Override
	public Course getCourse(long courseId) {
//		 Course c= null;
//		 for (Course course :list) 
//			 if (course.getId() == courseId) {
//				 c = course;
//				 break;
//			 }
		 
			 
		// TODO Auto-generated method stub
//		return c;
		
		return courseDao.getOne(courseId);
	}



	@Override
	public Course addCourse(Course course) {
		
//		list.add(course);
//		return course;
		// TODO Auto-generated method stub
		courseDao.save(course);
		return (course);
		
	}



	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		
		courseDao.save(course);
		return course;
	}



	@Override
	public void deleteCourse(long parseLong) {
		
//		list = this.list.stream().filter(e->e.getId()!= parseLong).collect(Collectors.toList())	;	// TODO Auto-generated method stub
		Course entity= courseDao.getOne(parseLong);
		courseDao.delete(entity);
		
	}



	
	}
	


