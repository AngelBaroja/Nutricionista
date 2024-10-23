package Entidades;


public class RenglonDeMenu {

    private int nroRenglon;
    private Alimento comida;
    private double cantidadPorciones;
    private double subtotalCalorias;

    public int getNroRenglon() {
        return nroRenglon;
    }

    public void setNroRenglon(int nroRenglon) {
        this.nroRenglon = nroRenglon;
    }

    public Alimento getComida() {
        return comida;
    }

    public void setComida(Alimento comida) {
        this.comida = comida;
    }

    public double getCantidadPorciones() {
        return cantidadPorciones;
    }

    public void setCantidadPorciones(double cantidadPorciones) {
        this.cantidadPorciones = cantidadPorciones;
    }

    public double getSubtotalCalorias() {
        return subtotalCalorias;
    }

    public void setSubtotalCalorias(double subtotalCalorias) {
        this.subtotalCalorias = subtotalCalorias;
    }

    public RenglonDeMenu() {
    }

    public RenglonDeMenu(int nroRenglon, Alimento comida, double cantidadPorciones) {
        this.nroRenglon = nroRenglon;
        this.comida = comida;
        this.cantidadPorciones = cantidadPorciones;
        this.subtotalCalorias = contadorCalorias();

    }

    public RenglonDeMenu(Alimento comida, double cantidadPorciones) {
        this.comida = comida;
        this.cantidadPorciones = cantidadPorciones;
        this.subtotalCalorias = contadorCalorias();

    }

    @Override
    public String toString() {
        return "RenglonDeMenu{" + "nroRenglon=" + nroRenglon + ", comida=" + comida + ", cantidadPorciones=" + cantidadPorciones + ", subtotalCalorias=" + subtotalCalorias + '}';
    }
    
    public double contadorCalorias(){
        return cantidadPorciones*comida.getCaloriasPorPorcion();
    }

}
