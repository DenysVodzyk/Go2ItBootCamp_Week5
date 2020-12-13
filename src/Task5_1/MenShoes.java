package Task5_1;

public class MenShoes extends AdultShoe{
    private boolean isSuitableForHeavyLifting;

    public MenShoes(){
    }

    public MenShoes(int size, String material, boolean isCsaApproved, boolean isSuitableForHeavyLifting){
        super(size, material, isCsaApproved);
        this.isSuitableForHeavyLifting = isSuitableForHeavyLifting;
    }
}
