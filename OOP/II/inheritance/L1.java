package OOP.II.inheritance;

class Animal {
    String name;

    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public void display() {
        System.out.println("Dog is eating");
    }
}

public class L1 {
    public static void main(String[] args) {
        Dog labrador = new Dog();

        labrador.name = "Mastu";
        labrador.display();
        labrador.eat();
    }
}
