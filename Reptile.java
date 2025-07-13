public abstract class Reptile extends Animal{
    Reptile(int legs,String name) {
        super(true,"scales", true, legs, 0, 0,name);
    }

    abstract void move();

    abstract void eat();

    abstract void hibernate();

    public void birth() {
        System.out.println("This animal lays eggs");
    }
}
