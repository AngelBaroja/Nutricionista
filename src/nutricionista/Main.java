/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nutricionista;

import Entidades.*;
import java.util.ArrayList;
import java.util.List;
import persistencia.Conexion;
import persistencia.PacienteData;

/**
 *
 * @author El Angel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Conexion conexion = new Conexion ("jdbc:mysql://localhost/nutricionista", "root", "");
//        PacienteData pacienteData= new PacienteData(conexion);
//        System.out.println(pacienteData.buscarPaciente(1).toString());
//        for (Paciente paciente : pacienteData.listaPaciente()) {
//            System.out.println(paciente.toString());
//        }
//          Paciente paciente =pacienteData.buscarPaciente(1);
//          paciente.setEdad(105);
//          pacienteData.actualizarPaciente(paciente);
//            Paciente paciente2 = new Paciente("Jorge", 28, 1.7f, 68, 72);
//            pacienteData.guardarPaciente(paciente2);
//            pacienteData.borradoFisico(4);
        // Crear alimentos
        Comida licuadoBanana = new Comida(1, "Licuado de Banana", "desayuno", 89, "Banana, leche", true);
        Comida polloArroz = new Comida(2, "Pollo grillado c/ arroz", "almuerzo", 230, "Pollo, arroz", true);
        Comida barraCereal = new Comida(3, "Barra de Cereal", "snack", 150, "Avena, arroz", true);
        Comida cafeTostada = new Comida(4, "Café + tostada", "merienda", 200, "Café, pan, huevo", true);
        Comida pescadoZanahoria = new Comida(5, "Pescado Grill", "cena", 180, "Pescado, zanahoria", true);

        // Crear renglones de menú
        RenglonDeMenu renglon1 = new RenglonDeMenu(licuadoBanana, 1);
        RenglonDeMenu renglon2 = new RenglonDeMenu(polloArroz, 1);
        RenglonDeMenu renglon3 = new RenglonDeMenu(barraCereal, 2);
        RenglonDeMenu renglon4 = new RenglonDeMenu(cafeTostada, 2);
        RenglonDeMenu renglon5 = new RenglonDeMenu(pescadoZanahoria, 1);
               
        // Crear lista de renglones
        List<RenglonDeMenu> renglonesDeMenu = new ArrayList<>();
        renglonesDeMenu.add(renglon1);
        renglonesDeMenu.add(renglon2);
        renglonesDeMenu.add(renglon3);
        renglonesDeMenu.add(renglon4);
        renglonesDeMenu.add(renglon5);

//        // Ingredientes elegidos
//        List<String> ingredientesElegidos = List.of("arroz", "pescado", "huevo");
//
//        // Generar dieta diaria para 3 días
// //       MenuDiario dietaGenerada = MenuDiario.generarDietaDiaria(comidas, ingredientesElegidos, 1);
//        MenuDiario menu = new MenuDiario(1);
//        menu = menu.armarDietaDiaria(renglonesDeMenu);
//
//        // Imprimir los menús generados
//        menu.imprimirMenuDiario();
                        
    }
    
}
