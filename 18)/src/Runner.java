/*
Exercise 18: (2) Create a Cycle interface, with implementations Unicycle, Bicycle
and Tricycle. Create factories for each type of Cycle, and code that uses these factories.
 */
public class Runner {
    public static void main(String[] args) {
        Tricycle tricycle = new Tricycle();
        Bicycle bicycle = new Bicycle();
        Unicycle unicycle = new Unicycle();
        Cycle obj1 = tricycle;
        Cycle obj2 = bicycle;
        Cycle obj3 = unicycle;
        tricycle.ride();
        bicycle.ride();
        unicycle.ride();
        obj1.ride();
        obj2.ride();
        obj3.ride();

    }
}
