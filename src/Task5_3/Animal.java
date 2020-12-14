package Task5_3;

public class Animal {
    private String head;
    private String hurt;
    private String limbs;
    private int eyes;
    private String mouth;

    public Animal() {
    }

    public Animal(String head, String hurt, String limbs, String mouth) {
        this.head = head;
        this.hurt = hurt;
        this.limbs = limbs;
        this.eyes = 2;
        this.mouth = mouth;
    }

    public void sleep() {
        System.out.println("Sleep.");
    }

    public void eat() {
        System.out.println("Eat.");
    }

    public void drink() {
        System.out.println("Drink");
    }

    public void move() {
        System.out.println("Move with the help of the " + limbs);
    }

    public void communicate() {
        System.out.println("Communicate.");
    }

    public String getHead() {
        return head;
    }

    public String getHurt() {
        return hurt;
    }

    public String getLimbs() {
        return limbs;
    }

    public int getEyes() {
        return eyes;
    }

    public String getMouth() {
        return mouth;
    }
}
