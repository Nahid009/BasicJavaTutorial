package ObjectOrientedProgramming;

public class Teacher2 {
    public static void main(String[] args) {


       // Another Way
        /*Teacher teacher1; //Object
        teacher1 = new Teacher(); //Create Object
         */

        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();

        teacher1.name = "Nahid Hasan";
        teacher1.gender = "Male";
        teacher1.age = 25;
        teacher1.phone = 1234567890;

        teacher1.displayInformation();


        System.out.println();


        teacher2.name = "Nirjona";
        teacher2.gender = "Female";
        teacher2.phone = 1745154914;
        teacher2.age = 23;

        teacher2.displayInformation();
    }
}
