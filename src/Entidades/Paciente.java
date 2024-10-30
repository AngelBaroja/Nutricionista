/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luciano
 */
public class Paciente {
    
    private int nroPaciente;
    private String nombre;
    private int edad;
    private double altura;
    private double pesoActual;
    private double pesoBuscado;
   
    
    public Paciente(int nroPaciente, String nombre, int edad, double altura, double pesoActual, double pesoBuscado) {
        this.nroPaciente = nroPaciente;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.pesoActual = pesoActual;
        this.pesoBuscado = pesoBuscado;        
    }

    public Paciente(String nombre, int edad, double altura, double pesoActual, double pesoBuscado) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.pesoActual = pesoActual;
        this.pesoBuscado = pesoBuscado;       
    }

    public Paciente() {
    }
    

    public int getNroPaciente() {
        return nroPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public double getPesoBuscado() {
        return pesoBuscado;
    }

    public void setNroPaciente(int nroPaciente) {
        this.nroPaciente = nroPaciente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public void setPesoBuscado(double pesoBuscado) {
        this.pesoBuscado = pesoBuscado;
        
    }
            
    public void cambiarPesoDeseado(double nuevoPesoBuscado){
        this.pesoBuscado=nuevoPesoBuscado;
        
    }
    
    public void actualizarPesoAct(double nuevoPesoActual){
        this.pesoActual=nuevoPesoActual;
    }
    
   public boolean seAcercaAlPeso(Dieta dieta) {
       double pesoConDieta = this.pesoActual - dieta.getPesoFinal();
       double cantidadaBajar = this.pesoActual - this.pesoBuscado;
       double porcentajeBajo = pesoConDieta/ cantidadaBajar;
       return porcentajeBajo>=0.65;
   }
    
   public static List<Paciente> listarLosQueLLegaron(ArrayList<Paciente> listaPacientes){
       List<Paciente> pacientesQueLlegaron = new  ArrayList <>();
       for (Paciente p : listaPacientes) {
           if (p.pesoActual == p.pesoBuscado) {
               pacientesQueLlegaron.add(p);
               
           }
           
       }
         return pacientesQueLlegaron;
           
       }

    @Override
    public String toString() {
        return "Paciente{" + "nroPaciente=" + nroPaciente + ", nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", pesoActual=" + pesoActual + ", pesoBuscado=" + pesoBuscado + '}';
    }
   
   
   }
   

