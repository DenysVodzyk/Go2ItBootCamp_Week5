package Task5_1;

public class AdultShoe extends Shoe{
    private boolean isCsaApproved;

    public AdultShoe(){
    }

    public AdultShoe(double size, String material, boolean isCsaApproved){
        super(size, material);
        this.isCsaApproved = isCsaApproved;
    }

    @Override
    public String toString() {
        return "AdultShoe: " +
                "isCsaApproved=" + isCsaApproved + ", size="
                 + super.getSize() + ", material=" +super.getMaterial() + '.';
    }
}
