public class Bicycle extends Vehicle {
    private String bellsound;
    private int gears;


    public Bicycle(String name, int gears, String bellsound) {
        super(name, 2);

        this.bellsound = bellsound;
    }

    public String getBell() {
        return bellsound;
    }

    public int getGearCount(){
        return gears;
    }

    public void ringBell() {
        System.out.println(bellsound+" Get outta my way!");
    }
}