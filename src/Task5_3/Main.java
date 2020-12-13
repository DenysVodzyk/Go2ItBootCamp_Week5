package Task5_3;

public class Main {
    public static void main(String[] args) {
        Dolphin dolphin = new Dolphin("Head", "Hurt", "Flippers", "Rostrum");
        Cat cat = new Cat("Head", "Hurt", "Paws", "Muzzle");
        Human human = new Human("Head", "Hurt", "Hands and Legs", "Mouth");
        Sparrow sparrow = new Sparrow("Head", "Hurt", "Paws", "Bill");
        Snail snail = new Snail("Head", "Hurt", "Paws", "Radula");

        dolphin.communicate();
        dolphin.move();


    }
}
