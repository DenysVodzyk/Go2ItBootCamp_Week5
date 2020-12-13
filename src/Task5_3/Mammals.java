package Task5_3;

public class Mammals extends Vertebrates {
    private boolean isWarmBlooded;

    public Mammals() {
    }

    public Mammals(String head, String hurt, String limbs, String mouth) {
        super(head, hurt, limbs, mouth);
        this.isWarmBlooded = true;
    }
}
