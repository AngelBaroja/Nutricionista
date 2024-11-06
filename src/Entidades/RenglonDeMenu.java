package Entidades;


public class RenglonDeMenu {

    private int nroRenglon;
    private Comida comida;
    private int cantidadPorciones;
    private double subtotalCalorias;
    private MenuDiario menu;

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

    public int getCantidadPorciones() {
        return cantidadPorciones;
    }

    public void setCantidadPorciones(int cantidadPorciones) {
        this.cantidadPorciones = cantidadPorciones;
    }

    public double getSubtotalCalorias() {
        return subtotalCalorias;
    }

    public void setSubtotalCalorias(double subtotalCalorias) {
        this.subtotalCalorias = subtotalCalorias;
    }

    public MenuDiario getMenu() {
        return menu;
    }

    public void setMenu(MenuDiario menu) {
        this.menu = menu;
    } 
    
    public RenglonDeMenu() {
    }

    public RenglonDeMenu(Comida comida, double subtotalCalorias) {
        this.comida = comida;
        this.subtotalCalorias = subtotalCalorias;
    }

    public RenglonDeMenu(Comida comida, int cantidadPorciones, double subtotalCalorias, MenuDiario menu) {
        this.comida = comida;
        this.cantidadPorciones = cantidadPorciones;
        this.subtotalCalorias = subtotalCalorias;
        this.menu = menu;
    }

    public RenglonDeMenu(int nroRenglon, Comida comida, int cantidadPorciones, double subtotalCalorias, MenuDiario menu) {
        this.nroRenglon = nroRenglon;
        this.comida = comida;
        this.cantidadPorciones = cantidadPorciones;
        this.subtotalCalorias = subtotalCalorias;
        this.menu = menu;
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
