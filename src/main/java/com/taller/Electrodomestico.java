package com.taller;

public class Electrodomestico {
    private String consumo;
    private String procedencia;
    private double precioConsumo;
    private double precioProcendencia;
    protected double precioTotal;

    public Electrodomestico(String consumo, String procedencia) {
        this.consumo = consumo;
        this.procedencia = procedencia;
        setPrecioConsumo(this.consumo);
        setPrecioProcendencia(this.procedencia);
        setPrecioTotal();
    }

    public double getPrecioConsumo() {
        return precioConsumo;
    }

    public double getPrecioProcendencia() {
        return precioProcendencia;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioConsumo(String consumo){
        switch (consumo.toLowerCase()) {
            case "a":{
                this.precioConsumo = 450000;
                break;
            }
            case "b":{
                this.precioConsumo = 350000;
                break;
            }
            case "c":{
                this.precioConsumo = 250000;
                break;
            }
            default:{
                this.precioConsumo = 0;
                break;
            }
        }
    }
    public void setPrecioProcendencia(String procedencia){
        switch (procedencia.toLowerCase()) {
            case "nacional":{
                this.precioProcendencia = 250000;
                break;
            }
            case "importado":{
                this.precioProcendencia = 350000;
                break;
            }
            default:{
                this.precioProcendencia = 0;
                break;
            }
        }
    }
    public void setPrecioTotal(){
        precioTotal = precioConsumo + precioProcendencia;
    }

}
