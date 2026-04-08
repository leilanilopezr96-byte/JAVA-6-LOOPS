package loops;

import java.util.Random;
import java.util.Scanner;

public class Retos {
    public static void main(String[] args) {

//        // -- Reto 1
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        System.out.println("Por favor, ingrese el número de participantes:");
//        int participantes = scanner.nextInt();
//        int numeroGanador = random.nextInt(participantes) + 1;
//        System.out.println("El número ganador es: "+ numeroGanador);

//        // -- Reto 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingrese texto para revisar si es palíndromo: ");
//        String texto = scanner.nextLine();
//        String textoMinusculas = texto.toLowerCase().replaceAll("\\s+", "");
//        int i = 0;
//        int j = textoMinusculas.length() -1 ;
//        while (i < j) {
//            if (textoMinusculas.charAt(i) != textoMinusculas.charAt(j)) {
//                System.out.println("El texto no es un palíndromo.");
//                return;
//            }
//            i++;
//            j--;
//        }
//        System.out.println("El texto sí es un palíndromo.");

//        // -- Reto 3
//        Random random = new Random();
//        int numeroRandom = random.nextInt(10) + 1;
//        Scanner scanner = new Scanner(System.in);
//        int numeroUsuario = 0;
//        while (numeroRandom != numeroUsuario){
//            System.out.println("Por favor, adivine el número del 1 al 10: ");
//            numeroUsuario = scanner.nextInt();
//            if (numeroUsuario < numeroRandom){
//                System.out.println("El número random es mayor.");
//            } else if (numeroUsuario > numeroRandom) {
//                System.out.println("El número random es menor.");
//            } else {
//                System.out.println("Usted ha adivinado el número random!: " + numeroRandom);
//            }
//        }

//        // -- Reto 4
//        Scanner scanner = new Scanner(System.in);
//        int edadIngresada = 0;
//        double ingresoMensual = 0;
//        double primaMensual = 0;
//        double primaFinal = 0;
//        System.out.println("Por favor, escriba la edad del usuario: ");
//        edadIngresada = scanner.nextInt();
//        System.out.println("Por favor, escriba el ingreso mensual del usuario: ");
//        ingresoMensual = scanner.nextDouble();
//        if (edadIngresada >= 70) {
//            primaMensual = 500;
//        } else if (edadIngresada >= 50 && edadIngresada < 70) {
//            primaMensual = 400;
//        } else if (edadIngresada >= 30 && edadIngresada <50){
//            primaMensual = 250;
//        } else {
//            primaMensual = 100;
//        }
//        if (ingresoMensual >= 300){
//            primaFinal = primaMensual * 1.10;
//        } else {
//            primaFinal = primaMensual * 1.05;
//        }
//        System.out.println("La prima mensual final es de: " + primaFinal);

//        // -- Reto 5
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Por favor, ingrese su usuario: ");
//        String usuario = scanner.nextLine();
//        System.out.println("Por favor, ingrese su contraseña: ");
//        String contrasena = scanner.nextLine();
//        double saldo = 500;
//        int opcion;
//        int opcionDivisas;
//        double saldoDivisas;
//        double saldoUsd;
//        do {
//            System.out.println("MENÚ");
//            System.out.println("1. Consultar saldo");
//            System.out.println("2. Ingresar dinero");
//            System.out.println("3. Retirar dinero");
//            System.out.println("4. Consultar últimos movimientos");
//            System.out.println("5. Convertir divisas");
//            System.out.println("0. Salir...");
//            opcion = scanner.nextInt();
//            switch (opcion) {
//                case 1:
//                    System.out.println("Su saldo es de " + saldo + " pesos.");
//                    break;
//                case 2:
//                    System.out.println("Por favor, ingrese dinero en la caja.");
//                    break;
//                case 3:
//                    System.out.println("Usted cuenta con " + saldo + " pesos disponibles para retirar.");
//                    break;
//                case 4:
//                    System.out.println("A continuación verá sus últimos movimientos.");
//                    break;
//                case 5:
//                    System.out.println("Ha seleccionado la opción de convertir divisas.");
//                    System.out.println("Por favor seleccione una de las siguientes 3 opciones:");
//                    System.out.println("1. Conversión de MXN a USD");
//                    System.out.println("2. Conversión de MXN a EUR");
//                    System.out.println("3. Conversión de USD a EUR");
//                    opcionDivisas = scanner.nextInt();
//                    switch (opcionDivisas) {
//                        case 1:
//                            saldoDivisas = saldo * 0.06;
//                            System.out.println("Su saldo de " + saldo + " pesos equivale a " + saldoDivisas + " USD.");
//                        break;
//                        case 2:
//                            saldoDivisas = saldo * 0.05;
//                            System.out.println("Su saldo de " + saldo + " pesos equivale a " + saldoDivisas + " EUR.");
//                        break;
//                        case 3:
//                            saldoUsd = saldo * 0.06;
//                            saldoDivisas = saldoUsd * 0.86;
//                            System.out.println("Su saldo de " + saldoUsd + " USD equivale a " + saldoDivisas + " EUR.");
//                        break;
//                    }
//                    break;
//                case 0:
//                    System.out.println("Saliendo del programa.");
//                    break;
//            }
//        } while (opcion !=0);

//        // -- Reto 6
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("¿Cuántos números de Fibonacci quiere ver?");
//        int numeros = scanner.nextInt();
//        int a = 0, b = 1;
//        System.out.println("Secuencia de Fibonacci:");
//        for (int i = 0; i < numeros; i++) {
//            System.out.println(a + " ");
//            int siguienteNumero = a + b;
//            a = b;
//            b = siguienteNumero;
//        }
    }
}
