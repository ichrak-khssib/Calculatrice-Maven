package tn.devops;

public class Calculatrice {
    public int addition(int a, int b) {
        return a + b;
    }

    public int soustraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division par zéro impossible");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();

        System.out.println("10 + 5 = " + calc.addition(10, 5));
        System.out.println("10 - 5 = " + calc.soustraction(10, 5));
        System.out.println("10 * 5 = " + calc.multiplication(10, 5));
        System.out.println("10 / 5 = " + calc.division(10, 5));
    }
}
