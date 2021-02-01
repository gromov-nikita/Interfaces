public class ThecondClass extends BaseClass implements Thecond {
    private final int n;

    public int getN() {
        return n;
    }

    public ThecondClass(int k){
        n = k;
    }
    @Override
    public void useBase1(Base1 ref) {
        printHello1();
        Base1.printBase1();
        System.out.println(" " + n);
    }
    @Override
    public void useBase2(Base2 ref) {
        printHello2();
        Base2.printBase2();
        System.out.println(" " + n);
    }
    @Override
    public void useBase3(Base3 ref) {
        printHello3();
        Base3.printBase3();
        System.out.println(" " + n);
    }
    @Override
    public void useThecond(Thecond ref) {
        printHelloThecond();
        Thecond.printThecond();
        System.out.println(" " + n);
    }
    @Override
    public void printHello1() {
        System.out.print("Hello1 ");
    }
    @Override
    public void printHello2() {
        System.out.print("Hello2 ");
    }
    @Override
    public void printHello3() {
        System.out.print("Hello3 ");
    }
    @Override
    public void printHelloThecond() {
        System.out.print("HelloThecond ");
    }
}
