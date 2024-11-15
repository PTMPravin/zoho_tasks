package Oops.MethodOverLoading.Person;

public class Person {
    private String name;
    private int age;
    private String address;
    
    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.address = "Address";
    }
    
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = "Address";
    }
    
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
    
    public static void main(String[] args) {
        
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob", 30);
        Person person3 = new Person("Charlie", 25, "123 Main St");
    
        System.out.println("Person 1 Details:");
        person1.displayDetails();
            
        System.out.println("\nPerson 2 Details:");
        person2.displayDetails();
            
        System.out.println("\nPerson 3 Details:");
        person3.displayDetails();
    }
    
}
