public class VehicleRunner {
    public static void main(String[] args) {
      Vehicle1 myVehicle3 = new Vehicle1("BB8123", 7.0, 3);
      myVehicle3.honk();
      System.out.println();
      Car myCar3 = new Car("MK4567", 6.75, 4, true);
      myCar3.honk();
      System.out.println();
      Truck myTruck3 = new Truck("TB12MX", 15.50, 2, 4, true);
      myTruck3.honk();
      System.out.println();
      Taxi myTaxi4 = new Taxi("TX1412", 13.75, 4, true, 2.0);
      myTaxi4.honk();


    }
}
