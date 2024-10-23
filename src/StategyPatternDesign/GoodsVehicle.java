package StategyPatternDesign;

import StategyPatternDesign.InterfaceClass.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{

    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
