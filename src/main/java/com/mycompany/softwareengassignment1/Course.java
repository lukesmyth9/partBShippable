/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwareengassignment1;
import org.joda.time.DateTime;
/**
 *
 * @author lukej
 */
public class Course {
    
    String courseName;
    Module[] modules;
    Student[] students;
    DateTime startDate;
    DateTime endDate;
    
    public Course(String courseName, Module[] modules, Student[] students, DateTime startDate, DateTime endDate)
    {
        this.courseName = courseName;
        this.modules = modules;
        this.students = students;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    //Mutator methods
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }
    
    public void setModules(Module[] modules)
    {
        this.modules = modules;
    }
    
    public void setStudents(Student[] students)
    {
        this.students = students;
    }
    
    public void SetStartDate(DateTime startDate)
    {
        this.startDate = startDate;
    }
    public void setEndDate(DateTime endDate)
    {
        this.endDate = endDate;
    }
    
    //Accessor Methods
    public String getCoyrseName()
    {
        return this.courseName;
    }
    public Module[] getModules()
    {
        return this.modules;
    }
    public Student[] getStudents()
    {
        return this.students;
    }
    public DateTime getStartDate()
    {
        return this.startDate;
    }
    public DateTime getEndDate()
    {
        return this.endDate;
    }
    
}
