public class Main {
    public static void main(String[] args) {
        animal[] animals = new animal[3];
        animals[0] = new Dog("Buddy", 5, 10.5);
        animals[1] = new Blowfish("Nemo", 2, 0.3);
        animals[2] = new Pigeon();

        for (animal animal : animals) {
            System.out.println(animal);
            animal.eat();
            System.out.println("Voice: " +  animal.getVoice());
            if (animal instanceof Dog) {
                ((Dog) animal).bark();
            } else if (animal instanceof Blowfish) {
                ((Blowfish) animal).inflate();
            } else if (animal instanceof Pigeon) {
                ((Pigeon) animal).fly();
            }
            System.out.println();
        }
    }
}
