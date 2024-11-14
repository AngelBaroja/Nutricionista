/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 *
 * @author Luciano
 */

    public class MenuDiario {
    private int codMenu;
    private int dia;

    public boolean isRenglones() {
        return renglones;
    }

    public void setRenglones(boolean renglones) {
        this.renglones = renglones;
    }
    private boolean estado;
    private List<RenglonDeMenu> comidas;
    private boolean renglones;
    private Dieta dieta;

    public MenuDiario(int dia) {
        this.dia = dia;
        estado = true;
        comidas = new ArrayList<>();
        this.dieta = null;
    }

    public MenuDiario() {
    }
   
    public MenuDiario(int dia, boolean estado, List<RenglonDeMenu> comidas, Dieta dieta) {
        this.dia = dia;
        this.estado = estado;
        this.comidas = comidas;
        this.dieta = dieta;
    }
    
    

    public MenuDiario(int codMenu, int dia, boolean estado, List<RenglonDeMenu> comidas, Dieta dieta) {
        this.codMenu = codMenu;
        this.dia = dia;
        this.estado = estado;
        this.comidas = comidas;
        this.dieta = dieta;
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

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }
    
    public void setDia(int dia) {
        this.dia = dia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<RenglonDeMenu> getComidas() {
        return comidas;
    }

    public void setComidas(List<RenglonDeMenu> comidas) {
        this.comidas = comidas;
    }    

    public static MenuDiario generarDietaDiaria(List<Comida> alimentos, List<String> ingredientes, int dia) {
    MenuDiario menu = new MenuDiario(dia);
    Random random = new Random();

    List<Comida> comidasAlimento = alimentos.stream()
        .filter(comida -> ingredientes.stream()
                .anyMatch(ingrediente -> 
                    comida.getDetalle().toLowerCase().contains(ingrediente.toLowerCase())
                ))
        .collect(Collectors.toList());

    String[] tipos = {"desayuno", "merienda", "snack", "almuerzo", "cena"};
    for (String tipo : tipos) {
        long count = comidasAlimento.stream()
            .filter(c -> c.getTipoComida().equalsIgnoreCase(tipo))
            .count();
        
        if (count == 0) {
            JOptionPane.showMessageDialog(null, "No hay suficientes comidas para el tipo: " + tipo, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    for (String tipo : tipos) {
        List<Comida> comidasTipo = comidasAlimento.stream()
            .filter(c -> c.getTipoComida().equalsIgnoreCase(tipo))
            .toList();
        
        Comida comidafinal = comidasTipo.get(random.nextInt(comidasTipo.size()));
        int cantidadPorciones = 1 + random.nextInt(3);

        RenglonDeMenu renglon = new RenglonDeMenu(comidafinal, cantidadPorciones, comidafinal.getCaloriasPorPorcion());
        menu.addRenglon(renglon);
    }

    return menu;
}


    public MenuDiario armarDietaDiaria(List<RenglonDeMenu> comidas, Dieta dieta) {
        MenuDiario menu = new MenuDiario(dia);
        for (RenglonDeMenu comida : comidas) {
            menu.addRenglon(comida);
        }
        return menu;
    }

    public void addRenglon(RenglonDeMenu renglon) {
        this.comidas.add(renglon);
    }

    public int calcularCaloriasDelDia() {
        int totalCalorias = 0;
        for (RenglonDeMenu renglon : comidas) {
            totalCalorias += renglon.getSubtotalCalorias();
        }
        return totalCalorias;
    }

    public void imprimirMenuDiario() {
        System.out.println("Dia " + dia + ": " + calcularCaloriasDelDia() + " kcal");
        for (RenglonDeMenu renglon : comidas) {
            System.out.println(renglon.getComida().getNombre());
        }
   }   
    
  @Override
    public String toString() {
        String diaEscrito="Lunes";
        switch (dia) {
            case 1:diaEscrito="Lunes       ";break;
            case 2:diaEscrito="Martes     ";break;
            case 3:diaEscrito="Miercoles";break;
            case 4:diaEscrito="Jueves     ";break;
            case 5:diaEscrito="Viernes   ";break;
            case 6:diaEscrito="Sabado     ";break;
            case 7:diaEscrito="Domingo   ";break;
        }
        return diaEscrito+" / "+dieta.getCodDieta()+" / "+dieta.getNombreD()+", "+dieta.getPaciente().getNombre();
    }
    
}


