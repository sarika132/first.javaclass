public class UserInputArgs {
    public static void main(String[] args) {
        //The parameter String[] args taken array of input
        //when running from command line
        //You can compile java file with
        //java FileName.java
        //java FileName args1 args2
        System.out.println("First Args"+args[0]);
        System.out.println("Second Args"+args[1]);

        //The args on the datatype string, to convert or parse any args
        int argsParse1=Integer.parseInt(args[0]);
        int argsParse2=Integer.parseInt(args[1]);
        System.out.println("Sum of args"+(argsParse1+argsParse2));
    }
    
}
