// Base class
public class Animal {
    public void sound() {
        System.out.println("Animal sound");
    }
}

// Derived class Dog overriding the sound method
public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Derived class Cat overriding the sound method
public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        myDog.sound();  // Dog barks
        myCat.sound();  // Cat meows
    }
}
