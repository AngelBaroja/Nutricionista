package Entidades;

public class Comida {

    private int conComida;
    private String nombre;
    private String tipoComida;
    private int caloriasPorPorcion;
    private String detalle;
    private boolean baja;

    public int getConComida() {
        return conComida;
    }

    public int getCaloriasPorPorcion() {
        return caloriasPorPorcion;
    }

    public void setCaloriasPorPorcion(int caloriasPorPorcion) {
        this.caloriasPorPorcion = caloriasPorPorcion;
    }

    public void setConComida(int conComida) {
        this.conComida = conComida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public boolean isBaja() {
        return baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }

    public Comida() {
    }

    public Comida(int conComida, String nombre, String tipoComida, int caloriasPorPorcion, String detalle, boolean baja) {
        this.conComida = conComida;
        this.nombre = nombre;
        this.tipoComida = tipoComida;
        this.caloriasPorPorcion = caloriasPorPorcion;
        this.detalle = detalle;
        this.baja = baja;
    }

    public Comida(String nombre, String tipoComida, int caloriasPorPorcion, String detalle, boolean baja) {
        this.nombre = nombre;
        this.tipoComida = tipoComida;
        this.caloriasPorPorcion = caloriasPorPorcion;
        this.detalle = detalle;
        this.baja = baja;
    }

    @Override
    public String toString() {
        return "Alimento{" + "conComida=" + conComida + ", nombre=" + nombre + ", tipoComida=" + tipoComida + ", caloriasPorPorcion=" + caloriasPorPorcion + ", detalle=" + detalle + ", baja=" + baja + '}';
    }

}
