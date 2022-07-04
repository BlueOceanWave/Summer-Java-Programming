
//Import the class we created since it's in a different folder
import Classes.Person; 

public class Lect06 {
    
    public static void main(String args[]){

        //Creating a Person object
        Person human = new Person("John", "Smith", 17);

        //Get the user age and print it out
        int age = human.getAge();
        System.out.println(age);
        

        //Change user age and print it out
        human.setAge(-9);
        age = human.getAge();
        System.out.println(age);


        
    }

}
