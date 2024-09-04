package com.mycompany.studentlst;

import java.util.Scanner;

/**
 * @author Ebubekir Karaoglu
 */
public class StudentLst {

    public static void main(String[] args) {
        Student[] students= new Student[2];
        Scanner inScanner = new Scanner(System.in);
        
        for(int i=0; i< students.length;i++){
            System.out.print("Enter student's name: ");
            String name = inScanner.nextLine();
            Student student = new Student(name);
            
            students[i]= student;
            
        }
        System.out.println(printOutput(students));
    }
    
    public static String printOutput(Student[] students){
        String str = ""; // Initialize empty string

        // array of students
        for (Student student : students) {
            if (student != null) { // NullPointerException check
                str += student.getName() + "\n";
            }
        }

        return str;
    }
    
    
}
