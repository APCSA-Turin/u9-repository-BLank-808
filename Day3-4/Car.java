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

    public void applyDiscount(){
      if(electric&&!discountApplied){
        discountApplied=true;
        setTollFee(getTollFee()*.5);
      }
    }

    public void setDiscount(boolean b){
      discountApplied=b;
    }

    public void printInfo() {
      super.printInfo();
      System.out.println("Electric? " + isElectric());
      System.out.println("Discount applied? " + isDiscountApplied());
    }

    @Override
    public double calculateTollPrice() {
        if(getPassengers()<4){
        return super.calculateTollPrice();
        }else{
          return getTollFee()*4;
        }
    }

    @Override
    public void honk() {
      System.out.println("Honk");
    }
  }