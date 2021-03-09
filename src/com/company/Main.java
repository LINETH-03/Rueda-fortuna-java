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
            System.out.println("\n"+"\n"+"QUIERES SABER QUE DEPARA EL DESTINO?");
            System.out.println("1. QUIERO SABER MI FUTURO");
            System.out.println("0. SALIR! LE TEMO AL EXITO :(");

            try {
                System.out.println(" Ingresa a la opción 1 o ¿Le temes al éxito? ");
                option = na.nextInt();
                switch (option) {
                    case 1:
                        aleatorio();
                        break;
                    case 0:
                        System.out.println("DESPRECIASTE MIS PODERES ADIVINATORIOS: " + "\n" + " BY: LILY");
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
       // System.out.println("PREMIOS"+"\n"+"DINERO, AMOR, SALUD, PROSPERIDAD, MANGOS");

        String[] premios ={"VOLVERAS CON TU EX", "TU CRUSH TE HARA CASO", "TENDRAS SALUD Y ESO ES LO IMPORTANTE","ANDARAS ARREBATA'O EN LA JEEPETA","LOGRARAS TODO LO QUE DESEAS"};
        String alee = (premios[new Random().nextInt(premios.length)]);
        System.out.println("\n"+"PUEDO VER EN TU FUTURO QUE...!  :  "+"\n"+alee);

    }
}
