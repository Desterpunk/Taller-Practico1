package com.taller;

public class Televisores extends Electrodomestico {
    double tamano, precioTamano, precioTdt;
    boolean tdt = false;

    public Televisores(String consumo, String procedencia, double tamano, boolean tdt) {
        super(consumo,procedencia);
        this.tamano = tamano;
        this.tdt = tdt;
        setPrecioTamano();
        setPrecioTdt();
        setPrecioTotal();
    }

    public double getPrecioTamano() {
        return precioTamano;
    }

    public double getPrecioTdt() {
        return precioTdt;
    }

    public void setPrecioTamano(){
        if (tamano > 40){
            this.precioTamano = super.getPrecioTotal()*0.3;
        } else {
            this.precioTamano = 0;
        }
    }
    public void setPrecioTdt() {
        if (tdt) {
            this.precioTdt = 250000;
        } else {
            this.precioTdt = 0;
        }
    }
    public void setPrecioTotal() {
        this.precioTotal = this.getPrecioConsumo() + this.getPrecioProcendencia() + this.precioTamano + this.precioTdt;
    }

}
