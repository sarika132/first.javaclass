import java.util.Scanner;

public class ResultInput {
    public static void main(String[] args) {
        // Task
        //Create a new file ResultInput
        //Create Scanner object to ask user for input
        //oop-> int
        //database->int
        //architecture->int
        //resit->boolean
        //calculate the avg
        //if result is true cap the avg to 40 is the value is more than 40
        //using printf print each marking
        //also print if the avg is greater or equal to 40-> "Good" else "Bad"
        
        
         Scanner myObj = new Scanner(System.in);  
         System.out.println("Enter username");

         String userName = myObj.nextLine();
         System.out.println("Username is:" +userName);

         int oop = 100;
         System.out.println(oop);
         int database = 1000;
         System.out.println(database);
         int architecture = 1000;
         System.out.println(architecture);
         boolean resit = false;
         System.out.println(resit);

    }
}