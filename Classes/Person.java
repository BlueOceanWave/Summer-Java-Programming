
package Classes;

public class Person {

    //Class Data
    private String firstName, lastName;
    private int age;

    //Constructor
    public Person (String userFirstName, String userLastName, int userAge) {
        firstName = userFirstName;
        lastName = userLastName;

        //Perform a check on the age
        if (userAge<0) {
            age = 0;
        }
        else {
            age = userAge;
        }
    }


    /*
     * Methods:
     *  public/private
     *  Return type (void)
     *  Identifer
     *  Paramters
     *  Code
     */


    // Getter method
    public int getAge() {
        return age;
    }

    // Setter method
    public void setAge(int newAge){  

        if (newAge < 0) {
            newAge = 0;
        }
    
        age = newAge;

    }

}