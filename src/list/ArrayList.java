package list;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 25-Apr-22
 */

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<>();
        arrayList.add(25);
        arrayList.add(8);
        arrayList.add(69);
        arrayList.add(39);
        arrayList.add(96);
        arrayList.add(36);
        System.out.println("remove 8 element:" + arrayList.remove(1));
        arrayList.add(5, 98);
        arrayList.add(6, 78);
        System.out.println("print index: " + arrayList.indexOf(36));
//        arrayList.equals(arrayList);
//        arrayList.clear();
        System.out.println("ArrayList:" + arrayList);

    }
}
