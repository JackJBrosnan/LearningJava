public abstract class Mammal extends Animal{

    Mammal(boolean tail,int legs,int arms,int wings,String name) {
        super(false,"fur", tail, legs, arms, wings,name);
    }

    abstract void move();

    abstract void eat();

    public void birth() {
        System.out.println("This animal gives birth to live young");
    }

    abstract void hibernate();
}
