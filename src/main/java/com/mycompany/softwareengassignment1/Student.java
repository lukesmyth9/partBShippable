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
public class Student {
    //instance variables
    Course[] courses;
    Module[] modules;
    
    String name;
    int age;
    String dateOfBirth;
    int ID;
    String username;
   
    public Student(String name, int age, String dateOfBirth, int ID, Course[] courses, Module[] modules)
    {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.ID = ID;
        this.courses = courses;
        this.modules = modules;
    }
    
//Mutator methods
    
public void setName(String name)
{
    this.name = name;
}
public void setAge(int age)
{
    this.age = age;
}
public void setDateOfBirth(String dateOfBirth)
{
    this.dateOfBirth = dateOfBirth;
}
public void setID(int ID)
{
    this.ID = ID;
}
public void setCourses(Course[] courses)
{
    this.courses = courses;
}
public void setModules(Module[] modules)
{
    this.modules = modules;
}


    //getters
public String getName()
{
    return this.name;
}
public int getAge()
{
    return this.age;
}
public String getDateOfBirth()
{
    return this.dateOfBirth;        
}
public int getID()
{
    return this.ID;
}
public Course[] getCourses()
{
    return this.courses;
}
public Module[] getModules()
{
    return this.modules;
}

public String getUsername() 
{
    this.username = this.name + this.age;    
    return username;
}
   
    
    
}
