enum VehicleType {
    VT_TwoWheeler,
    VT_ThreeWheeler,
    VT_FourWheeler
}

abstract class Vehicle {
    abstract public void printVehicleInfo();
}
 
class TwoWheeler extends Vehicle {
    public void printVehicleInfo()
    {
        System.out.println("Two wheeler");
    }
}
 
class ThreeWheeler extends Vehicle {
    public void printVehicleInfo()
    {
        System.out.println("Three wheeler");
    }
}
 
class FourWheeler extends Vehicle {
    public void printVehicleInfo()
    {
        System.out.println("Four wheeler");
    }
}

class VehicleFactory {
 
    Vehicle build(VehicleType vehicleType)
    {
        if (VehicleType.VT_TwoWheeler.compareTo(vehicleType)
            == 0) {
            return new TwoWheeler();
        }
        else if (VehicleType.VT_ThreeWheeler.compareTo(
                     vehicleType)
                 == 0) {
            return new ThreeWheeler();
        }
        else if (VehicleType.VT_FourWheeler.compareTo(
                     vehicleType)
                 == 0) {
            return new FourWheeler();
        }
        return null;
    }
}

class Client {
 
    private Vehicle pVehicle;
 
    Client() { pVehicle = null; }
 
    void BuildVehicle(VehicleType vehicleType)
    {
        VehicleFactory vf = new VehicleFactory();
        pVehicle = vf.build(vehicleType);
    }
 
    Vehicle getVehicle() { return pVehicle; }
}

public class factorymethod {

    public static void main(String[] args)
    {
        Client client = new Client();
        client.BuildVehicle(VehicleType.VT_TwoWheeler);
        client.getVehicle().printVehicleInfo();
 
        client.BuildVehicle(VehicleType.VT_ThreeWheeler);
        client.getVehicle().printVehicleInfo();
 
        client.BuildVehicle(VehicleType.VT_FourWheeler);
        client.getVehicle().printVehicleInfo();
    }
}
