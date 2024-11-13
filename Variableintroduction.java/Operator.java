public class Operator {
    public static void main(String[]args){
        //Arthmatic operator
        int intVar1=10,intVar2=20;
        int addOper=intVar1+intVar2;
        System.out.print(addOper);
        int minuOper=intVar1-intVar2;
        System.out.print(minuOper);
        int multOper=intVar1*intVar2;
        System.out.print(multOper);
        int divOper=intVar1/intVar2;
        System.out.print(divOper);
        int modOper=intVar1%intVar2;
        System.out.print(modOper);

        
        //Assignment Operator
        int assignVar = 10;
        System.out.print(assignVar);
        assignVar += 20;
        assignVar -=15;
        assignVar *= 2;
        assignVar /= 10;
        assignVar %=2;
        
        //Unary Operator
        int unaryVar=20;
        System.out.print(unaryVar);
        unaryVar ++;//unaryVar+=1;20+1;21
        unaryVar --;

        //Rational Operator
        int relVar1=20, relVar2 = 30;
        System.out.print(relVar1);
        System.out.print(relVar2);
        boolean equalOper= relVar1==relVar2;
        System.out.print(equalOper);
        boolean greaterOper=relVar1>relVar2;
        System.out.print(greaterOper);
        boolean lessOper=relVar1<relVar2;
        System.out.print(lessOper);
        boolean notequal= relVar1!=relVar2;
        System.out.print(notequal);

       // Logical operator
       int logVar1= 10, logVar2=20,logVar3=23;
       boolean andOper=true && true;
       System.out.print(andOper);
       boolean andOperVar=(logVar1<logVar2) && (logVar3==logVar2);//true and false
       System.out.print(andOperVar);
       boolean orOper= false ||false ||true;
       System.out.print(orOper);
       boolean orOperVar= (logVar1<logVar2)||(logVar3==logVar2);
       System.out.print(orOperVar);
       boolean notOper=!(logVar1<logVar2); //!true ->false
       System.out.print(notOper);


       //Ternary Operator
       //String status;
       //int marking=40;
       //if(marking>40){
       //status = "pass"
       //else;
       //status ="fail"
       //}

       int marking=40;
       String status=(marking>40)?"Pass":"fail";
       System.out.print("Status:"+status);

       //Task
       //Add the following variable
       //oppmarking-> int
       //architectureMaring->int
       //databaseMarking->int
       //creativethinkingMarking->int
       //make a float avg ahd calcualte the avg of the marking
       //make the boolean expression to check if
       //all the marking is greater and equal to 40
       //and check if the avg is greater than 50
       //make a result->String and check the boolean
       // if true than good job and if false bad job
       //Print result

       int oopMarking = 40;
          int architectureMarkingMarking = 45;
          int databaseMarkinng= 30;
          int creativethinkingMarking =50;
          float avg = (float) (oopMarking+architectureMarkingMarking+databaseMarkinng+creativethinkingMarking)/4;
          boolean check = oopMarking >=40 && databaseMarkinng >= 40
          && architectureMarkingMarking >=40 && creativethinkingMarking >= 40 && avg >=50;
          String result = check? "Good Job": "Bad Job";
          System.out.println(result);
 
    }
}