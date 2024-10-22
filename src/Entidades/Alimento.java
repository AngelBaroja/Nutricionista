
public class Alimento {
   private int conComida;
   private String nombre;
   private String tipoComida;
   private int caloriasPor100g;
   private String detalle;
   private boolean baja;
  
    public int getConComida() {
        return conComida;
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

    public int getCaloriasPor100g() {
        return caloriasPor100g;
    }

    public void setCaloriasPor100g(int caloriasPor100g) {
        this.caloriasPor100g = caloriasPor100g;
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

    public Alimento() {
    }

    public Alimento(int conComida, String nombre, String tipoComida, int caloriasPor100g, String detalle, boolean baja) {
        this.conComida = conComida;
        this.nombre = nombre;
        this.tipoComida = tipoComida;
        this.caloriasPor100g = caloriasPor100g;
        this.detalle = detalle;
        this.baja = baja;
    }

    @Override
    public String toString() {
        return "conComida: " + conComida + ", nombre: " + nombre + ", tipoComida: " + tipoComida + ", caloriasPor100g: " + caloriasPor100g + ", detalle: " + detalle + ", baja: " + baja + ' ';
    }
  
  
  
}
