package tasksFromDoc;
/*
47.12 End Corona!
Given the number of people that recover per day recovers,
the number of new cases per day newCases,
and the number of currently active cases activeCases,
write a function to calculate the number of days needed to reach zero active cases.

Examples
endCorona(4000, 2000, 77000) ➞ 39
endCorona(3000, 2000, 50699) ➞ 51
endCorona(30000, 25000, 390205) ➞ 79

Notes
The number of people who recover per day recovers will always be greater than daily newCases.
Be conservative and round up the number of days needed.

 */

public class Task47_12 {
    public static void main(String[] args) {
        System.out.println(endCorona(4000,2000,77000));
        System.out.println(endCorona(3000, 2000, 50699));
        System.out.println(endCorona(30000, 25000, 390205));

    }

    public static int endCorona(int recovers, int newCases, int activeCases) {
        int howManyDays = 0;

        while(activeCases >0){
           activeCases = activeCases+newCases - recovers;
           howManyDays++;
        }


        return howManyDays;
    }
}
