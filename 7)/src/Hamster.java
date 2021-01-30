public class Hamster implements Rodent {
    public Hamster(){
        System.out.println("Hamster");
    }
    @Override
    public void eat() {
        System.out.println("Hamster: hrum-hrum-hrum");
    }
    @Override
    public void move() {
        System.out.println("Hamster: tup-tup-tup");
    }
}
