public class Vehicle1 {
    private String licensePlate;
    private double tollFee;
    private int passengers;
    
    public Vehicle1(String licensePlate, double tollFee, int passengers) {
      this.licensePlate = licensePlate;
      this.tollFee = tollFee;
      this.passengers = passengers;
    }
  
    public String getLicensePlate() {
      return licensePlate;
    }
  
    public double getTollFee() {
      return tollFee;
    }
  
    public int getPassengers() {
      return passengers;
    }
  
    public double calculateTollPrice() {
      return tollFee * passengers;
    }

    public void changePassengers(int X){
      passengers+= X;
    }

    public void setTollFee(double newFee){
      tollFee=newFee;
    }

    public void printInfo(){
      System.out.println("LicencePlate: " + getLicensePlate());
      System.out.println("TollFee: " + getTollFee());
      System.out.println("Passengers: " + getPassengers());
    }

    public void honk(){
      System.out.println("Beep Beep");
    }

  }
