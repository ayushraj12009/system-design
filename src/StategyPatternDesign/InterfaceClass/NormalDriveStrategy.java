package StategyPatternDesign.InterfaceClass;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Normal Drive Strategy");
    }
}
