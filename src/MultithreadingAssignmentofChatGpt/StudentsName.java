/*Thread Creation and Basics:
Create a Java program that demonstrates the basic creation and running of
 threads using the Thread class and the Runnable interface. Include examples of both approaches.
 1) create  a student name and roll no threds in that display student name and rollno one by one
 2) create classroom class and call as main function.
 */
//using Thread class

package MultithreadingAssignmentofChatGpt;

public class StudentsName extends Thread  {
    public String name[]={"Suraj", "Rutvik","Sumit", "Vijay", "Jay","GyariLu", "Harry", "Dustin", "Lucus", "Mike", "Jhonthan"};
   synchronized public void run (){
        for(int i=0; i<name.length; i++){
            System.out.println("Student name is: "+name[i]);
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }

}
