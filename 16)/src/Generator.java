import java.nio.CharBuffer;
import java.util.Random;

public class Generator implements Readable {
    private int amount;
    private static Random rand = new Random(0);
    private static final char[] str = {'q','w','e','r','t','y',
            'u','i','o','p','a','s',
            'd','f','g','h','j','k',
            'l','z','x','c','v','b',
            'n','m','Q','W','E','R',
            'T','Y','U','I','O','P',
            'A','S','D','F','G','H',
            'J','K','L','Z','X','C',
            'V','B','N','M','1','2',
            '3','4','5','6','7','8',
            '9','0'};//62
    public Generator(int n) {
        amount = n;
    }
    @Override
    public int read(CharBuffer cb) {
        if(amount-- == 0) {
            return -1;
        }
        cb.append(randomChar());
        return 1;
    }
    private char randomChar() {
        return str[rand.nextInt(str.length)];
    }
}
