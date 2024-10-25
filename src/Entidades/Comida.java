package Entidades;

public class Comida {

    private int codComida;
    private String nombre;
    private String tipoComida;
    private int caloriasPorPorcion;
    private String detalle;
    private boolean baja;

    public int getCodComida() {
        return codComida;
    }

    public int getCaloriasPorPorcion() {
        return caloriasPorPorcion;
    }

    public void setCaloriasPorPorcion(int caloriasPorPorcion) {
        this.caloriasPorPorcion = caloriasPorPorcion;
    }

    public void setCodComida(int conComida) {
        this.codComida = conComida;
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

    public Comida(int codComida, String nombre, String tipoComida, int caloriasPorPorcion, String detalle, boolean baja) {
        this.codComida = codComida;
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
        return "Alimento{" + "conComida=" + codComida + ", nombre=" + nombre + ", tipoComida=" + tipoComida + ", caloriasPorPorcion=" + caloriasPorPorcion + ", detalle=" + detalle + ", baja=" + baja + '}';
    }

}
