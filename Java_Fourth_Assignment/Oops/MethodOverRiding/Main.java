package Oops.MethodOverRiding;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();  // Output : Animal makes a sound

        Animal dog = new Dog();
        dog.sound();  // Output : Dog barks

        Animal cat = new Cat();
        cat.sound(); // output : Cat Mea
    }
}
