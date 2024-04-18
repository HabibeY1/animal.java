public class Dog extends mammal {
    public Dog() {
        super();
    }

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }


    public void eat() {
        System.out.println("Dog is eating");
    }


    public String getVoice() {
        return "Woof";
    }

    public void bark() {
        System.out.println("Barking...");
    }

    public String toString() {
        return super.toString();

    }
}