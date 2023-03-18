package tasksFromDoc;
/*
47.10 Prefixes vs. Suffixes
Create two functions: isPrefix(word, prefix-) and isSuffix(word, -suffix).
isPrefix should return true if it begins with the prefix argument.
isSuffix should return true if it ends with the suffix argument.
Otherwise return false.

Examples
isPrefix("automation", "auto-") ➞ true
isSuffix("arachnophobia", "-phobia") ➞ true
isPrefix("retrospect", "sub-") ➞ false
isSuffix("vocation", "-logy") ➞ false
Notes
The prefix and suffix arguments have dashes - in them.

 */

public class Task47_10 {

    public static void main(String[] args) {

        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println(isPrefix("retrospect", "sub-"));
        System.out.println(isSuffix("vocation", "-logy"));


    }

    public static boolean isPrefix(String word, String prefix) {
        prefix = prefix.substring(0,prefix.length()-1);
        String wordPrefix = word.substring(0,prefix.length());
        System.out.println(prefix + " " +wordPrefix );
      return (wordPrefix.equals(prefix));
    }

    public static boolean isSuffix(String word, String suffix) {
        suffix = suffix.substring(1);
        String wordSuffix = word.substring(suffix.length()+1);
        System.out.println(suffix + " " + wordSuffix);

        return (wordSuffix.equals(suffix));
    }
}
