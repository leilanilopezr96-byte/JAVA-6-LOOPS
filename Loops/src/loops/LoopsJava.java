package loops;

import java.util.Scanner;

public class LoopsJava {
    public static void main(String[] args){
//        //-- Ciclo For
//        for (int i = 1; i <= 10 ; i++) {
//            //Operaciones
//            System.out.println("Contador: " + i);
//        }// for
//
//        // -- Programa que muestre los caracteres de un String
//        String name = "Leila";
//
//        for (int i =0; i < name.length() ; i++) {
//            char caracter = name.toLowerCase().charAt(i);
//            System.out.println("El carácter es: " + caracter);
//        }
//
//        //ForEach
//        for (char caracter : name.toCharArray()){
//            System.out.println(caracter);
//        }

        // Tablas de multiplicar
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el número de la tabla que desees (1-10)");
        int num = scanner.nextInt();

        // -- For, 1-10
        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }


    } //main
} //clase
