package Task5_3;

public class Dolphin extends Mammals {

    public Dolphin() {
    }

    public Dolphin(String head, String hurt, String limbs, String mouth) {
        super(head, hurt, limbs, mouth);
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Sleep underwater");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Eat underwater;");
    }

    @Override
    public void drink() {
        super.drink();
        System.out.println("Drink underwater");
    }

    @Override
    public void communicate() {
        super.communicate();
        System.out.println("Communicate by whistling.");
    }
}
