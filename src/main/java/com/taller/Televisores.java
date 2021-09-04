package com.taller;

public class Televisores extends Electrodomestico {
    private double tamano, precioTamano, precioTdt;
    private boolean tdt = false;

    public Televisores(String consumo, String procedencia, double tamano, boolean tdt) {
        super(consumo,procedencia);
        this.tamano = tamano;
        this.tdt = tdt;
        setPrecioTamano(this.tamano);
        setPrecioTdt(this.tdt);
        setPrecioTotal();
    }

    public double getPrecioTamano() {
        return precioTamano;
    }

    public double getPrecioTdt() {
        return precioTdt;
    }

    public void setPrecioTamano(double tamano){
        if (tamano > 40){
            this.precioTamano = super.getPrecioTotal()*0.3;
        } else {
            this.precioTamano = 0;
        }
    }
    public void setPrecioTdt(boolean tdt) {
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
