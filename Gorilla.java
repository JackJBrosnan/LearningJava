public class Gorilla extends Mammal {

    Gorilla() {
        super(false,2,2,0,"Gorilla");
    }

    public void move() {
        System.out.println("This animal walks and climbs");
    }

    public void eat() {
        System.out.println("This animal is an herbivore");
    }

    public void hibernate() {}

}