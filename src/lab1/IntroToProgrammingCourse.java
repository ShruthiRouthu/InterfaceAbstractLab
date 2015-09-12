package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse  extends ProgrammingCourse{
    
    private double credits ;

    // Constructors
    public IntroToProgrammingCourse(String courseName, String courseNumber, String prerequisites,double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setPrerequisites("none");
        this.setCredits(credits);
    }
    
    public IntroToProgrammingCourse(){
       this.setCourseName("Not assigned");
       this.setCourseNumber("Not assigned");
       this.setPrerequisites("none");
       this.credits = 0.0;
    }
    
  
    @Override
    public final double getCredits() {
        return credits;
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

       
}
