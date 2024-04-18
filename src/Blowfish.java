public class Blowfish extends Fish {
    public Blowfish() {
        super();
    }

    public Blowfish(String name, int age, double weight) {
        super(name, age, weight);
    }


    public void eat() {
        System.out.println("Blowfish is eating");
    }


    public String getVoice() {
        return "";
    }

    public void inflate() {
        System.out.println("Blowfish is inflating...");
    }

    @Override
    public String toString() {
        return super.toString();
    }



}