import java.lang.Math;



public class unit1APCSA {  //class name must match file name

    // this is a comment
    // to comment something use (comand + /)
    // make sure to comment your code often

    public static void main(String[] args){

        // int numbers;
        // numbers = 45;

        // System.out.println("Testing");
        // System.out.println();
        // System.out.println("Same thing in the class");
        // System.out.println(" Line");

        // // everything within the " " is what is printed. There is no spellcheck

        // System.out.println("Thisiis is a test ksrhfgkjw");

        // //even spaces, be careful with spaces

        // System.out.print("This ");
        // System.out.print("needs ");
        // System.out.print("spaces.");


        // //variables and data types
        // System.out.println("");
        // System.out.println("-----------");
        // System.out.println("-----------");

        // you create them in Java using the datatype and then variable name

        // intigers, whole numbers - int
        
        // numbers = 10;
        
        // System.out.println(numbers);

        // numbers = 56;
        // System.out.println(numbers);
        // System.out.println("-----------");

        // // //double used to decimals
        // double thisIsADecimal = 13.00000001;
        // System.out.println(thisIsADecimal);
        // System.out.println("-----------");

        // thisIsADecimal = numbers;
        // System.out.println(thisIsADecimal);
        // System.out.println("-----------");


        // // // //boolean used for true or false
        // int x = 34;
        // double y = 67.9;
        // boolean trueOrFalse = x<y;
        // System.out.println(trueOrFalse);
        // System.out.println("-----------");

        // // if we want to make a constant then we use the keyword final
        // final double pi = 3.14;      
        // System.out.println(pi);
        // System.out.println("-----------");

        // // // Strings are words
        // String user = "Bob";
        // int age = 57;
        // double gpa = 4.5;
        // System.out.println(user+" is "+age+" and his GPA is "+gpa);
        // System.out.println("-----------");

        // String admin = "Mr Soto";
        // char somethingElse = 'r';
        // String something = "Fun";
        // String admin2 = admin+" "+somethingElse+" "+something;
        // System.out.println(admin2);
        // System.out.println("-----------");


        // //you can also initialize a variable placeholder and use it later.
        // double someDecimal;
        // someDecimal = 45.89;
        // System.out.println(someDecimal);
        // System.out.println("-----------");


        // int a = 8;
        // double b = -4;
        // double c = a/b;
        // System.out.println(c);
        // System.out.println("-----------");
        

        // thisIsADecimal = 13.0000/55.0;
        // System.out.println(thisIsADecimal);
        // System.out.println("-----------");

        // thisIsADecimal = 5+(3*4)/6;
        // System.out.println(thisIsADecimal);
        // System.out.println("-----------");

        // The difference between numbers and strings
        // System.out.println(6);
        // System.out.println("Tom is "+(6+6));
        // System.out.println(6+6);
        // System.out.println("6"+"6");

        // System.out.println("-----------");
        // System.out.println("\"T"+"o"+"m\\"+"a"+"s\"");
        // System.out.println("-----------");

        // // assignement operator (=) go left to right
        // int apple = 4;
        // int x = apple;
        // int y = x = apple;
        // System.out.println(x);
        // System.out.println(apple);
        // System.out.println(y);
        // System.out.println("-----------");


        // Compound assignement operators

        System.out.println("-----------");

        // double compound = 5;

        // compound += 4;
        // //same as compound = compound + 4
        // System.out.println(compound);
        // System.out.println("-----------");

        // compound -= 4;
        // //same as compound = compound - 4
        // System.out.println(compound);
        // System.out.println("-----------");

        // compound *= 4;
        // //same as compound = compound * 4
        // System.out.println(compound);
        // System.out.println("-----------");

        // compound /= 4;
        // //same as compound = compound / 4
        // System.out.println(compound);
        // System.out.println("-----------");

        // compound = 20;
        // compound %= 4;
        // //same as compound = compound % 4
        // System.out.println(compound);
        // System.out.println("-----------");

        // double some = 5;
        // some *= 3/4.0;
        // System.out.println(some);
        // System.out.println("-----------");

        // compound = 20;
        // compound++;
        // //same as compound = compound + 1 or compound += 1
        // System.out.println(compound);
        // System.out.println("-----------");

        // compound--;
        // compound--;
        // compound--;

        
        // //same as compound = compound - 1 or compound -= 1
        // System.out.println(compound);
        // System.out.println("-----------");

        // casting variables


        //double newVar = 56.89;
        // System.out.println(newVar);
        // System.out.println("-----------");

        // System.out.println((int)newVar);
        // // // this is a temporary change
        // System.out.println(newVar);
        // System.out.println("-----------");
        // // System.out.println("-----------");

        // // if you want to make it permanent you have to save it.
        // int tomas = (int)newVar;
        // System.out.println(tomas);
        // System.out.println("-----------");

        // newVar = (int)newVar;
        // System.out.println(newVar);
        // System.out.println("-----------");

        // System.out.println(3/4);
        // System.out.println("-----------");
        // System.out.println(3/(double)4);
        // System.out.println("-----------");

        // // we can use this to round numbers
        // double division = 56.9;
        // System.out.println(division);
        // System.out.println("-----------");
        // System.out.println((int)(division+0.5));
        // System.out.println("-----------");

        // // //if we're rounding with negatives we have to -0.5
        // double negDivision = -15.0/4;
        // System.out.println(negDivision);
        // System.out.println("-----------");
        // System.out.println((int)(negDivision-0.5));
        // System.out.println("-----------");

        // // practice
        // System.out.println((int)(2.5*5));
        // System.out.println("-----------");
        // System.out.println((double)67/4);
        // System.out.println("-----------");
        // System.out.println((double)(2/4));
        // System.out.println("-----------");
        // System.out.println((int)2.5/4);
        // System.out.println("-----------");
        // System.out.println(12/5);
        // System.out.println("-----------");

        System.out.println(12+(6%6)*8);
        System.out.println("-----------");
        System.out.println(13/5.0);
        System.out.println("-----------");
        System.out.println((int)Math.pow(5, 3));
        System.out.println("-----------");
    


        




        












        


    }
    
}
