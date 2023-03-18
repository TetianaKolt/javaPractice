package tasksFromDoc;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        String s = "hello";

        Object o = s;

        if( o.equals(s) )

        {

            System.out.print("A");

        }

        else

        {

            System.out.print("B");

        }

        if( s.equals(o) )

        {

            System.out.print("C");

        }

        else

        {

            System.out.print("D");

        }



    }}
