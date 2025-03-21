public class Truck extends Vehicle1 {
    private int axles;
    private boolean hasTrailer;
    
    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
      super(licensePlate, tollFee, passengers);
      this.axles = axles;
      this.hasTrailer = hasTrailer;
    }
  
    public int getAxles() {
      return axles;
    }
  
    public boolean hasTrailer() {
      return hasTrailer;
    }

    public boolean validateLicensePlate(){
      if(hasTrailer){
        if(getAxles()>4){
          return getLicensePlate().endsWith("MX");
        }else{
          if(getAxles()<=4){
            return getLicensePlate().endsWith("LX");
          }
        }
      }
      return true;
    }

    public void printInfo(){
      super.printInfo();
      System.out.println("Axles: " + axles);
      System.out.println("Trailer? " + hasTrailer);
    }

    @Override
    public double calculateTollPrice() {
        if(hasTrailer){
          return axles*getTollFee()*2;
        }
        return axles*getTollFee();
    }

    @Override
    public void honk() {
    System.out.println("HOOOOOOOONK!!!");
    }
  }