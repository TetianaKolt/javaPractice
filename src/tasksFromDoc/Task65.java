package tasksFromDoc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
65. Write a Java program to create a new array list,
add some colors (string) and print out the collection with for and while loops

 */
public class Task65 {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<String>();
        colors.add("Black");
        colors.add("Purple");
        colors.add("Green");

        for (String color : colors) {
            System.out.println(color);
        }

        Iterator<String> i = colors.iterator();

        while(i.hasNext()){
            System.out.println(colors);
            break;
        }

    }


}
