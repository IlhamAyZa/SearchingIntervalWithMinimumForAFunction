package posection.functionTypes;

import posection.Function;

public class QuadraticFunction extends Function{
    
    private int secondCoeficient;

    public QuadraticFunction(int coeficient, int secondCoeficient, int freeNum) {
        super(coeficient, freeNum);
        this.secondCoeficient = secondCoeficient;
    }

    @Override
    public String toString() {
        return "QuadraticFunction: " + super.getCoeficient() + " * x ^2 + " + secondCoeficient + " * x + " + super.getFreeNum() ;
    }
    
    @Override
    public double getValueAtX(double x){
        return super.getCoeficient() * Math.pow(x, 2) + secondCoeficient * x +  super.getFreeNum();
    }
    
}
