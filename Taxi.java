public class Taxi extends Car{
    private double fareCollected;
    
    public Taxi (String licensePlate, double tollFee, int passengers, boolean electric, double fareTotal) {
      super(licensePlate, tollFee, passengers, electric);
      fareCollected = fareTotal;   // default value
    }
  
    public double getFare() {
      return fareCollected;
    }
  
    public void taxiInfo() {
      System.out.println("LicencePlate: " + getLicensePlate());
      System.out.println("TollFee: " + getTollFee());
      System.out.println("Passengers: " + getPassengers());
      System.out.println("Electric? " + isElectric());
      System.out.println("Discount applied? " + isDiscountApplied());
      System.out.println("Total fare collected: " + fareCollected);
    }
  
  }
  
