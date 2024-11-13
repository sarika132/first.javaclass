public class SwitchCaseStatement {
        public static void main(String[]args){
            int day = 1;
            switch (day){
                //day == 0 
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                default:
                    System.out.println("Unknown day");
                    break;
            }
            //nest switch statement
            int status=404;
            switch(status){
                //status == 200 ||status==201|| status==202
                case 200:
                case 201:
                case 202:
                    System.out.println("Success");
                    break;
            //status==401 ||status==404
                case 401:
                case 404:
                    System.out.println("Not found");
                    break;
                default:
                   System.out.println("Unknown status");
                   break;
            }

            //Switch case or
            int status=404;
            switch(status){
                //status == 200 ||status==201|| status==202
                case 200:
                case 201:
                case 202:
                    System.out.println("Success");
                    break;
            //status==401 ||status==404
                case 401:
                case 404:
                    System.out.println("Not found");
                    break;
                default:
                   System.out.println("Unknown status");
                   break;
            }

            //Task1
            //Make an int month and assign value
            //int month=4;
            //using switch case check the month and print the following
            //0-> jan
            //1-> Feb
            //2-> mar
            //3-> jun
            //..continue each month till 11
            //11->dec
            //else->Unknown month

            //Task 2
            //make a variable String locale and assign "np"
            //String locale="np"
            //using switch case check the and print the following
            //"en" or "en//us" or "en/uk" -> "Selected english"
            //"in"-> "Selected Indian"
            //"jp"-> "Selected Japanese"
            //"np"-> "Selected Nepali"
            //else -> "Unknown locale"
            
            //Task 1
            int month = 3;
            switch (month){
                case 1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("mar");
                break;
            case 4:
                System.out.println("apr");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("jun");
                break;
            case 7:
                System.out.println("jul");
                break;
            case 8:
                System.out.println("aug");
                break;
             case 9:
                System.out.println("set");
                break;
            case 10:
                System.out.println("oct");
                break;
                case 11:
                System.out.println("nov");
                break;
                case 12:
                System.out.println("dec");
                break;
            default:
                System.out.println("Unknown month");
                break;

            }

            //Task 2int 
            status=404;
            switch(status){
                //status == 200 ||status==201|| status==202
                case 200:
                case 201:
                case 202:
                    System.out.println("Success");
                    break;
            //status==401 ||status==404
                case 401:
                case 404:
                    System.out.println("Not found");
                    break;
                default:
                   System.out.println("Unknown status");
                   break;
            }

      }      
}   


//git inti
//git 
