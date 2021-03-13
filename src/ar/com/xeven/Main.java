package ar.com.xeven;

import java.util.ArrayList;
import java.util.Scanner;

/*
Escriba un algoritmo que indique las paginas a imprimir 1,3-5,10
donde el - representa un rango de paginas -> resultado esperado 1,3,4,5,10
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> hojasAImprmir = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int opcion;
        int pagina;
        int inicio;
        int fin;

        do {
            System.out.println("Impresion de hojas");
            System.out.println("1.Digame los numeros de paginas que desea imprimir ");
            System.out.println("2.Digame el rango de paginas que desea imprimir");
            System.out.println("3.Salir.");
            System.out.print("Introduzca una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion){

                case 1:
                    System.out.print("Digame las paginas: ");
                    pagina = Integer.parseInt(sc.nextLine());
                    hojasAImprmir.add(pagina);
                    break;

                case 2:
                    System.out.print("Desde que pagina ?");
                    inicio = Integer.parseInt(sc.nextLine());
                    System.out.print("Hasta que pagina ?");
                    fin = Integer.parseInt(sc.nextLine());
                    for (int i=inicio;i<=fin;i++){
                        hojasAImprmir.add(i);
                    }
                    break;
                default:
            }
        } while (opcion!=3);

        //muestro las hojas a imprimir
        for (Integer hoja:hojasAImprmir){
            System.out.print(hoja+"\t");
        }


    }
}
