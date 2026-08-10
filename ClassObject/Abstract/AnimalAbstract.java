// Create an abstract Animal class with an abstract sound() method and implement it in Dog and Cat classes.
package ClassObject.Abstract;

public class AnimalAbstract {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        Cat c = new Cat();
        c.sound();
    }
}

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog Barks......Bhoww Bowww");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat......Meow...Meow");
    }
}
