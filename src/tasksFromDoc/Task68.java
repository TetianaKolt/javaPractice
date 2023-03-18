package tasksFromDoc;
/*
68. Create hash set.
Add elements to set.
Write a Java program to iterate through all elements in a hash list.
Sout all elements into screen

 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task68 {
    public static void main(String[] args) {

        Set<Integer> ints = new HashSet<>();

        ints.add(12);
        ints.add(146);
        ints.add(9999);
        ints.add(1);

        Iterator<Integer> iInts = ints.iterator();

        while(iInts.hasNext()){
            System.out.println(iInts.next());
        }
    }


}
