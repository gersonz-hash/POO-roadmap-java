package exceptionHanding;

import java.util.Scanner;

public class ExceptionHandling {

    public static void ejecutar() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // 🔹 EJERCICIO 1: CALCULADORA
        System.out.println("-------------CALCULADORA-------------");

        try {
            System.out.print("Ingrese el primer numero: ");
            int a = sc.nextInt();

            System.out.print("Ingrese el segundo numero: ");
            int b = sc.nextInt();

            System.out.print("Escoja la operacion (+, -, *, /): ");
            char op = sc.next().charAt(0);

            int resultado = 0;

            switch (op) {
                case '+':
                    resultado = a + b;
                    break;

                case '-':
                    resultado = a - b;
                    break;

                case '*':
                    resultado = a * b;
                    break;

                case '/':
                    if (b == 0) {
                        System.out.println("Error: no se puede dividir entre 0");
                        return;
                    }
                    resultado = a / b;
                    break;

                default:
                    System.out.println("Opcion no valida");
                    return;
            }

            System.out.println("Resultado: " + resultado);

        } catch (Exception e) {
            System.out.println("ERROR: entrada invalida");
            sc.nextLine(); // limpiar error
        }

        // 🔹 LIMPIAR BUFFER
        sc.nextLine();

        // 🔹 EJERCICIO 2: SISTEMA DE REGISTRO
        System.out.println("\n-----------SISTEMA DE REGISTRO--------------");

        try {
            System.out.print("Ingrese su nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese su edad: ");
            int edad = sc.nextInt();

            // 🔹 Validación
            if (edad < 0) {
                System.out.println("Edad no valida");
            } else if (nombre.isEmpty()) {
                System.out.println("Nombre no puede estar vacio");
            } else {
                System.out.println("\nUsuario registrado:");
                System.out.println("Nombre: " + nombre);
                System.out.println("Edad: " + edad);
            }

        } catch (Exception e) {
            System.out.println("ERROR: datos invalidos");
        }
    }
}

