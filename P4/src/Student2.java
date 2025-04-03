public class Student2 {
    private String Student_ID;
    private String name;
    private int NoOfQuizTaken;
    private double TotalScore;
    private static double contribution;

    public Student2(){
        this("", "");
    }

    public Student2(String Student_ID, String name){
        this.Student_ID = Student_ID;
        this.name = name;
    }

    public String getStudentID(){
        return Student_ID;
    }

    public String getName(){
        return name;
    }

    public int getNoOfQuizTaken(){
        return NoOfQuizTaken;
    }

    public double getTotalScore(){
        return TotalScore;
    }

    public double getContribution(){
        return contribution;
    }


    public void setStudentID(String studentID){
        Student_ID = studentID;
    }

    public void setName(String studentName){
        name = studentName;
    }

    public static void setContribution(double contribution){
        Student2.contribution = contribution;
    }

    public double getAverageScore(){
        return TotalScore / NoOfQuizTaken;
    }


    public void addQuiz(int score){
        TotalScore += score;
        NoOfQuizTaken++;
    }








}
