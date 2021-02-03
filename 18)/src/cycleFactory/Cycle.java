package cycleFactory;

public interface Cycle {
    static void printCycle(){
        for(CycleType c : CycleType.values()){
            System.out.println(c);
        }
    }
    void print();
}
