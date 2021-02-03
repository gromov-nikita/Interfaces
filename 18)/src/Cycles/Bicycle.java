package Cycles;

public class Bicycle implements cycleFactory.Cycle {
    @Override
    public void print() {
        System.out.println("Bicycle");
    }
}
