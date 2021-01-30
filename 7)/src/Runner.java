/*
Exercise 7: (1) Change Exercise 9 in the Polymorphism chapter so that Rodent is an
interface.
 */
public class Runner {
    public static void main(String[] args) {
        Rodent[] rodent = new Rodent[2];
        rodent[0] = new Mouse();
        System.out.println("___________");
        rodent[1] = new Hamster();
        rodent[0].move();
        rodent[1].eat();
    }
}
