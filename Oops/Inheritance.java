public class Inheritance {
    public static void main(String args[]) {
        Fish shark = new Fish();
        shark.eat();

        Bird sparrow = new Bird();
        sparrow.breathe();
        
    }
}

//Base class or Parent class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathe");
    }
}

//Derived class or child class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}