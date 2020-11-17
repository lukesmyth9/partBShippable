/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwareengassignment1;

/**
 *
 * @author lukej
 */
public class Module {
    
    String moduleName;
    String ID;
    Course[] courses;
    Student[] students;
    
    public Module(String moduleName, String ID, Course[] courses, Student[] students)
    {
        this.moduleName = moduleName;
        this.ID = ID;
        this.students = students;
        this.courses = courses;
    }

//Mutators
    public void setModuleName(String moduleName)
    {
        this.moduleName = moduleName;
    }

public void setID(String ID)
{
    this.ID = ID;
}
public void setCourses(Course[] courses)
{
    this.courses = courses;
}
public void setStudents(Student[] students)
{
    this.students = students;
}
//Accessors
public String getModuleName()
{
    return this.moduleName;
}
public String getID()
{
    return this.ID;
}
public Course[] getCourses()
{
    return this.courses;
}
public Student[] getStudents()
{
    return this.students;
}





}
