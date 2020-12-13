package Task5_3;

public class Sparrow extends Mammals {

    public Sparrow() {
    }

    public Sparrow(String head, String hurt, String limbs, String mouth) {
        super(head, hurt, limbs, mouth);
    }


    @Override
    public void move() {
        super.move();
        System.out.println("Sparrows fly.");
    }
}
