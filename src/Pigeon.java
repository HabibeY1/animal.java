public class Pigeon extends bird {
    private String species;

    public Pigeon() {
        super();
    }



    @Override
    public void eat() {
        System.out.println("Pigeon is pecking grains");
    }

    @Override
    public String getVoice() {
        return "Coo";
    }

    public void fly() {
        System.out.println("Pigeon is flying...");
    }

    @Override
    public String toString() {
        return super.toString() + ", species='" + species+'\'';
}
}