package com.taller;

import javax.swing.text.StyledEditorKit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];
        boolean running = true;

        while (running){
            System.out.println("Bienvenido de nuevo, porfavor seleccione que tipo de electrodomestico desea: ");
            System.out.println("1) Electrodomestico general.");
            System.out.println("2) Televisor.");
            System.out.println("3) Nevera.");
            System.out.println("4) Salir del programa");
            BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
            int opcionElectrodomestico = Integer.parseInt(bufferedReader1.readLine());

            switch (opcionElectrodomestico){
                case 1:{
                    System.out.println("Usted a seleccionado ELECTRODOMESTICO por favor ingrese su consumo");
                    System.out.println("A) 400000.");
                    System.out.println("B) 350000.");
                    System.out.println("C) 250000.");
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(System.in));
                    String consumo = bufferedReader2.readLine();
                    System.out.println("usted a seleccionado " + consumo.toUpperCase());
                    System.out.println("Ahora seleccione la procedencia: ");
                    System.out.println("Nacional -> 250000");
                    System.out.println("Importado -> 350000");
                    BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(System.in));
                    String procedencia = bufferedReader3.readLine();
                    electrodomesticos[0] = new Electrodomestico(consumo,procedencia);
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    break;
                }
                case 4:{
                    running = false;
                    break;
                }
                default:{
                    System.out.println("Seleccione una opcion valida");
                    break;
                }
            }
            System.out.println("Muchas gracias por su compra");
            System.out.println("Usted lleva " + electrodomesticos.length + " Electrodomesticos");
        }
    }
}
