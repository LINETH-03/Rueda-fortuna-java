package com.company;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner na = new Scanner(System.in);
        boolean salir = false;
        //varianble para el switch
        int option;
        while (!salir) {
            System.out.println("RUEDA DE LA FORTUNA");
            System.out.println("1. JUGAR");
            System.out.println("0. SALIR");

            try {
                System.out.println(" Seleccione una opción ");
                option = na.nextInt();
                switch (option) {
                    case 1:
                        aleatorio();
                        break;
                    case 0:
                        System.out.println("created by: " + "\n" + "LILY");
                        salir = true;
                        break;
                    default:
                        System.out.println("\n" + "Números validos 1  (0 para salir)");
                }

            } catch (InputMismatchException e) {
                System.out.println("\n" + "Debes insertar un Número" + "\n");
                na.next();
            }
        }
    }


    public static void aleatorio(){
        System.out.println("PREMIOS"+"\n"+"DINERO, AMOR, SALUD, PROSPERIDAD, MANGOS");

        String[] premios ={"DINERO", "AMOR", "SALUD","PROSPERIDAD","MANGOS"};
        String alee = (premios[new Random().nextInt(premios.length)]);
        System.out.println("\n"+"TU PREMIO ES:");
        System.out.println(alee);


    }


}
