package Task5_1;

public class ChildrenShoe extends Shoe{
    private boolean isHasFlashingLights;


    public ChildrenShoe(){
    }

    public ChildrenShoe(int size, String material, boolean isHasFlashingLights){
        super(size, material);
        this.isHasFlashingLights = isHasFlashingLights;
    }
}
