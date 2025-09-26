public class Abstract_Class {
    public static void main(String[] args) {
        Dog labradour = new Dog();
        System.out.println(labradour.color);
    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("animal constructor called");
    }

    void breathe() {
        System.out.println("Breathe");
    }

    abstract void walk();
}

class Dog extends Animal {
    Dog() {
        System.out.println("Dog constructor called");
    }

    void changeColor() {
        color = "Brown";
    }

    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Bulldog extends Dog {
    Bulldog() {
        System.out.println("Buldog constructor called");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "Grey";
    }

    void walk() {
        System.out.println("Walks on 2 legs");
    }
}