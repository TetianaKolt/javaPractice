package tasksFromDoc;

/*
13. Let's Fuel Up!
A vehicle needs 10 times the amount of fuel than the distance it travels.
However, it must always carry a minimum of 100 fuel before setting off.
Create a function which calculates the amount of fuel it needs, given the distance.

Examples
calculateFuel(15) ➞ 150
calculateFuel(23.5) ➞ 235
calculateFuel(3) ➞ 100

 */

import javax.swing.*;

public class Task13 {
    public static void main(String[] args) {
        System.out.println(calculateFuel(23.5));

    }

    public static int calculateFuel(double distance){
        double fuelConsumption = distance*10;
        int fuelConsumptionDefault = 100;

        if(distance>=10){
            return (int)fuelConsumption;
        }
        else {
            return fuelConsumptionDefault;
        }
    }

}
