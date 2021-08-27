package posection;

import java.util.Scanner;
import posection.functionTypes.*;

public class POsection {

    public static void main(String[] args) {

        Function funct = new QuadraticFunction(2, 1, 5);
        //Random rand = new Random();
        //double x = rand.nextDouble() * 10;
        Scanner scn = new Scanner(System.in);
        double x = -12;
        double accuracy = scn.nextDouble();
        double num1 = funct.getValueAtX(x - accuracy), num2 = funct.getValueAtX(x), num3 = funct.getValueAtX(x + accuracy);

        System.out.println(funct.toString());

        if (num1 > num2 && num2 < num3) {
            System.out.println("CASE C");
            System.out.println("Interval: (" + (x - accuracy) + " , " + (x + accuracy) + ")");
        } 
        else if (num1 > num2 && num2 > num3) {
            System.out.println("CASE A");
            do {                
                x += accuracy;
                num1 = num2;
                num2 = num3;
                num3 = funct.getValueAtX(x + accuracy);
                
            } while(num1 > num3);
            //System.out.println(x);
            System.out.println("Interval: (" + (x - accuracy) + " , " + (x + accuracy) + ")");
        }
        else if (num1 < num2 && num2 < num3) {
            System.out.println("CASE B");
            do {                
                x -= accuracy;
                num3 = num2;
                num2 = num1;
                num1 = funct.getValueAtX(x - accuracy);
                
            } while(num1 < num3);
            //System.out.println(x);
            System.out.println("Interval: (" + (x - accuracy) + " , " + (x + accuracy) + ")");
        } else {
            System.out.println("CASE D");
            System.out.println("THIS ELSE SHOULD NOT BE REACHED");
        }
    }
}
