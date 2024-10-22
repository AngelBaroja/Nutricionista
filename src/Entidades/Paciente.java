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
    private float altura;
    private float pesoActual;
    private float pesoBuscado;
private static List <Paciente> listaPacientes = new ArrayList <> ();
    
    public Paciente(int nroPaciente, String nombre, int edad, float altura, float pesoActual, float pesoBuscado) {
        this.nroPaciente = nroPaciente;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.pesoActual = pesoActual;
        this.pesoBuscado = pesoBuscado;
        listaPacientes.add(this);
    }

    public Paciente(String nombre, int edad, float altura, float pesoActual, float pesoBuscado) {
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

    public float getAltura() {
        return altura;
    }

    public float getPesoActual() {
        return pesoActual;
    }

    public float getPesoBuscado() {
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

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPesoActual(float pesoActual) {
        this.pesoActual = pesoActual;
    }

    public void setPesoBuscado(float pesoBuscado) {
        this.pesoBuscado = pesoBuscado;
        
    }
            
    public void cambiarPesoDeseado(float nuevoPesoBuscado){
        this.pesoBuscado=nuevoPesoBuscado;
        
    }
    
    public void actualizarPesoAct(float nuevoPesoActual){
        this.pesoActual=nuevoPesoActual;
    }
    
   public boolean seAcercaAlPeso(Dieta dieta) {
       double pesoConDieta = this.pesoActual - dieta.getPesoFinal();
       return pesoConDieta == pesoBuscado;
   }
    
   public static List<Paciente> listarLosQueLLegaron(){
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
   

