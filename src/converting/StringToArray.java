package converting;

import java.util.Arrays;

public class StringToArray {

    public static void printCharArray(char[] charArray){
        int length = charArray.length;
        System.out.print("[");
        for (int i = 0; i < charArray.length; i++) {
            System.out.print("\"" +charArray[i] +  "\"");
                if (i < charArray.length - 1) {
                    System.out.print(", "); 
                }
        }
        System.out.println("]");


    }

    public static void main(String[] args) {
        String str = "rajkumar";
        int length = str.length();
        char[] charArray = new char[length];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
            
        }
        System.out.println(Arrays.toString(charArray));

        printCharArray(charArray);
    }

}
