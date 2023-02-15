package com.example.studentmanagement.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="course")
public class Course
{
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Long id;
private String course_name;
private int course_duration;
 
public Long getId() {
return id;
}
 
public void setId(Long id) {
this.id = id;
}
 
public String getCourse_name() {
return course_name;
}
 
public void setCoursename(String course_name) {
this.course_name = course_name;
}
 
public int getDuration() {
return course_duration;
}
 
public void setDuration(int course_duration) {
this.course_duration = course_duration;
}
}