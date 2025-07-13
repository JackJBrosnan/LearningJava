public class Otter extends Mammal {
    
    Otter() {
        super(true,4,0,0,"Otter");
    }
    
    public void move() {
        System.out.println("This animal walks and swims");
    }
    
    public void eat() {
        System.out.println("This animal is an omnivore");
    }

    public void hibernate() {}

}