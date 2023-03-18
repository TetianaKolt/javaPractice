package tasksFromDoc;
/*
61. String or Integer?
Create a function that checks if the argument is an integer or a string.
Return "int" if it's an integer and "str" if it's a string.

Examples
intOrString(8) ➞ "int"
intOrString("Hello") ➞ "str"
intOrString(9843532) ➞ "int"

 */

import java.util.stream.IntStream;

public class Task61 {
    public static void main(String[] args) {
        System.out.println(intOrString(8));
        System.out.println(intOrString("Hello"));
        System.out.println(intOrString(9843532));

    }

//    public static String intOrString(String enterSmth){
//
//
//        return "str";}
////
////    }
////    public static String intOrString(IntS enterSmth){
////        return "int";
////    }
////
////}
    public static String intOrString(Object o){
        boolean b = o instanceof Integer;
        if(b){
        return "int";}
    else{
        return "str";
    }}}