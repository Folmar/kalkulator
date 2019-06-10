package pl.marekfoltyn;

public class Options {
    private double a;
    private double b;
    private int option;
    private double additionEquals;

    public double getAdditionEquals() {
        return additionEquals;
    }

    public void setAdditionEquals(double additionEquals) {
        this.additionEquals = additionEquals;
    }

    public double additionTwoNumbers(double a, double b) {
        return a + b;
    }

    public double substraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public double percentage(double a, double b) {
        return (division(a, b) * 100);
    }

    public double exponentiation(double a) {
        return (a * a);
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public void menu() {
        System.out.println("KALKULATOR");
        System.out.println("==========");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. Wyliczanie procentu");
        System.out.println("6. Potęgowanie (o wykładniku 2)");
        System.out.println("7. Wybierz ponownie");
        System.out.println("8. Zakoncz");
        System.out.println("Wybierz jedną z powyższych opcji naciskając liczbę: ");
    }
}
