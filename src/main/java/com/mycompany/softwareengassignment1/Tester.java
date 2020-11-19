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
        
        Student student = new Student("Luke", 21, "2002-01-01", 173);
       
        System.out.println("Username= " + student.getUsername());
        
        
        
        
        
        
       
        
    }
    
}
