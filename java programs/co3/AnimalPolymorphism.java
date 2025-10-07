// AnimalPolymorphism.java

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo");
    }
}

public class AnimalPolymorphism {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat(), new Cow() };

        System.out.println("--- Demonstrating Animal Sounds (Polymorphism) ---");
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

/*
Expected Output:

--- Demonstrating Animal Sounds (Polymorphism) ---
Woof
Meow
Moo
*/
