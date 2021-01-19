package oop;

public class Fraction {
    private int numerator, denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator <= 0) {
            this.denominator = denominator;
        }
        else {
            this.denominator = 1;
        }
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
