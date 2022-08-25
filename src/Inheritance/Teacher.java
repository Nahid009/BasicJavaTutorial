package Inheritance;

public class  Teacher extends Person {
   // name, address, age, displayInformation:

    String qualification;

    void displayInformation2(){
        displayInformation();
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Age : "+age);
        System.out.println("Qualification : "+qualification);
    }
}
