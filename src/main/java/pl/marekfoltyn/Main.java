package pl.marekfoltyn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Options options = new Options();

        options.menu();
        options.setOption(scanner.nextInt());
        System.out.println();
        if (options.getOption() >= 1 && options.getOption() <= 5) {
            System.out.print("Podaj pierwszą liczbę: ");
            options.setA(scanner.nextDouble());
            System.out.print("Podaj drugą liczbę: ");
            options.setB(scanner.nextDouble());
        } else if (options.getOption() == 6) {
            System.out.print("Podaj liczbę: ");
            options.setA(scanner.nextDouble());
        } else if (options.getOption() == 7) {
            options.menu();
        } else if (options.getOption() == 8) {
            System.out.println("KONIEC");
        }

        switch (options.getOption()) {
            case 1:
                System.out.println(options.additionTwoNumbers(options.getA(), options.getB()));
                break;
            case 2:
                System.out.println(options.substraction(options.getA(), options.getB()));
                break;
            case 3:
                System.out.println(options.multiplication(options.getA(), options.getB()));
                break;
            case 4:
                System.out.println(options.division(options.getA(), options.getB()));
                break;
            case 5:
                System.out.println(options.percentage(options.getA(), options.getB()));
                break;
            case 6:
                System.out.println(options.exponentiation(options.getA()));
                break;
            case 7:


        }

    }

    /*    public static void*/


}
