package tasksFromDoc;
/*
57. Get the File Extension
Write a function that maps files to their extension names.

Examples
getExtension(["code.html", "code.css"])
➞ ["html", "css"]
getExtension(["project1.jpg", "project1.pdf", "project1.mp3"])
➞ ["jpg", "pdf", "mp3"]
getExtension(["ruby.rb", "cplusplus.cpp", "python.py", "javascript.js"])
➞ ["rb", "cpp", "py", "js"]

 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task57 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getExtension(new String[]{"code.html", "code.css"})));

    }

    public static String [] getExtension(String [] files) {
        String[] splits = new String[]{};

        for (int i = 0; i < files.length; i++) {
           splits =  files[i].split("\\.", files.length);
            System.out.println(Arrays.toString(splits));
        }

        return files;
    }
}
