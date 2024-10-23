/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 * @author Luciano
 */

    public class MenuDiario {
    private int codMenu;
    private int dia;
    private boolean estado;
    private List<RenglonDeMenu> comidas;
    private float pesoActual;

    public MenuDiario(int dia) {
        codMenu= 0;
        this.dia = dia;
        estado = true;
        comidas = new ArrayList<>();
        pesoActual = 0;
    }

    public MenuDiario(int dia, boolean estado, List<RenglonDeMenu> comidas, float pesoActual) {
        this.dia = dia;
        this.estado = estado;
        this.comidas = comidas;
        this.pesoActual = pesoActual;
    }
    
    
    public MenuDiario(int codMenu, int dia, boolean estado, List<RenglonDeMenu> comidas) {
        this.codMenu = codMenu;
        this.dia = dia;
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
    public void alterarDietaDiaria() {
        
    }

    public static MenuDiario generarDietaDiaria(List<Comida> alimentos ,List<String> ingredientes, int dia) {
        MenuDiario menu = new MenuDiario(dia);
        Random random = new Random();
        List<Comida> comidasAlimento = alimentos.stream()
                .filter(comida -> ingredientes.stream().anyMatch(ingrediente -> comida.getDetalle().contains(ingrediente)))
                .collect(Collectors.toList());
        if (comidasAlimento.size() < 5) {
            throw new IllegalArgumentException("No hay suficientes comidas que contengan los ingredientes elegidos.");
        }
        String[] tipo = {"desayuno", "merienda", "snack", "almuerzo", "cena"};
        for (String comi : tipo) {
            List<Comida> comidasTipo = comidasAlimento.stream()
                .filter(c -> c.getTipoComida().equals(comi))
                .toList();
            if (!comidasTipo.isEmpty()) {
                Comida comidafinal = comidasTipo.get(random.nextInt(comidasTipo.size()));
                double cantidadGramos = 1 + (random.nextDouble() * (3 - 1));

                RenglonDeMenu renglon = new RenglonDeMenu(comidafinal, cantidadGramos);
                
                menu.addRenglon(renglon);
            }

        } 
        return menu;
    }

    public MenuDiario armarDietaDiaria(List<RenglonDeMenu> comidas) {
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

    
}


