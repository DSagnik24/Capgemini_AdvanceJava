package SmartCityTrafficManagementSystem;

import java.util.Objects;

public class Vehicle {
    private String vehicleNumber;
    private String type;
    private String checkPoint;


    public Vehicle(String vehicleNumber, String type,
                   String checkPoint){
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.checkPoint = checkPoint;

    }

    public String getVehicleNumber(){
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public String getCheckPoint() {
        return checkPoint;
    }



    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleNumber='" + vehicleNumber + '\'' +
                ", type='" + type + '\'' +
                ", checkPoint='" + checkPoint + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(vehicleNumber, vehicle.vehicleNumber) && Objects.equals(type, vehicle.type) && Objects.equals(checkPoint, vehicle.checkPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleNumber, type, checkPoint);
    }
}
