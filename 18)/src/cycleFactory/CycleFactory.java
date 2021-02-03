package cycleFactory;
import Cycles.*;
public class CycleFactory {
    public Cycle createCycle(CycleType c) {
        if(c.equals(CycleType.TRICYCLE)) {
            return new Tricycle();
        }
        else {
            if(c.equals(CycleType.BICYCLE)) {
                return new Bicycle();
            }
            else{
                if(c.equals(CycleType.UNICYCLE)) {
                    return new Unicycle();
                }
                else {
                    return null;
                }
            }
        }
    }
}
