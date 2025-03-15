package collectionFremwork.hashMap;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 22 version
 * Date: 04-03-2025
 */

import java.util.*;
import java.lang.*;

public class HashMapAndTable {

    public static void main(String[] args) {

        //----------hashtable -------------------------
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
        ht.put(101," ajay");
        ht.put(101,"Vijay");
        ht.put(102,"Ravi");
        ht.put(103,"Rahul");
        System.out.println("-------------Hash table--------------");
        for (Map.Entry m:ht.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        //----------------hashmap--------------------------------

    }
}
