package exercicioStatico;

import java.util.Scanner;

public class Cotacao {

    public static void main(String[] args) {

        CurrencyConverter currencyConverter = new CurrencyConverter();

        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price: ");
        currencyConverter.dollarPrice = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        currencyConverter.valorCompra = sc.nextDouble();
        System.out.println("Amount to be paid in reais: " + currencyConverter.converter());

        sc.close();
    }
}
