package tasksFromDoc;

    /*
48. Alternating Ones and Zeroes

Write a function that returns true if the binary string can be rearranged to form a string of alternating 0s and 1s.

Examples
canAlternate("0001111") ➞ true // Can make: "1010101"
canAlternate("01001") ➞ true // Can make: "01010"
canAlternate("010001") ➞ false
canAlternate("1111") ➞ false

 */
    public class Task48 {
        public static void main(String[] args) {
            System.out.println(canAlternate("0001111"));
            System.out.println(canAlternate("01001"));
            System.out.println(canAlternate("010001"));
            System.out.println(canAlternate("1111"));

            Math.abs(-5);

        }

        public static boolean canAlternate(String str){
            char[] chars = str.toCharArray();
            int countZero = 0;
            int countOne = 0;

            for (char c: chars) {
                if(c == '0'){
                    countZero++;
                }
                else{
                    countOne++;
                }
            }
//        return countOne == countZero || countOne - countZero == 1 || countZero - countOne == 1;
            return Math.abs(countOne-countZero) <= 1;
        }
    }

