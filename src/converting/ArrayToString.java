package converting;

public class ArrayToString {
    public static String toString(char[] a){
        String str = new String(a);
        return str;
    }
    public static void main(String[] args) {

        char[] charArray =new char[] {'r','a','j'};
        String str = "";
        for(char i : charArray){
            str = str + i;
        }
        System.out.println(str);
        System.out.println(toString(charArray));


         
    }

}
