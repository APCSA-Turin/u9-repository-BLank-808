public class Boat extends Vehicle {
    private int topspeed;
    private int storageSpace;


    public Boat(String name, int topspeed, int storageSpace) {
        super(name, 0);
        this.topspeed=topspeed;
        this.storageSpace=storageSpace;
    }

    public int gettopspeed(){
        return topspeed;
    }

    public int getStorageSpace(){
        return storageSpace;
    }

    public void honk() {
        System.out.println("HOOOONK!!!");
    }
}