package MultithreadingAssignmentofChatGpt;

public class Classroom {
    public static void main(String[] args){
        StudentsName studentname= new StudentsName();
        StudentRollNo rollNumbers= new StudentRollNo();
        studentname.start();
        rollNumbers.start();
    }
}
