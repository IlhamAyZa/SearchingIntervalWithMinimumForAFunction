package posection;

import posection.functionTypes.*;

public class POsection {

    public static void main(String[] args) {

        Function funct = new QuadraticFunction(2, 1, 5);
        //Random rand = new Random();
        //double x = rand.nextDouble() * 10;
        double x = 2;
        double accuracy = 0.1;

        double startingDiffSign = sign(funct.getValueAtX(x + 1) - funct.getValueAtX(x));
        System.out.println("Sign at start: " + startingDiffSign + ", starting x = " + x);
        
        double diffSign;
        System.out.println(funct.toString());
        System.out.println("");
        
        switch ((int) (startingDiffSign)) {
            case (-1):
                diffSign = -1;
                while (diffSign == -1) {
                    diffSign = sign(funct.getValueAtX(x) - funct.getValueAtX(x - accuracy));
                    System.out.println("diffSign = " + diffSign + " , x = " + x);
                    x+=accuracy;
                }
                System.out.println("The required section is ( " + (x-2*accuracy) + ", " + (x-accuracy) + " )");
                
            case (0):
                System.out.println("Function is linear and parallel to the x axis.");
                System.out.println("It has no points of minimum");
                
            case (1):
                diffSign = 1;
                while (diffSign == 1) {
                    diffSign = sign(funct.getValueAtX(x + accuracy) - funct.getValueAtX(x));
                    System.out.println("diffSign = " + diffSign + " , x = " + x);
                    x-=accuracy;
                }
                System.out.println("The required section is ( " + (x+accuracy) + ", " + (x+2*accuracy)  + " )");
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
        }
        return 2;
    }
}
