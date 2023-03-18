package tasksFromDoc;
/*
39. Capture the Rook
Write a function that returns true if two rooks can attack each other, and false otherwise.

Notes: Two rooks can attack each other if they share the same row (letter) or column (number).

Examples
canCapture(["A8", "E8"]) ➞ true
canCapture(["A1", "B2"]) ➞ false
canCapture(["H4", "H3"]) ➞ true
canCapture(["F5", "C8"]) ➞ false
 */
public class Task39 {

    public static void main(String[] args) {
        System.out.println(canCaptureB("A8", "E8"));
        System.out.println(canCaptureB("A1", "B2"));
        System.out.println(canCaptureB("H4", "H3"));
        System.out.println(canCaptureB("F5", "C8"));
    }

    public static boolean canCapture(String rookA, String rookB) {
        // not really correct
        for (int i = 0; i < rookA.toCharArray().length; i++) {
            for (int j = 0; j < rookB.toCharArray().length; j++) {
                if(rookA.toCharArray()[i] == rookB.toCharArray()[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean canCaptureA(String rookA, String rookB) {
        for (int i = 0; i < rookA.length(); i++) {
            if(rookA.charAt(i) == rookB.charAt(i)) {
                return true;
            }
        }
        return false;
    }
    public static boolean canCaptureB(String rookA, String rookB){
        return rookA.charAt(0) == rookB.charAt(0) || rookA.charAt(1) == rookB.charAt(1);
    }
}

