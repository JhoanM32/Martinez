package examen;

import java.util.Scanner;

public class Usuario {

        public static void main(String[] args) {

            Scanner dato = new Scanner(System.in);

            System.out.print("Digite su nombre: ");
            String nombre = dato.nextLine();

            System.out.print("Digite su correo electrónico: ");
            String correo = dato.nextLine();

            System.out.print("Digite su contraseña: ");
            String contrasena = dato.nextLine();

            System.out.println("\n Datos registrados:");
            System.out.println("Nombre: " + nombre);
            System.out.println("Correo electrónico: " + correo);
            System.out.println("Contraseña: " + contrasena);
        }
    }
