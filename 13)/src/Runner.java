/*
Exercise 13: (2) Create an interface, and inherit two new interfaces from that interface.
Multiply inherit a third interface from the second two. 2
 */
public class Runner implements Thecond2{
    @Override
    public void printThecond2(){
        System.out.println("2");
    }
    public void printBase(){
        System.out.println("Base");
    }
    public void printThecond1(){
        System.out.println("1");
    }
    public static void main(String[] args) {
        Runner obj = new Runner();
        obj.printBase();
        obj.printThecond1();
        obj.printThecond2();
    }
}
