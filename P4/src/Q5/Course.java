package Q5;

public class Course {
    private String courseTitle;
    private double feesPerStudent;
    private int noOfStudent;
    private String [] studentName = new String[100];
    private static int courseCount = 0;

    public Course(String courseTitle , double feesPerStudent){
        this.courseTitle = courseTitle;
        this.feesPerStudent = feesPerStudent;
        noOfStudent = 0;
        courseCount++;
    }

    public String getcourseTitle(){
        return courseTitle;
    }

    public double getfeesPerStudent(){
        return feesPerStudent;
    }

    public int getnoOfStudent(){
        return noOfStudent;
    }

    public String[] getstudentName(){
        return studentName;
    }

    public int getcourseCount(){
        return courseCount;
    }

    public void setcourseTitle(String courseTitle){
        this.courseTitle = courseTitle;
    }

    public void setfeesPerStudent(double feesPerStudent){
        this.feesPerStudent = feesPerStudent;
    }

    public void addStudent(String studentName){
        this.studentName[noOfStudent] = studentName;
        noOfStudent++;
    }

    public double calcFeeCollected(){
        return feesPerStudent * noOfStudent;
    }

    public String toString(){
        return String.format("%-15s %-10.2f %-10d %-10.2f", courseTitle, feesPerStudent, noOfStudent, calcFeeCollected());
    }
}
