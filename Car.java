public class Car extends Vehicle1 {
    private boolean electric;
    private boolean discountApplied;
    
    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
      super(licensePlate, tollFee, passengers);
      this.electric = electric;
      discountApplied = false;   // default value
    }
  
    public boolean isElectric() {
      return electric;
    }
  
    public boolean isDiscountApplied() {
      return discountApplied;
    }

    public boolean dropOffPassengers(){
      if(getPassengers()>=1){
      changePassengers(-1);
      return true;
      }
      return false;
    }

    public boolean dropOffPassengers(int x){
      if(getPassengers()>=x){
        changePassengers(-x);
        return true;
        }
        return false;
    }
  }