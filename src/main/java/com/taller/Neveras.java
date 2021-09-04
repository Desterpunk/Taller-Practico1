package com.taller;

public class Neveras extends Electrodomestico{
    private double capacidad, precioCapacidad;

    public Neveras(String consumo, String procedencia, double capacidad) {
        super(consumo, procedencia);
        this.capacidad = capacidad;
        setPrecioCapacidad(this.capacidad);
        setPrecioTotal();
    }

    public double getPrecioCapacidad() {
        return precioCapacidad;
    }

    public void setPrecioCapacidad(double capacidad) {
        if (capacidad > 120){
            double capacidadExtra = 0, incremento = 0;
            capacidadExtra = Math.floor((capacidad - 120) / 10);
            for (int i = 0; i < capacidadExtra; i++) {
                incremento += 0.05;
            }
            precioCapacidad = this.precioTotal*incremento;
        } else {
            precioCapacidad = 0;
        }
    }
    public void setPrecioTotal(){
        this.precioTotal = this.getPrecioConsumo()+this.getPrecioProcendencia()+this.precioCapacidad;
    }

}
