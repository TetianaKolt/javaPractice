package tasksFromDoc;

/*
32. Get Word Count
Create a method that takes a string and returns the word count. The string will be a sentence.

Examples
countWords("Just an example here move along") ➞ 6
countWords("This is a test") ➞ 4
countWords("What an easy task, right") ➞ 5

 */
public class Task32 {
    public static void main(String[] args) {
        System.out.println(countWords("Just an example here move along"));
        System.out.println(countWords("This is a test"));
        System.out.println(countWords("What an easy task, right"));
    }

    public static int countWords(String str) {
        int count = 1;

        /// теж рішення:
//        System.out.println(str.split(" ").length);

        for (char ch: str.toCharArray()) {
            if(ch == ' '){
                count++;
            }
        }
        return count;
    }
}

