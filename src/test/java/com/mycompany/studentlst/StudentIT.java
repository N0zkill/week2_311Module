/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.studentlst;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MoaathAlrajab
 */
public class StudentIT {
    
    Student s;
    
    public StudentIT() {
        s = new Student("James");
    }

    @Test
    public void testGetName() {
        s.setName("Moaath Alrajab");
        assertEquals("Moaath Alrajab", s.getName());
    }
  
        @Test
    public void testGetName3() {
        s.setName("Alrajab");
        assertEquals("Alrajab", s.getName());
    }
    
        @Test
    public void testGetName2() {
        s.setName("Moaath");
        assertEquals("Moaath", s.getName());
    }
    
            @Test
    public void testGetName4() {
        assertEquals("Printing the output "
                + "The student's name is James \n", StudentLst.printOutput(new Student[]{s}));
    }
    
    
}
