/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author Professional
 */
public abstract class ProgrammingCourse {
    
    private String courseName;
    private String courseNumber;
    private String prerequisites;
    
    
    // Abstract methods
    
    public abstract void setCredits(double credits);
    public abstract double getCredits() ;
    
    // Setters
    
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
 
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
    
    public final void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
    }

    // Getters
    
    public final String getCourseName() {
        return courseName;
    }
    
    public final String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }
     
    public final String getCourseNumber() {
        return courseNumber;
    } 
   
    public final String getPrerequisites() {
        return prerequisites;
    }

 
}
    
   
    
    

