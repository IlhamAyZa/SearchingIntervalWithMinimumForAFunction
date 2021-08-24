package posection;

import java.util.Random;

import java.util.Random;

public class POsection {

    public static void main(String[] args) {

        Function funct = new Function(2, 5);

        //Random rand = new Random();
        //double x = rand.nextDouble() * 10;
        double x = 2;

        double startingDiffSign = sign(funct.getValueAtX(x + 1) - funct.getValueAtX(x));
        System.out.println("Sign at start: " + startingDiffSign);
         
        double diffSign;

        System.out.println(funct.toString());
        
        switch ((int) (startingDiffSign)) {
            case (-1):
                diffSign = -1;
                while (diffSign == -1) {
                    diffSign = sign(funct.getValueAtX(x) - funct.getValueAtX(x - 1));
                    //System.out.println(diffSign);
                    x++;
                }
                System.out.println("The required section is ( " + (x-2) + ", " + (x-1) + " )");
                
            case (0):
                System.out.println("Function is linear and parallel to the x axis.");
                System.out.println("It has no points of minimum");
                
            case (1):
                diffSign = 1;
                while (diffSign == 1) {
                    diffSign = sign(funct.getValueAtX(x + 1) - funct.getValueAtX(x));
                    //System.out.println(diffSign);
                    x--;
                }
                System.out.println("The required section is ( " + (x+1) + ", " + (x+2)  + " )");
                
            case (2):
                System.out.println("Something went wrong!");
        }
    }

    public static int sign(double x) {
        if (x > 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (x < 0) {
            return -1;
        } else {
            return 2;
        }
    }

}
