package application;

import entities.Employee;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.println("Digite seu nome: ");
        employee.name = sc.nextLine();
        System.out.println("Digite seu salário bruto: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Digite seu o imposto: ");
        employee.tax = sc.nextDouble();
        System.out.println("Which percentage to increase your salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);


        System.out.println("-------------------------------");
        System.out.println("Employee: " + employee + ", $" + employee.NetSalary());



        sc.close();

    }
}
