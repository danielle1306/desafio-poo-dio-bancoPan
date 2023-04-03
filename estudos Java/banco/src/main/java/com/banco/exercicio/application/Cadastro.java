package com.banco.exercicio.application;

import java.util.Locale;
import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {

        //ContaBancaria contaBancaria = new ContaBancaria();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaBancaria contaBancaria;

        System.out.println("Enter account number: ");
        numeroConta.setNumeroConta = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine()
        nomeTitular.setNomeTitular = sc.nextLine();
        System.out.println("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);//para ler a resposta
        if(response == 'y') {
            System.out.println("Enter initial deposit value: ");
            depositoInicial = sc.nextDouble();
            contaBancaria = new ContaBancaria(numeroConta, titularConta, depositoInicial);
        } else {
            contaBancaria = new ContaBancaria(numeroConta, titularConta);
        }


        System.out.println("Account data: ");
        System.out.println(contaBancaria);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double valorDeposito = sc.nextDouble();
        contaBancaria.deposito(valorDeposito);
        System.out.println("Update account data: ");
        System.out.println(contaBancaria);
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double valorSaque = sc.nextDouble();
        contaBancaria.saque(valorsaque);

        sc.close();
    }
}
