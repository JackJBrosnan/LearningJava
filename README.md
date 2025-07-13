# LearningJava

Fundamentals:
1. Programming paradigms are different programming styles which can be used to create computer programs
2. Procedural programming uses separately defined variables, constants and subroutines that have no inherent relation to each other, whereas OOP defines separate objects whcih have their own assosiated methods and attributes.
3. The class is the framework of a type of object, defining its methods and attributes
4. Static attributes and methods can be used if you want it to affect the class as a whole, and may be used if you want to use a method ven if there is no instance of that class
5.
  class Clock
    private display
    private minutes
    private hours
    private seconds

  	public procedure new(dispaly,hours,minutes)
		  this.display = clockDisplay
      this.hours = clockHours
      this.minutes = clockMinutes
	  endprocedure

    public procedure update(seconds,minutes,hours,display)
      IF seconds == 60
        minutes = minutes++
        seconds = 0
      END IF
      IF minutes == 60
        hours = hours ++
        minutes = 0
      END IF
      IF hours == 24
        hours = 0
      END IF    
      this.display = hours + ":" + minutes
    endprocedure

    public



Encapsulation:
1. Encapsulation is the idea of grouping data and subroutines to make a program easier to work on and understand 
2. Private can only be accessed from within the class, and public can be accessed by other classes
3. Security purposes
4. Accessors (getters) return the value of an attribute, whereas mutators (setters) change the value of an attribute
5. Accessors and mutators should be used to give limitted access to attributes, without making them public
6. Attributes can be made public if they are constantly being accessed by multiple different classes to make it easier



Inheritance:
1. Inheritance is when a child class copies the attributes and methods of the parent class
2.  Animals - Snake
            - Anteater
            - Rat
3. a) Guitar is the parent and ElectricGuitar is the child
   b) noOfStrings, holfFret and strum
4. The super method calls a method from its parent class.
5. Inheriting from multiple classes can cause issues like inheriting two methods of the same name
6. Abstract methods are methods that are defined without any specification on how they work, only defining the name and parameter. This means an abstract method can be defined in a parent class with no functionality, to 
   then be inherited and used differently for each child class.



Polymorphism:
1. Polymorphism is a way to have multiple methods of the same name, either through overriding (replacing) or overloading (having 2 methods with the same name exist at once, just using different parameters). It is used when you need to change things during inheritance.
2. a) Object is the parent class
   b) Type, as it gets replaced from printing "Type: Object" to printing "Type: Number"
   c) Add, as if you put 2 numbers in, it adds them both, whereas if 3 parameters, it adds all 3
   d) Type from the Object parent class is a virtual method, as it gets overridden
3. You would make a method virtual so that it can get overridden









