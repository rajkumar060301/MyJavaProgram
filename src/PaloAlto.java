
/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 19 version
 * Date: 01-May-23
 */


public class PaloAlto {
    static int[] nums;

    public static void main(String[] args) {
        String s1 = new String(("JAVA"));
        String s2 = new String(("JAVA"));
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2.intern());
        System.out.println(s1.intern() == s2.intern());
        System.out.println(s1.intern() == s2);
        System.out.println("0".indent(0));
        System.out.println("1".indent(1));
        System.out.println("2".indent(2));
        System.out.println("3".indent(3));
        System.out.println("4".indent(4));
        System.out.println("5".indent(5));

        System.out.println("Java concept of The Day".substring(4, 8));
        String[] strings = {"Java", "Python", "JavaScript", "HTML", "CSS"};
        String languages = String.join("*", strings);

        System.out.println("A".compareTo("B"));
        System.out.println("B".compareTo("A"));
        System.out.println("A".compareTo("C"));

        String string = "JAVA";
        StringBuffer sbuffer = new StringBuffer(string);
        StringBuilder sBuilder = new StringBuilder(string);
        System.out.println(string.equals(sbuffer));
        System.out.println(string.equals(sBuilder));
        System.out.println(sbuffer.equals(sBuilder));

        "ABC123abc".chars().forEach(System.out::println);
//    System.out.println(nums.length);
        int[] marks = {35, 65, 95};
        System.out.println(marks.length + "," + marks[1]);
//    int[] balls = {};
//    System.out.println(balls.length);
        String[] computer = {"Ram", "Hdd", "Mouse"};
        String[] parts = {computer[0], computer[2]};
        System.out.println(parts[1]);
        int balls[], rounds = 3;
        balls = new int[rounds];
        for (int i = 0; i < balls.length; i++)
            balls[i] = (i + 1) * 2;
        for (int j = 0; j < balls.length; j++)
            System.out.print(balls[j] + ",");

        String[] ary = {"Kite", "Air"};
        String str = "Plane";
        ary[1] = str;
        str = "Fly";
        System.out.println(ary[1]);
    }


}
