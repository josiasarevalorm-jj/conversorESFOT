package com.joel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProcesadorDatos procesador = new ProcesadorDatos();

        while (true) {
            System.out.println("\n--- MENU CONVERSOR ESFOT (EJERCICIO 5) ---");
            System.out.println("1. Ejecutar demostracion con datos por defecto");
            System.out.println("2. Ingresar mis propios datos como String");
            System.out.println("3. Salir");
            System.out.print("Ingrese opcion: ");

            String opcion = sc.nextLine();

            if (opcion.equals("1")) {
                procesador.ejecutarConversiones("22", "850.75", "true");

            } else if (opcion.equals("2")) {
                try {
                    System.out.print("Ingrese edad (ej. 25): ");
                    String edadStr = sc.nextLine();

                    System.out.print("Ingrese salario con decimales (ej. 1250.89): ");
                    String salarioStr = sc.nextLine();

                    System.out.print("¿Esta activo? (true/false): ");
                    String activoStr = sc.nextLine();

                    procesador.ejecutarConversiones(edadStr, salarioStr, activoStr);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Formato numerico invalido al convertir desde String.");
                }

            } else if (opcion.equals("3")) {
                System.out.println("Saliendo...");
                break;

            } else {
                System.out.println("Opcion no valida.");
            }
        }
    }
}
