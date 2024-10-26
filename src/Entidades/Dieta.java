/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;


/**
 *
 * @author Nicolas
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Dieta {
    private int codDieta;
    private String nombreD;
    private List<MenuDiario> menus;
    private LocalDate fechaIni;
    private LocalDate fechaFin;
    private double pesoFinal;
    private boolean estado;
    private int totalCalorias;
    private Paciente paciente;
    private double pesoInicial;

    public Dieta() {
        menus = new ArrayList<>();
    }
    public Dieta(String nombreD, List<MenuDiario> menus, LocalDate fechaIni, LocalDate fechaFin, double pesoFinal, boolean estado, int totalCalorias, Paciente paciente, double pesoInicial) {
        this.nombreD = nombreD;
        this.menus = menus;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.pesoFinal = pesoFinal;
        this.estado = estado;
        this.totalCalorias = totalCalorias;
        this.paciente = paciente;
        this.pesoInicial = pesoInicial;
    }

    public Dieta(int codDieta, String nombreD, List<MenuDiario> menus, LocalDate fechaIni, LocalDate fechaFin, 
        double pesoFinal, boolean estado, int totalCalorias, Paciente paciente, double pesoInicial) {
        this.codDieta = codDieta;
        this.nombreD = nombreD;
        this.menus = menus;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.pesoFinal = pesoFinal;
        this.estado = estado;
        this.totalCalorias = totalCalorias;
        this.paciente = paciente;
        this.pesoInicial = pesoInicial;
    }

    public int getCodDieta() {
        return codDieta;
    }

    public void setCodDieta(int codDieta) {
        this.codDieta = codDieta;
    }

    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    public List<MenuDiario> getMenus() {
        return menus;
    }

    public void setMenus(List<MenuDiario> menus) {
        this.menus = menus;
    }

    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPesoFinal() {
        return pesoFinal;
    }

    public void setPesoFinal(double pesoFinal) {
        this.pesoFinal = pesoFinal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getTotalCalorias() {
        return totalCalorias;
    }

    public void setTotalCalorias(int totalCalorias) {
        this.totalCalorias = totalCalorias;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public double getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(double pesoInicial) {
        this.pesoInicial = pesoInicial;
    }
    
    public void cargarPesoYFinalizar(double pesoFinal) {
        this.pesoFinal = pesoFinal;
        System.out.println("Peso final cargado: " + pesoFinal); 
    }
    public int calcularDiferDePeso() {
        return (int) (pesoFinal - pesoInicial);
    }

    public void imprimirDietaCompleta() {
        System.out.println("Imprimiendo detalles de la dieta...");
        for (MenuDiario menu : menus) {
            menu.imprimirMenuDiario();
            System.out.println("");
        }
    }
    
    @Override
    public String toString(){
        return "Nombre: " + this.nombreD + "\nFecha inicio: " + this.fechaIni 
                + "\nPeso Inicial: " + this.pesoInicial;
    }
}
