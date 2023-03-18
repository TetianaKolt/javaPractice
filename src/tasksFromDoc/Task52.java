package tasksFromDoc;
/*
52. Capitalize the Names
Create a method that takes an array of names and
returns an array where only the first letter of each name is capitalized.

Examples
capMe(["mavis", "senaida", "letty"]) ➞ ["Mavis", "Senaida", "Letty"]
capMe(["samuel", "MABELLE", "letitia", "meridith"]) ➞ ["Samuel", "Mabelle", "Letitia", "Meridith"]
capMe(["Slyvia", "Kristal", "Sharilyn", "Calista"]) ➞ ["Slyvia", "Kristal", "Sharilyn", "Calista"]


??????????????????????????/

 */

import java.util.Arrays;


public class Task52 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(capMe(new String[]{"mavis", "senaida", "letty"})));
        System.out.println(Arrays.toString(capMe(new String[]{"samuel", "MABELLE", "letitia", "meridith"})));
        System.out.println(Arrays.toString(capMe(new String[]{"Slyvia", "Kristal", "Sharilyn", "Calista"})));

    }

    public static String[] capMe(String[] names) {


//////// Почему через этот фор не сохранился результат?
//        for (String name: names) {
//            name = name.toLowerCase();
//            name = name.substring(0,1).toUpperCase().concat(name.substring(1,name.length()).toLowerCase());
//            System.out.println(name);
//        }
//
//        System.out.println(Arrays.toString(names));

        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].substring(0,1).toUpperCase().concat(names[i].substring(1, names[i].length()).toLowerCase());
        }
       return names;
    }
}