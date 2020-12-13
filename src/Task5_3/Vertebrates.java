package Task5_3;

public class Vertebrates extends Animal {
    private boolean isHasBackbone;

    public Vertebrates() {
    }

    public Vertebrates(String head, String hurt, String limbs, String mouth) {
        super(head, hurt, limbs, mouth);
        this.isHasBackbone = true;
    }

    public void swim() {
        System.out.println("Swim.");
    }

}
