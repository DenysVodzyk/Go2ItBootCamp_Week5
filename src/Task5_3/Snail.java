package Task5_3;

public class Snail extends Invertebrates {

    public Snail() {
    }

    public Snail(String head, String hurt, String limbs, String mouth) {
        super(head, hurt, limbs, mouth);
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Sleep inside the shell.");
    }

    @Override
    public void communicate() {
        super.communicate();
        System.out.println("Communicate with the help of slime.");
    }
}
