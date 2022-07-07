
//Import the class we created since it's in a different folder
import Classes.Person; 

import java.lang.Math;
import java.util.Scanner;

public class Lect06 {
    
    public static void main(String args[]){

        //Creating Person objects
        Person person1 = new Person("John", "Smith", 17);
        Person person2 = new Person("Will", "Johnson", 26);
        Person person3 = new Person("Samantha", "Johnson", 25, "01/05/1997");
        
        //Get the user age and print it out
        int age = person1.getAge();
        System.out.println("Person 1 age is " + age);

        //Change user age and print it out
        person1.setAge(-9);
        age = person1.getAge();
        System.out.println("Person 1 age is " + age);
        
        //A default date of birth is given if not defined
        System.out.println("Person 1 date of birth: " + person1.getDOB());
        System.out.println();


        //Creating an alias of person1 (they share the same memory address)
        Person copy = person1;

        //Aliases are linked to their original object
        System.out.println("person1 age: "+person1.getAge() + ", copy age: " + copy.getAge());

        person1.setAge(24); //Updating person1 updates copy as well
        System.out.println("Changed person1 age to ");
        System.out.println("person1 age: "+person1.getAge() + ", copy age: " + copy.getAge());
        System.out.println();

    
        // Custom equal method
        System.out.println("person1 == person2: " + person1.equal(person2));

        //Calling toString (both lines are equivalent)
        System.out.println("toString method: " + person2.toString());
        System.out.println("toString method: " + person2);


        //Calling a static method
        Person.greeting();


        
    }

}
