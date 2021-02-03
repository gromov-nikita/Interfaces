import java.util.Scanner;

/*
Exercise 16: (3) Create a class that produces a sequence of chars. Adapt this class so
that it can be an input to a Scanner object.
 */
public class Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(new Generator(100));
        while(s.hasNext()){
            System.out.println(s.next());
        }
    }
}
