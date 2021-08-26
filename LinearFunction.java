package posection.functionTypes;

import posection.Function;

public class LinearFunction extends Function{

    public LinearFunction(int coeficient, int freeNum) {
        super(coeficient, freeNum);
    }

    @Override
    public String toString() {
        return "LinearFunction: " + super.getCoeficient() + " * x + " + super.getFreeNum();
    }
    
    @Override
    public double getValueAtX(double x){
        return super.getCoeficient() * x + super.getFreeNum();
    }
}
