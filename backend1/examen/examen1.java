package examen;

import java.util.Scanner;

public class examen1 {

        public static void main(String[] args) {

            int[] pasos = new int[5];

            int dias = 0;


            Scanner scanner= new Scanner(System.in);


            while (dias < 5) {
                System.out.print("Ingrese la cantidad de pasos para el día " + (dias + 1) + ": ");
                try {

                    int cantidadPasos = Integer.parseInt(scanner.nextLine());

                    if (cantidadPasos < 0) {
                        System.out.println("La cantidad de pasos no puede ser negativa. Inténtalo de nuevo.");
                    } else {

                        pasos[dias] = cantidadPasos;
                        dias++;
                    }
                } catch (Exception e) {
                    System.out.println("Entrada inválida. Por favor, ingresa un número entero.");
                }
            }


            int sumaPasos = 0;
            for (int i = 0; i < pasos.length; i++) {
                sumaPasos += pasos[i];
            }
            double promedioPasos = (double) sumaPasos / pasos.length;


            System.out.println("\nResumen de pasos por día:");
            for (int i = 0; i < pasos.length; i++) {
                System.out.println("Día " + (i + 1) + ": " + pasos[i] + " pasos");
            }


            System.out.printf("Promedio de pasos durante los 5 días: %.2f\n", promedioPasos);


        }
    }


