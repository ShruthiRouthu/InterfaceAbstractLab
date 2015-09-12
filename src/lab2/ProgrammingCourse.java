
package lab2;

public interface ProgrammingCourse {
    
    public abstract void setCourseName(String courseName);
    public abstract String getCourseName();
    
    public abstract void setCourseNumber(String courseNumber);
    public abstract String getCourseNumber();
    
    public abstract void setPrerequisites(String prerequisites);
    public abstract String getPrerequisites();
    
    public abstract void setCredits(double credits);
    public abstract double getCredits() ;
    
}
