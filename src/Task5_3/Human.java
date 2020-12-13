package Task5_3;

public class Human extends Mammals {

    public Human() {
    }

    public Human(String head, String hurt, String limbs, String mouth) {
        super(head, hurt, limbs, mouth);
    }

    @Override
    public void communicate() {
        super.communicate();
        System.out.println("Communicate using speech.");
    }
}
