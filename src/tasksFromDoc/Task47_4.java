package tasksFromDoc;
/*
47.4 Match the Last Item
Create a function that takes an array of items and
checks if the last item matches the rest of the array concatenated together.

Examples
matchLastItem(["i", "love", "tesh", "ilovetesh"]) ➞ true
matchLastItem(["i", "am", "into", "her", "world", "iamintoherworld"]) ➞ matchLastItem(["1", "1", "1", "11"]) ➞ false
matchLastItem(["12", "13", "17", "19", "20", "40", "121317192040"]) ➞ true

 */

public class Task47_4 {
    public static void main(String[] args) {

        System.out.println(matchLastItem(new String[]{"i", "love", "tesh", "ilovetesh"}));
        System.out.println(matchLastItem(new String[]{"i", "am", "into", "her", "world", "iamintoherworld"}));
        System.out.println(matchLastItem(new String[]{"1", "1", "1", "11"}));
        System.out.println(matchLastItem(new String[]{"12", "13", "17", "19", "20", "40", "121317192040"}));

    }

    public static boolean matchLastItem(String[] words) {
        String lastWord = words[words.length - 1];
        String firstWord = words[0];

        for (int i = 1; i < words.length-1; i++) {
            firstWord = firstWord.concat(words[i]);
//            System.out.println(firstWord);
        }
//        System.out.println("lastWord = "+lastWord + "\nfirstWord = "+firstWord);
        if(lastWord.equals(firstWord)){
            return true;
        }
        return false;
    }
}
