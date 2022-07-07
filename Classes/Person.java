
package Classes;

public class Person {

    //Class Data
    private String firstName, lastName, dob;
    private int age, ID;

    private static int count = 0;

    //Constructor
    public Person (String firstName, String lastName, int age) {
       this(firstName, lastName, age, "0/0/0");
    }

    public Person (String firstName, String lastName, int age, String dob){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.ID = count;

        //Perform a check on the age
        if (age<0) {
            this.age = 0;
        }
        else {
            this.age = age;
        }

        count++;

    }

    public static void greeting(){
        System.out.println("Hello, I am a person " + count);
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

    public String getDOB(){
        return dob;
    }


    private String upperCaseName(){
        return firstName.toUpperCase() + " " + lastName.toUpperCase();
    }

    public boolean equal(Person p){
        boolean isEqual = (this.firstName == p.firstName) &&
                          (this.lastName == p.lastName) &&
                          (this.age == p.age) &&
                          (this.dob == p.dob);

        return isEqual;
    }

    public String toString(){
        return upperCaseName() + ", " + age;
    }

}