package com.sanjay.microservices.examples.socialmultiplication;

public class Multiplication {

    private int factorA;

    public int getFactorA() {
        return factorA;
    }

    public int getFactorB() {
        return factorB;
    }

    public int getResult() {
        return result;
    }

    private int factorB;
    private int result;


    public Multiplication(int factorA, int factorB) {
        this.factorA = factorA;
        this.factorB = factorB;
        result = factorA * factorB;
    }



    @Override
    public String toString() {
        return "Multiplication{" +
                "factorA=" + factorA +
                ", factorB=" + factorB +
                ", result (A*B)=" + result +
                '}';
    }

}
