package Task5_1;

public class WomenShoe extends AdultShoe {
    private boolean isPink;

    public WomenShoe(){
    }

    public WomenShoe(int size, String material, boolean isCsaApproved, boolean isPink){
        super(size, material, isCsaApproved);
        this.isPink = isPink;
    }
}
