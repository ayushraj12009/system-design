package StategyPatternDesign;

import StategyPatternDesign.InterfaceClass.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
