package posection.functionTypes;

import posection.Function;

public class ThirdPowerFunction extends Function{
    
    private int secondCoeficient;
    private int thirdCoeficient;

    public ThirdPowerFunction( int coeficient,  int secondCoeficient, int thirdCoeficient,int freeNum) {
        super(coeficient, freeNum);
        this.secondCoeficient = secondCoeficient;
        this.thirdCoeficient = thirdCoeficient;
    }
    
    @Override
    public String toString() {
        return "QuadraticFunction: " + super.getCoeficient() + " * x ^3 + " + secondCoeficient + " * x^2 + " + thirdCoeficient + " * x + " + super.getFreeNum() ;
    }
    
    @Override
    public double getValueAtX(double x){
        return super.getCoeficient() * Math.pow(x, 3) + secondCoeficient *  Math.pow(x, 2) +  thirdCoeficient *  x + super.getFreeNum();
    }
}
