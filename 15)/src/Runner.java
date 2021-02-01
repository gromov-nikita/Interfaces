/*
Exercise 15: (2) Modify the previous exercise by creating an abstract class and
inheriting that into the derived class.

Exercise 14: (2) Create three interfaces, each with two methods. Inherit a new interface
that combines the three, adding a new method. Create a class by implementing the new
interface and also inheriting from a concrete class. Now write four methods, each of which
takes one of the four interfaces as an argument. In main( ), create an object of your class
and pass it to each of the methods.

 */
public class Runner {
    public static void main(String[] args) {
        ThecondClass obj = new ThecondClass(6);
        obj.useBase1(new ThecondClass(5));
        obj.useBase2(new ThecondClass(4));
        obj.useBase3(new ThecondClass(3));
        obj.useThecond(new ThecondClass(2));
    }
}
