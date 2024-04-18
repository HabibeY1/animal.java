
abstract class Animal {

    abstract String getName();
}


class dog extends Animal {
    @Override
    String getName() {
        return "Dog";
    }

    void bark() {
        System.out.println("Woof woof!");
    }
}

class pigeon extends Animal {
    @Override
    String getName() {
        return "Pigeon";
    }

    void coo() {
        System.out.println("Coo coo!");
    }
}

class blowfish extends Animal {
    @Override
    String getName() {
        return "Blowfish";
    }

    void puff() {
        System.out.println("Puffing up!");
    }
}

interface AnimalBehavior {
    void sleep();
}

interface AnimalMove {
    default void move() {
        System.out.println(getClass().getSimpleName() + " move");
    }
interface AnimalName {
    static void name(String name) {
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        AnimalBehavior[] animals = new AnimalBehavior[3];



        for (AnimalBehavior animal : animals) {
            animal.sleep();
        }


        for (AnimalBehavior animal : animals) {
            if (animal instanceof AnimalMove) {
                ((AnimalMove) animal).move();
            }
        }

        for (AnimalBehavior animal : animals) {
            if (animal instanceof AnimalName) {
                AnimalName.name(((Animal) animal).getName());
            }
        }
    }
}}
