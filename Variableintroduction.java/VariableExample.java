public class VariableExample {
    //Instance Variable
    int instanceVariable=100;
    //instance variable can only be accessed with object
    //static varible
    static boolean staticVariable=false;
    //staticVariable can be accesssed with class directly
    void firstFunction(){
        int localVariable=300;
        //local variable are made inside a function/contructer scope/block
        System.out.println("localVariable:"+localVariable);
    }
    public static void main(String[] args){
        int localVariable2=400;
        System.out.println("localVariable:"+localVariable2);
        //to use the instance variableof a class,make object
        //Syntax:ClassName objVariable =new ClassName();
        VariableExample variableExampleObj=new VariableExample();
        //the variable of VariableExammple is called object,here variableExampleobj
        variableExampleObj.instanceVariable=600;
        System.out.println("Intance Variable:" +variableExampleObj.instanceVariable);
        //Static variable can be accessed with,ClassName.variableName
        System.out.println("Static Variable:" +VariableExample.staticVariable); 
        VariableExample variableExampleObj2= new VariableExample();
        variableExampleObj2.instanceVariable=340;
        System.out.println(variableExampleObj2.instanceVariable); 
        VariableExample.staticVariable=true;

        byte byteVariable=10;
        short shortVariable=byteVariable;//here byte is automatically converted into short
        System.out.println(shortVariable);

        int mathMark=20;
        double mathConverted=mathMark;//int is automatically converted into double->20.0
        System.out.println("Int to double"+mathConverted);
        
        //Narrowing Casting/Explicit Casting/Manual
        double gpa =3.4;
        int gpaInt = (int) gpa;
        System.out.println("GPA int"+ gpaInt);
        int floatConversion=(int) 400.33f; //400
        System.out.println(floatConversion);

        //Calculation
        float mathCalc= 1/2; //1/2 in int is 0->0.0
        System.out.println(mathCalc);
        float mathCalcSolve=1.0f/2;//either one value float
        float mathCalcSolve2=(float) 1/2; //or manual cast
        System.out.println(mathCalcSolve);
        System.out.println(mathCalcSolve2);
        
        // Task
        // Make  an instance variable firstName
        // Make a new object and print the firstName
        //Calculate and print the following
        // double avg
        //float pct=411/100

    }

}
