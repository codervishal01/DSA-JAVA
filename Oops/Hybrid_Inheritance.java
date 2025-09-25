public class Hybrid_Inheritance {
    public static void main(String args[]) {
        
    }
}

class Animal {
    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Fish extends Animal {
    int gills;

}

class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Tuna extends Fish {
    int speed;
}

class Shark extends Fish {
    void swim() {
        System.out.println("swims in water");
    }
}

class Peacock extends Bird {
    int wings;
}

class Dog extends Mammal {
    String breed;
}

class Cat extends Mammal {
    String color;
}
