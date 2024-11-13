import java.util.Scanner;

public class UserPrint {
    public static void main(String[] args) {
        //To take user import Scanner class at the top of the file
        //import java.util.Scanner
        //Make an object of a scanner and take input from object
        Scanner scan=new Scanner(System.in);
        System.out.println("You age:");
        int ageInput=scan.nextInt();
        System.out.println("You are"+ageInput);

        System.out.println("Over 18?");
        boolean over18Input=scan.nextBoolean();
        System.out.println(over18Input);

        System.out.println("You weight:");
        double weightInput=scan.nextDouble();
        System.out.println(weightInput);

        //After using scanner for primitive data and want input for string
        //you need to clear the enter input
        scan.nextLine();
        System.out.println("You name?");
        String name=scan.nextLine();
        System.out.println(name);
        scan.close();//must close scanner object to avoid input locks
    }
}
