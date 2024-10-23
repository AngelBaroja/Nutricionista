package Entidades;


public class RenglonDeMenu {

    private int nroRenglon;
    private Comida comida;
    private double cantidadPorciones;
    private double subtotalCalorias;

    public int getNroRenglon() {
        return nroRenglon;
    }

    public void setNroRenglon(int nroRenglon) {
        this.nroRenglon = nroRenglon;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
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

    public RenglonDeMenu(int nroRenglon, Comida comida, double cantidadPorciones) {
        this.nroRenglon = nroRenglon;
        this.comida = comida;
        this.cantidadPorciones = cantidadPorciones;
        this.subtotalCalorias = contadorCalorias();

    }

    public RenglonDeMenu(Comida comida, double cantidadPorciones) {
        this.comida = comida;
        this.cantidadPorciones = cantidadPorciones;
        this.subtotalCalorias = contadorCalorias();

    }

    @Override
    public String toString() {
        return "Numero de Renglon= " + nroRenglon + " Comida=" + comida.getNombre() + " Cantidad de Porciones="
                + cantidadPorciones + " Calorias=" + subtotalCalorias;
    }
    
    public double contadorCalorias(){
        return cantidadPorciones*comida.getCaloriasPorPorcion();
    }

}
