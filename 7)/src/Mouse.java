public class Mouse implements Rodent {
    public Mouse(){
        System.out.println("Mouse");
    }
    @Override
    public void eat() {
        System.out.println("Mouse: Griz-griz-griz");
    }
    @Override
    public void move() {
        System.out.println("Mouse: chuh-chuh-chuh");
    }
}
