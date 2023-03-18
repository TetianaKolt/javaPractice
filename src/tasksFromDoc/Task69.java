package tasksFromDoc;
/*
69.  Write a Java program to get the number of elements in a hash set.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task69 {

    public static void main(String[] args) {
        HashSet<String> jedis = new HashSet<>(Arrays.asList("Obi-Wan Kenobi", "Anakin Skywalker", "Qui-Gon Jinn", "Ahsoka Tano"));
        int numberOfJedis = jedis.size();
        System.out.println(numberOfJedis);
    }


}
