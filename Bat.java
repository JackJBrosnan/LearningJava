public class Bat extends Mammal {

    Bat() {
        super(false,2,0,2,"Bat");
    }

    public void move() {
        System.out.println("This animal flies");
    }

    public void eat() {
        System.out.println("This animal is an omnivore");
    }

    public void hibernate() {
        System.out.println("This animal hibernates");
    }

}