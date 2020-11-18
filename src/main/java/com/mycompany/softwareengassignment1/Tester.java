package com.mycompany.softwareengassignment1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukej
 */
//import org.junit.Assert;
import org.junit.Test;
public class Tester {

    /**
     * @param args the command line arguments
     */
    @Test
    public static void main(String[] args) {
        Tester test = new Tester();
        test.Tester();
    }
    
    public void Tester()
    {
        //creation of two of each for testing
        Module module = new Module("CT401", "Computers");
        Module module1 = new Module("EE343", "Telecommunications");
        Student student = new Student("Luke", 21, "2002-01-01", 173);
        Student student1 = new Student("Michael", 21, "1999-06-10", 174);
        Course course = new Course("Electronic/Computer Engineering", "2018-08-09", "2022-05-28");
        Course course1 = new Course("Electronic/Electrical Engineering", "2018-08-09", "2022-05-28");
        
        
        //Course Testing
        course.addModule(module);
        course.addModule(module1);
        course.addStudent(student);
        course.addStudent(student1);
        
        course.courseInformation(course);
        
        //Module Testing
        System.out.println("\n-----------------------------------------");
        module.addCourseToModule(course);
        module.addCourseToModule(course1);
        module.addStudentToModule(student);
        module.addStudentToModule(student1);
        
        module.moduleInformation(module);
  
        //Student Testing
        System.out.println("\n---------------------------------------");
        student.addCourseToStudent(course);
        student.addModuleToStudent(module);
        student.addModuleToStudent(module1);
        
        student.studentInformation(student);
        
        
        
        //Test showing concatenation of Name + age to get username
        System.out.println("\n---------------------------------------");
        System.out.println("Username= " + student.getUsername());
        
        
        
        
        
        
       
        
    }
    
}
