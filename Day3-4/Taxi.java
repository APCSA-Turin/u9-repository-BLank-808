public class Taxi extends Car{
    private double fareCollected;
    
    public Taxi (String licensePlate, double tollFee, int passengers, boolean electric, double fareTotal) {
      super(licensePlate, tollFee, passengers, electric);
      fareCollected = fareTotal;   // default value
    }
  
    public double getFareCollected() {
      return fareCollected;
    }
  
    public void printInfo() {
      super.printInfo();
      System.out.println("Total fare collected: " + fareCollected);
    }

    public void pickupRiders(int riders, double farePerRider){
        changePassengers(riders);
        fareCollected+=riders*farePerRider;
        if(getPassengers()>=4 && !isDiscountApplied()){
            setTollFee(getTollFee()*.5);
            setDiscount(true);
        }
    }
    
    public boolean chargeAndDropOffRiders(double fare){
      if(getPassengers()>1){
       fareCollected+= fare* (getPassengers()-1);
       changePassengers(-(getPassengers()-1));
       return true;
      }
      return false;
    }

    @Override
    public void honk() {
    System.out.println("Get out of the way!");
    }
  }
  
