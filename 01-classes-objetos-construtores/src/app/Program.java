package app;

import entities.Vehicle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o modelo: ");
        String model = sc.nextLine();
        System.out.println("Digite a placa: ");
        String plate = sc.nextLine();
        System.out.println("Digite o ano do carro: ");
        int year = sc.nextInt();

        Vehicle vehicle1 = new Vehicle(model, plate, year);

        System.out.printf("modelo: %s\n " +
                             "placa: %s\n " +
                             "ano do carro: %d\n",
                              vehicle1.getModel(), vehicle1.getPlate(), vehicle1.getYear()
        );

        sc.close();
    }
}