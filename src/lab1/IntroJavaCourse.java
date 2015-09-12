package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse {
    
    private double credits ;
   
    // Constructors
    public IntroJavaCourse(String courseName, String courseNumber ,String prerequisites,double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setPrerequisites("none");
        this.setCredits(credits);
    }

    public IntroJavaCourse(){
       this.setCourseName("Not assigned");
       this.setCourseNumber("Not assigned");
       this.setPrerequisites("Not assigned");
       this.credits = 0.0;
    }
   

    @Override
    public final double getCredits() {
        return credits;
    }

    @Override
    public final void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

}
