package ComplexPack;

public class Complex {
    private static int counter;
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
        setCounter(++counter);
    }

    public Complex(int real) {
        this(real,0);
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Complex.counter = counter;
    }

    public static Complex add(Complex c1, Complex c2) {
        int sumReal = c1.real + c2.real;
        int sumImaginary = c1.imaginary + c2.imaginary;
        Complex result = new Complex(sumReal, sumImaginary);

        return result;

        // 2 wersja:
        // return new Complex(c1.real + c2.real, c1.imaginary + c2.imaginary);

        // 3 wersja:
//        int sumReal = c1.real + c2.real;
//        int sumImaginary = c1.imaginary + c2.imaginary;
//
//        return new Complex(sumReal, sumImaginary);
    }

    public static Complex addMore(Complex... complex) {
        Complex result = new Complex(0, 0);
        for (Complex x : complex) {
            result = add(result, x);
        }
        return result;
    }

    public static boolean areEqueals(Complex complexnumber1, Complex complexnumber2) {
        return complexnumber1.isEquealTo(complexnumber2);
    }

    public Complex subtract(Complex c1, Complex c2) {
        int sumReal = c1.real - c2.real;
        int sumImaginary = c1.imaginary - c2.imaginary;
        return new Complex(sumReal, sumImaginary);
    }

    public boolean isEquealTo(Complex complexNumber) {
        return this.real == complexNumber.real && this.imaginary == complexNumber.imaginary;
    }

    public void increaseTwoDifferent(int realAdder, int imaginaryAdder) {
        this.real += realAdder;
        this.imaginary += imaginaryAdder;
    }

    public void increaseTwoEqueal(int adder) {
        increaseTwoDifferent(adder,adder);
    }

    public void increaseReal(int realAdder) {
        increaseTwoDifferent(realAdder, 0);
    }

    public void increaseImaginary(int imaginaryAdder) {
        increaseTwoDifferent(0, imaginaryAdder);
    }


    public void print() {
        // 2 + 3*i
        // TODO: pamiętaj o przypadkach, gdy część
        // urojona jest równa zero lub mniejsza od zera
        System.out.println(this.real + " + " + this.imaginary + "*i");
    }
}