package Lesson;

public class Main {

    static abstract class Cat {
        public String name;
        public String color;
        public String owner;
        public String chipCode;

        public abstract void purr();

    }

    static class Tabby extends Cat {

        public Tabby(String name, String color, String owner, String chipCode) {
            this.name = name;
            this.color = color;
            this.owner = owner;
            this.chipCode = chipCode;
        }

        public void purr() {
            System.out.println("Beow");
        }
    }



    public static void main(String[] args) {
	/*
	Abstract Classes are classes that cannot be instantiated. What is the purpose then?
	To be used as a template to be extended to other child classes.
	Let's use the example of Cats, the animal not the musical, because the Internet adores Cats.
	Let's build a class called Cat, with name, color, owner, and chipCode fields.
	Abstract Classes can only use the Default Constructor, so we won't be adding one to this Class.
	Now there is no animal that fits the generic title of Cat, there are many, many forms of cats. Cat will be a
	    blueprint for all future cats to be instantiated, so we will make the class Abstract.
	Watch as we try to instantiate it as one normally would any other Java Class...
	The editor underlines it in all red and says "Cat is abstract; cannot be instantiated", so how do we work around
	    this?
	We extend this Class to other Classes and instantiate those.
	Let's create a Tabby class that extends Cat...
	Since this class isn't Abstract we can add a Constructor that will apply values to our extended fields.
	Now let's instantiate a new Cat via the Tabby Class...

	Now let's quickly touch upon Abstract Methods. When extending a parent Class to a child Class, we know that the
	    methods in the parent are also extended to the child. Let's demonstrate this with a purr method...
	This works well when all extensions of this class will behave exactly the same, but what if in this case each Cat
	    will make a noise unique to its breed?
	That is where Abstract Methods come into play. Let's refactor our purr method to be Abstract by removing the code
	    block and adding the abstract keyword.
	Notice how the child Class is now underlined in red. This is because the purr method in Cat is not implemented
	    within the child Class. Let's resolve that issue...
	Now in the child Class we add the code block and give the method actions to perform. When we call the method on
	    the Tabby, it executes the code block.
	You are perfectly able to mix and match regular methods with abstract ones in your abstract classes. The point of
	    abstract methods is to determine what methods every case of the Class needs without defining the exact actions
	    the method will run.



	 */

        Cat tabby1 = new Tabby("Alexis", "Tan", "Michelle", "A337_TYB");
        tabby1.purr();


    }
}
