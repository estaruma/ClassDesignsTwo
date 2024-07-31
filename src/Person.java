
// Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.
public class Person {

    //attribute

    private String name;

    private int age;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

   //method
    public void personDetails() {
        System.out.println(name + age);
    }

    //instances of person class
    public static void main(String[] args) {
        Person person1 = new Person("Miso: ", 1);
        Person person2 = new Person("Mocha: ", 2);


        // display

        person1.personDetails();
        person2.personDetails();

    }




}
