public class Lect02 {
        
    public static void main(String args[]){


        /* Data types: int, double, char, boolean 
           Variable Structure:
                Data_type identifier = value;

            Identifiers:
                Valid characters: a-z A-Z 0-9 _ $ 
                Can't start with a number (1person)
                Can't be a resered word (int, class, public, etc)
            
                General practice:
                    Start with a lowercase letter (or underscore)
                    Start new words with an uppercase letter (newWord)

        */

        //Creating some variables
        int age = 20;
        double decimal = 3.5;
        boolean lightIsRed = false;
        char _letter = 'h';

        //Printing out variable
        System.out.println("Hello world, " + age + " is a nice number");

        //Changing a variable
        System.out.println("My age is " + age);
        age = 21;
        System.out.println("My age is now " + age);


        //Multiple variables
        int x = 10, 
            y = 20, 
            w = 50, 
            h = 50;

        int a, b=5, c;


        double radius;  //Variable declaration
        radius = 5;     //Variable initialization



        /*
        Arithemetic operators (works for numbers like ints and doubles)
        +, -, /, *, %
        */ 

        //Examples
        int adding = 3 + 8;
        int subtracting = adding - 8;
        int multiplying = adding * subtracting;

        //Increase age by 1
        age = age + 1;


        //Division
        int num1 = 5,
            num2 = 10,
            num3 = 14;
        
        double decimal1 = 3.2,
               decimal2 = 5,
               result;

        System.out.println("\nDivision examples: " );
        System.out.println("10 (int) / 5 (int) = " + (num2 / num1));
        System.out.println("5 (int) / 10 (int) = " + (num1 / num2));
        System.out.println("14 (int) / 10 (int) = " + (num3 / num2));
        System.out.println("10 (int) / 5 (double) = " + (num2 / decimal2));
        System.out.println("5 (double) / 10 (int) = " + (decimal2 / num2));
        System.out.println("5 (double) / 3.2 (double) = " + (decimal2 / decimal1));
        
        

        //Updating variables
        int example = 5;

        //Adding 1 shorthands
        example = example + 1;
        example += 1;
        example++;

        //Subtracting 1 shorthands
        example = example - 1;
        example -= 1;
        example--;

        //Multiplying shorthands
        example = example * 2;
        example *= 2;
 
        //Division shorthands
        example = example / 2;
        example /= 2;
        
        //Modulous shorthands
        example = example % 5;
        example %= 5;

        
        // Getting the first digit of a number
        example = 587;
        example = example % 10; //Now stores the number 7


        // Casting (Convering from one data type to another)
        example = (int) 3.5;    //Downcasting (loses information)
        double example2 = (double) (5 + 6);   //Upcasting (no losing information)


        char letter = 'a';
        System.out.println("a is: " + ( (int) letter ));
        System.out.println("97 is: " + ( (char) 97 ));



    }

}
