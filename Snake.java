public class Snake extends Reptile {

    Snake() {
        super(0,"Snake");
    }

    public void move() {
        System.out.println("This animal slithers");
    }

    public void eat() {
        System.out.println("This animal is an carnivore");
    }

    public void hibernate() {
        System.out.println("This animal hibernates");
    }

}