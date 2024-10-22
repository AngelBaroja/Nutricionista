public class RenglonDeMenu {
    private int nroRenglon;
    private Alimento comida;
    private double cantidadGrs;
    private int subtotalCalorias;
    private int contManz;
    public void modificarRenglon(){
        //?
    }
    public void imprimirRenglon(){
        //?
    }
    public void addAlimento(Alimento a){
        comida = a;
    }
    private int subtotalCalorias(){
       if(comida.getNombre().toLowerCase() == "manzana"){
           contManz++;
       }
       return (comida.getCaloriasPor100g() * contManz); //este es un ejemplo de lo que pondria, pero creo que iria en MenuDia, ya que cada Renglon solo tiene 1 alimento cada uno, y menu tendria para que el contador llege a mas de 1
    }
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

    public double getCantidadGrs() {
        return cantidadGrs;
    }

    public void setCantidadGrs(double cantidadGrs) {
        this.cantidadGrs = cantidadGrs;
    }

    public int getSubtotalCalorias() {
        return subtotalCalorias;
    }

    public void setSubtotalCalorias(int subtotalCalorias) {
        this.subtotalCalorias = subtotalCalorias;
    }

    public RenglonDeMenu() {
    }

    public RenglonDeMenu(int nroRenglon, Alimento comida, double cantidadGrs, int subtotalCalorias) {
        this.nroRenglon = nroRenglon;
        this.comida = comida;
        this.cantidadGrs = cantidadGrs;
        this.subtotalCalorias = subtotalCalorias;
    }

    @Override
    public String toString() {
        return "nroRenglon: " + nroRenglon + ", comida: " + comida + ", cantidadGrs: " + cantidadGrs + ", subtotalCalorias: " + subtotalCalorias;
    }
 
    
    
}
