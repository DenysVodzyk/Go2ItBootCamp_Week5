package Task5_1;

public class Shoe {
    private double size;
    private String material;

    public Shoe() {
    }

    public Shoe(double size, String material) {
        this.size = size;
        this.material = material;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
