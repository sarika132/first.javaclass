public class UserOutput {
    public static void main(String[] args) {
        //Standard output/terminal output
        //countinuous printing
        System.out.println("This");
        System.out.println("is");
        System.out.println("Java\n");

        //Line break after printing
        System.out.println("Next print will start from next line");

        //Print using formating
        //%f floating point,%d integral, %s String(any)
        System.out.printf("Temperature %f degree celsius",30.22);
        //can use multiple placeholder
        System.out.printf("Name %s,Age %d, Weight %f", "Hero name",30,75.44);
        //The arrangement of placeholder and the value given after string must match
        //eg: 1%s String, 2%d integer, 3%f float
    
    }

}
