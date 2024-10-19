/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author Nicolas
 */
public class Dieta {
    private int codDieta;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String Nombre;
    private Paciente paciente;
    private float pesoInicial;
    private float pesoFinal;
    private int calorias;   

    public Dieta(int codDieta, LocalDate fechaInicio, LocalDate fechaFin, String Nombre, Paciente paciente, float pesoInicial, float pesoFinal, int calorias) {
        this.codDieta = codDieta;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.Nombre = Nombre;
        this.paciente = paciente;
        this.pesoInicial = pesoInicial;
        this.pesoFinal = pesoFinal;
        this.calorias = calorias;
    }

    public int getCodDieta() {
        return codDieta;
    }

    public void setCodDieta(int codDieta) {
        this.codDieta = codDieta;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public float getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(int pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public float getPesoFinal() {
        return pesoFinal;
    }

    public void setPesoFinal(int pesoFinal) {
        this.pesoFinal = pesoFinal;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
    public void cargarPesoYFinalizar(float pesoFinal) {
        this.pesoFinal = pesoFinal;
        System.out.println("Peso final cargado: " + pesoFinal); 
    }
    public int calcularDiferDePeso() {
        return (int) (pesoFinal - pesoInicial);
    }
     public Dieta(float pesoInicial) {
        this.pesoInicial = pesoInicial;
        System.out.println("Peso inicial registrado: " + pesoInicial);
     }
      public void imprimirDietaCompleta() {
        System.out.println("Imprimiendo detalles de la dieta...");
    }
}
