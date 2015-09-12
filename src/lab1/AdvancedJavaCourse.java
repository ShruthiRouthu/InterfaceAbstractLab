package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse {
    
    private double credits ;

    public AdvancedJavaCourse(String courseName, String courseNumber, String prerequisites,double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setPrerequisites(prerequisites);
        this.setCredits(credits);
    }
    
    public AdvancedJavaCourse(){
       this.setCourseName("Not assigned");
       this.setCourseNumber("Not assigned");
       this.setPrerequisites("Not assigned");
       this.credits = 0.0;
    }
   
    @Override
    public final void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    @Override
    public final double getCredits() {
        return this.credits;
    }
       
}
