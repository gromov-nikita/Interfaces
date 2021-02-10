package cycleFactory;
import cycles.*;
public class CycleFactory {
    public Cycle createCycle(CycleType c) {
        switch (c){
            case TRICYCLE:
                return new Tricycle();
            case BICYCLE:
                return new Bicycle();
            case UNICYCLE:
                return new Unicycle();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
