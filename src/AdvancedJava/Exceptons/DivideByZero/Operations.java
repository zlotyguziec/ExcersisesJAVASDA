package AdvancedJava.Exceptons.DivideByZero;

public class Operations {

    public static double divide(double x, double y) throws OperationsExceptions{
        if (y==0){
            throw new OperationsExceptions("CannotDivideBy0Exception");
        } else {
            return x/y;
        }
    }

}
