package tasksFromDoc;

public class Task30 {
     /*
    30. Broken Bridge
Create a function which validates whether a bridge is safe to walk on (i.e. has no gaps in it to fall through).

Examples
isSafeBridge("####") ➞ true
isSafeBridge("## ####") ➞ false
isSafeBridge("#") ➞ true
isSafeBridge("### ####") ➞ false
isSafeBridge("#####") ➞ true

     */

    public static void main(String[] args) {
        System.out.println(isSafeBridge("####"));
        System.out.println(isSafeBridge("## ####"));
        System.out.println(isSafeBridgeContains("##  ##"));
        System.out.println(isSafeBridgeContains("######"));
    }

    public static boolean isSafeBridge(String str) {

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                return false;
            }
        }
        return true;
    }

    public static boolean isSafeBridgeContains(String str) {

        return(!str.contains(" "));
    }

    public static boolean isSafe(String str) {
        for (char var : str.toCharArray()) {
            if (var == ' ') {
                return false;
            }
        }
        return true;
    }

}
