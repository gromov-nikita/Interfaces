
/*
Exercise 18: (2) Create a Cycle interface, with implementations Unicycle, Bicycle
and Tricycle. Create factories for each type of Cycle, and code that uses these factories.
 */
import cycleFactory.*;
public class Runner {
    public static void main(String[] args) {
        CycleFactory factory = new CycleFactory();
        Cycle tricycle = factory.createCycle(CycleType.TRICYCLE);
        Cycle bicycle = factory.createCycle(CycleType.BICYCLE);
        Cycle unicycle = factory.createCycle(CycleType.UNICYCLE);
        Cycle.printCycle();
        tricycle.print();
        bicycle.print();
        unicycle.print();

    }
}
