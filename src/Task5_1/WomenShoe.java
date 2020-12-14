package Task5_1;

public class WomenShoe extends AdultShoe {
    private String color;

    public WomenShoe(){
    }

    public WomenShoe(int size, String material, boolean isCsaApproved, String color){
        super(size, material, isCsaApproved);
        this.color = color;
    }
}
