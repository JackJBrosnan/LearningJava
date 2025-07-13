public class Turtle extends Reptile {

    Turtle() {
        super(4,"Turtle");
    }

    public void move() {
        System.out.println("This animal crawls and swims");
    }

    public void eat() {
        System.out.println("This animal is an herbivore");
    }

    public void hibernate() {
        System.out.println("This animal hibernates");
    }

}