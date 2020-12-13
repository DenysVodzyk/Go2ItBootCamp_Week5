package Task5_3;

public class Invertebrates extends Animal {
    private boolean isHasBackbone;

    public Invertebrates() {
    }

    public Invertebrates(String head, String hurt, String limbs, String mouth) {
        super(head, hurt, limbs, mouth);
        this.isHasBackbone = false;
    }
}
