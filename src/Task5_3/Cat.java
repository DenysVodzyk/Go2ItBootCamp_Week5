package Task5_3;

public class Cat extends Mammals {

    public Cat() {
    }

    public Cat(String head, String hurt, String limbs, String mouth) {
        super(head, hurt, limbs, mouth);
    }

    @Override
    public void communicate() {
        super.communicate();
        System.out.println("Communicate by meowing");
    }
}
