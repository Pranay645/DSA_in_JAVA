package Hashing;
import java.util.HashSet;
import java.util.Iterator;

public class MyHashset {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);//Duplicate value is not added

        System.out.println(set);
        System.out.println("is 3 there ?"+set.contains(3));
        set.remove(3);//removes 3
        System.out.println("is 3 there ?"+set.contains(3));
        System.out.println(set);
        //Through Iterator
        System.out.println("Through Iterator");
        Iterator it= set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }



    }
}
