package com.taller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static String calcularPrecio(ArrayList<Electrodomestico> electrodomesticos){
        double precioTotal = 0;
        int size = electrodomesticos.size();
        for (int i = 0; i < size; i++) {
            precioTotal += electrodomesticos.get(i).getPrecioTotal();
        }
        return String.valueOf(precioTotal);
    }
    public static void main(String[] args) throws IOException {
        double precioElectrodomesticos,precioTelevisores,precioNeveras;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
        ArrayList<Electrodomestico> televisores = new ArrayList<>();
        ArrayList<Electrodomestico> neveras = new ArrayList<>();
        boolean running = true;

        while (running){
            System.out.println("Bienvenido de nuevo, porfavor seleccione que tipo de electrodomestico desea: ");
            System.out.println("1) Electrodomestico general.");
            System.out.println("2) Televisor.");
            System.out.println("3) Nevera.");
            System.out.println("4) Salir del programa");
            int opcionElectrodomestico = Integer.parseInt(bufferedReader.readLine());

            switch (opcionElectrodomestico){
                case 1:{
                    System.out.println("Usted a seleccionado ELECTRODOMESTICO GENERAL por favor ingrese su consumo");
                    System.out.println("A) 450000.");
                    System.out.println("B) 350000.");
                    System.out.println("C) 250000.");
                    String consumo = bufferedReader.readLine();
                    System.out.println("Ahora seleccione la procedencia: ");
                    System.out.println("Nacional -> 250000");
                    System.out.println("Importado -> 350000");
                    String procedencia = bufferedReader.readLine();
                    electrodomesticos.add(new Electrodomestico(consumo,procedencia));
                    break;
                }
                case 2:{
                    System.out.println("Usted a seleccionado TELEVISOR por favor ingrese su consumo");
                    System.out.println("A) 450000.");
                    System.out.println("B) 350000.");
                    System.out.println("C) 250000.");
                    String consumo = bufferedReader.readLine();
                    System.out.println("Ahora seleccione la procedencia: ");
                    System.out.println("Nacional -> 250000");
                    System.out.println("Importado -> 350000");
                    String procedencia = bufferedReader.readLine();
                    System.out.println("Ahora ponga el tamaño de su televisor: ");
                    double tamano = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Ahora ponga un si en caso de tener tdt");
                    String stringTdt = bufferedReader.readLine();
                    boolean booleanTdt = stringTdt.equalsIgnoreCase("si");
                    televisores.add(new Televisores(consumo,procedencia,21, booleanTdt));
                    break;
                }
                case 3:{
                    System.out.println("Usted a seleccionado NEVERA por favor ingrese su consumo");
                    System.out.println("A) 450000.");
                    System.out.println("B) 350000.");
                    System.out.println("C) 250000.");
                    String consumo = bufferedReader.readLine();
                    System.out.println("Ahora seleccione la procedencia: ");
                    System.out.println("Nacional -> 250000");
                    System.out.println("Importado -> 350000");
                    String procedencia = bufferedReader.readLine();
                    System.out.println("Ahora ponga la capacidad de su nevera: ");
                    double capacidad = Integer.parseInt(bufferedReader.readLine());
                    neveras.add(new Neveras(consumo,procedencia,capacidad));
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
            System.out.println("Usted lleva " + electrodomesticos.size() + " Electrodomesticos Con un total de: " + Main.calcularPrecio(electrodomesticos));
            System.out.println("Usted lleva " + televisores.size() + " Televisores Con un total de: " + Main.calcularPrecio(televisores));
            System.out.println("Usted lleva " + neveras.size() + " Neveras Con un total de: " + Main.calcularPrecio(neveras));
            System.out.println("------------------------------------------------------------------\n" +
                               "------------------------------------------------------------------");
        }
    }
}
