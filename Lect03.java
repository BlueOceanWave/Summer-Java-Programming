public class Lect03 {
    public static void main(String args[]){

        /*  
         * 
         * General Structure of if Statements:
         * if (condition1) {
         *      //Runs if condition1 is true
         * }
         * else if (condition2){
         *      // Runs if condition2 is true and condition1 is false
         * }
         * else {
         *      // Runs if condition1 and condition2 are false
         * }
         * 
         * 
         * General Structure of switch statements
         * switch (variable) {
         *      case value1: 
         *          //Runs if variable == value1
         *          break;
         *      case value2: 
         *          //Runs if variable == value2
         *          break;
         *      default:
         *          //Runs if nothing was true
         *          break;
         * }
         * 
         * 
         * 
         * Condition always evaluate to boolean expressions (true or false)
         * 
         * Comparison operators:
         * == (equality)
         * != (not equal to)
         * >  (greater than)
         * <  (less than)
         * >= (greater than or equal to)
         * <= (less than or equal to)
         * 
         * Logic operators:
         * && (AND) - returns true when both sides are true
         * || (OR)  - returns true when at least one side is true
         * ^  (XOR) - returns true if exactly one side is true
         * !  (NOT) - returns the opposite
         */

         
    

        

         //Using arithmetic in boolean expressions
        int x = 10, y = 5;
        
        if ( (x+7)/2 == y%4 && x>y) {
            //Code to run
        }

        //Nesting if/else statements
        int num1 = 5, num2 = 10;

        if (num1 == num2) {
            System.out.println("equal");
        }
        else{
            if (num1 > num2) {
                System.out.println("greater");
            }
            else{
                System.out.println("less");
            }
        }


        //Using if, else if, and else statements
        int grade = 72;
        if (grade >= 90) {
            System.out.println("A");
        }
        else if (grade >= 80) {
            System.out.println("B");
        }
        else if (grade >= 70) {
            System.out.println("C");
        }
        else if (grade >= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
        

        //Using switch statements
        char letterGrade = 'P';

        switch (letterGrade) {
            case 'A': 
                System.out.println("90+"); 
                break;   
            case 'B': 
                System.out.println("80-89"); 
                break;
            case 'C': 
                System.out.println("70-79"); 
                break;
            case 'D': 
                System.out.println("60-69"); 
                break;
            case 'F': 
                System.out.println("< 60"); 
                break;
            default: 
                System.out.println("Not a valid grade");
                break;
        }

         



        
         
        


    }
}
