package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //INSTANCIANDO UMA LISTA DE TAXPAYER
        List<TaxPayer> list = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        int numberOfPayers = sc.nextInt();
        sc.nextLine();

        for(int i=1; i<=numberOfPayers; i++) {
            System.out.printf("Tax payer #%d data: %n", i);
            System.out.println("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Anual income: ");
            Double anualIncome = sc.nextDouble();
            sc.nextLine();


            if (ch == 'i') {
                System.out.println("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                sc.nextLine();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            }
            else if (ch == 'c') {
                System.out.println("Number of Employees: ");
                int numberOfEmployees = sc.nextInt();
                sc.nextLine();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        System.out.println("TAXES PAID: ");
        double sum =0;
        for(TaxPayer taxPayer : list) {
            System.out.printf("%s: $ %.2f%n", taxPayer.getName(), taxPayer.tax());
            sum += taxPayer.tax();
        }

        System.out.printf("TOTAL TAXES: $ %.2f", sum);

        sc.close();
    }
}
