/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Luciano
 */

    public class MenuDiario {
    private int codMenu;
    private int dia;
    private int CaloriasMenu;
    private boolean estado;
    private static List<RenglonComida> comidas ;
    private float pesoActual;

    public MenuDiario(int codMenu, int dia, int CaloriasMenu, boolean estado, List<RenglonComida> comidas) {
        this.codMenu = codMenu;
        this.dia = dia;
        this.CaloriasMenu = CaloriasMenu;
        this.estado = estado;
        this.comidas = comidas;
    }

    public int getCodMenu() {
        return codMenu;
    }

    public void setCodMenu(int codMenu) {
        this.codMenu = codMenu;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getCaloriasMenu() {
        return CaloriasMenu;
    }

    public void setCaloriasMenu(int CaloriasMenu) {
        this.CaloriasMenu = CaloriasMenu;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<RenglonComida> getComidas() {
        return comidas;
    }

    public void setComidas(List<RenglonComida> comidas) {
        this.comidas = comidas;
    }
 public void alterarDietaDiaria() {
     
    }

    public MenuDiario generarDietaDiaria() {
      
        return new MenuDiario();
    }

    public MenuDiario armarDietaDiaria() {

        return new MenuDiario();
    }

    public void addRenglon(RenglonDeMenu renglon) {
     
    }

    public int calcularCaloriasDelDia() {
   
        return 0;
    }

    public void imprimirMenuDiario() {
        
   }



    private MenuDiario() {
        
    } 


