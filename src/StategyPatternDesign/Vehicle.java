package StategyPatternDesign;

import StategyPatternDesign.InterfaceClass.DriveStrategy;

public class Vehicle {

    DriveStrategy driveObject;

    //this is known as constructor injection
    Vehicle(DriveStrategy driveObj){
        this.driveObject = driveObj;
    }

    public void drive(){
        driveObject.drive();
    }

}
