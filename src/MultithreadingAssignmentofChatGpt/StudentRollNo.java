package MultithreadingAssignmentofChatGpt;

public class StudentRollNo extends Thread {
   public int rollno[]={1,2,3,4,5,6,7,8,9,10,11};
   synchronized public void run(){
       for(int i=0; i<rollno.length; i++){
           System.out.println("Student roll no is: "+rollno[i]);
           try {
               Thread.sleep(1000);
           }
           catch (Exception e){

           }
       }
   }
}
