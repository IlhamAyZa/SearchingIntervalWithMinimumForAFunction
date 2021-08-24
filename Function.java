package posection;

public class Function {
    
    private int coeficient;
    private int freeNum;

    public Function(int coeficient, int freeNum) {
        this.coeficient = coeficient;
        this.freeNum = freeNum;
    }

    public int getCoeficient() {
        return coeficient;
    }

    public void setCoeficient(int coeficient) {
        this.coeficient = coeficient;
    }

    public int getFreeNum() {
        return freeNum;
    }

    public void setFreeNum(int freeNum) {
        this.freeNum = freeNum;
    }

    @Override
    public String toString() {
        return "Function: " + coeficient + " * x^2 + " + freeNum ;
    }
    
    public double getValueAtX(double x){
        return coeficient * Math.pow(x, 2) + freeNum ;
    }
    
}
