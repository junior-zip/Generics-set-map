package aplication;

import entities.PrintService;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        PrintService ps = new PrintService();


        System.out.print("Digite uma quantidade: ");
        int n = sc.nextInt();





        for (int i= 0; i < n; i++){

            Integer value = sc.nextInt();
            ps.addValue(value);

        }
        sc.nextLine();
        ps.print();
        Object x = ps.first();


        System.out.println("First: " + x);

        Object y = ps.last();

        System.out.println("Last: " + y);









        sc.close();



    }

}
