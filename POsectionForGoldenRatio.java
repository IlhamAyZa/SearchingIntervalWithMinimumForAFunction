package posection;

import java.util.Scanner;
import posection.functionTypes.*;

public class POsectionForGoldenRatio {

    public static void main(String[] args) {

        Function funct = new QuadraticFunction(2, 1, 5);
        //Random rand = new Random();
        //double x = rand.nextDouble() * 10;
        Scanner scn = new Scanner(System.in);
        double accuracy = scn.nextDouble();
        GoldenRatio GR = new GoldenRatio();

        double x = -12, a;
        double num1 = funct.getValueAtX(x - accuracy), num2 = funct.getValueAtX(x), num3 = funct.getValueAtX(x + accuracy);

        if (num1 > num2 && num2 < num3) {
            System.out.println("CASE C");

            x = GR.findMin(num1, num3, 0.001);
            System.out.println("Minimum in: " + x);
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("CASE A");

            do {
                x += accuracy;
                num1 = num2;
                num2 = num3;
                num3 = funct.getValueAtX(x + accuracy);
            } while (num1 > num3);

            if (num1 > num2 && num2 < num3) {
                x = GR.findMin(num1, num3, 0.001);
            }

            System.out.println("Interval: (" + (x - accuracy) + " , " + (x + accuracy) + ")");
            System.out.println("Minimum in: " + x);
        } else if (num1 < num2 && num2 < num3) {
            System.out.println("CASE B");

            do {
                x -= accuracy;
                num3 = num2;
                num2 = num1;
                num1 = funct.getValueAtX(x - accuracy);

                accuracy /= 2;

            } while (num1 < num3);

            if (num1 > num2 && num2 < num3) {
                x = GR.findMin(num1, num3, 0.001);
                System.out.println("Minimum in: " + x);
            }

        }

    }
}
