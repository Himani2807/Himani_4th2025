Aim:
Create a class Animal with a method makeSound() that outputs a generic sound.The class should further contain derived classes Dog and Cat that override the makeSound() method to output specific sounds for each animal. Demonstrate polymorphism by creating an Animal reference that can hold objects of both Dog and Cat, and call the overridden makeSound() method at runtime.

Code:
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();

        Animal myCat = new Cat();
        myCat.makeSound();

        Animal[] animals = {new Dog(), new Cat()};
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

OUTPUT:
Woof! Woof!
Meow! Meow!
Woof! Woof!
Meow! Meow!
