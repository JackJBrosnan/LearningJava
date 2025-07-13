public abstract class Animal {
    private boolean coldBlooded;
    private String skinType;
    private boolean tail;
    private int legs;
    private int arms;
    private int wings;
    private String name;

    Animal(boolean coldBlooded, String skinType, boolean tail, int legs, int arms, int wings, String name) {
        this.coldBlooded = coldBlooded;
        this.skinType = skinType;
        this.tail = tail;
        this.legs = legs;
        this.arms = arms;
        this.wings = wings;
        this.name = name;
    }

    abstract void move();

    abstract void eat();

    abstract void birth();

    abstract void hibernate();

    public void getInfo() {
        System.out.println(name+":");
        if (this.coldBlooded)
            System.out.println("This animal is cold-blooded");
        else
            System.out.println("This animal is warm-blooded");
        if (this.skinType != null)
            System.out.println("This animal is covered in " + this.skinType);
        if (this.tail)
            System.out.println("This animal has a tail");
        if (this.legs > 0)
            System.out.println("This animal has " + this.legs + " legs");
        if (this.arms > 0)
            System.out.println("This animal has " + this.arms + " arms");
        if (this.wings > 0)
            System.out.println("This animal has " + this.wings + " wings");
        this.move();
        this.eat();
        this.birth();
        this.hibernate();
        System.out.println();
    }
}
