public class Tortoise extends Reptile {

    Tortoise() {
        super(4,"Tortoise");
    }

    public void move() {
        System.out.println("This animal walks");
    }

    public void eat() {
        System.out.println("This animal is an herbivore");
    }

    public void hibernate() {
        System.out.println("This animal hibernates");
    }

}