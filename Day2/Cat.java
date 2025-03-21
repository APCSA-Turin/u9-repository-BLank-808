public class Cat extends Animal {
    String furColor;
    public Cat(String furColor){
        super("Meow");
        this.furColor=furColor;
    }

    public String getFur(){
        return furColor;
    }

    public static void main(String[] args) {
        Cat c= new Cat("grey");
        c.makeSound();
    }
}
