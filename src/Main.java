import StategyPatternDesign.GoodsVehicle;
import StategyPatternDesign.OffRoadVehicle;
import StategyPatternDesign.Vehicle;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new GoodsVehicle();
        vehicle.drive();

        Vehicle vehicle1 = new OffRoadVehicle();
        vehicle1.drive();

    }
}
