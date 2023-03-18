package tasksFromDoc;

/*
53. Hashes and Pluses
Create a function that returns the number of hashes and pluses in a string.

Examples
hashPlusCount("###+") ➞ [3, 1]
hashPlusCount("##+++#") ➞ [3, 3]
hashPlusCount("#+++#+#++#") ➞ [4, 6]
hashPlusCount("") ➞ [0, 0]
 */

import java.util.Arrays;

public class Task53 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(hashPlusCount("###+")));
        System.out.println(Arrays.toString(hashPlusCount("##+++#")));
        System.out.println(Arrays.toString(hashPlusCount("#+++#+#++#")));
        System.out.println(Arrays.toString(hashPlusCount("")));

    }

    public static int[] hashPlusCount(String str) {
        int countH = 0;
        int countP = 0;
        for (char ch:str.toCharArray()) {
            if(ch == '#'){
                countH ++;
            }
            else if(ch == '+'){
                countP++;
            }
        }


        return new int[]{countH,countP};
    }
}

