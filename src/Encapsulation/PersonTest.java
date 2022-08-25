package Encapsulation;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
       p1.setName("Nahid");
        System.out.println(p1.getName());
        p1.setAge(25);
        System.out.println(p1.getAge());

    }
}
