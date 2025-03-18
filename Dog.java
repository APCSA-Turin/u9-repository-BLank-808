public class Dog extends Animal {
    String size;
    public Dog(String size){
        super("Bow");
        this.size=size;
    }

    public String getSize(){
        return size;
    }

    public static void main(String[] args) {
        Dog c= new Dog("grey");
        c.makeSound();
    }
}