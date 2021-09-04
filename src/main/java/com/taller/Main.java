package com.taller;

public class Main {
    public static void main(String[] args) {
        Electrodomestico electrodomestico1 = new Electrodomestico("a","imPOrTado");
        Televisores televisores1 = new Televisores("c", "nacional" , 39, true);
        Neveras neveras1 = new Neveras("b", "importado", 180);
        System.out.println(neveras1.getPrecioTotal());
    }
}
