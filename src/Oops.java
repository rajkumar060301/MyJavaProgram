
/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 19 version
 * Date: 11-May-23
 */


public class Oops {
    int runs;
}

class Test {
    public static void main(String[] args) {
        Oops c1 = new Oops();
        c1.runs = 250;
        Oops c2;
        c2 = c1;
        c2.runs = 300;
        System.out.println(c1.runs);
    }
}

