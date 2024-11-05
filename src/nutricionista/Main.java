/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nutricionista;

import Entidades.*;
import Vistas.Menu;
import Vistas.VistaRenglonDeMenu;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import persistencia.Conexion;
import persistencia.DietaData;
import persistencia.PacienteData;
import persistencia.MenuDiarioData;

/**
 *
 * @author El Angel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       Conexion conexion = new Conexion ("jdbc:mysql://localhost/nutricionista", "root", "");
//        DietaData dietaData = new DietaData(conexion);
//       MenuDiarioData menuData = new MenuDiarioData(conexion);
//         Dieta diet = dietaData.buscarDieta(2);
//          //diet.setPesoFinal(70);
//       
//         MenuDiario menu = menuData.BuscarMenu(22); //por aca salta error de base de datos, pero aun asi funciona
//       menuData.AlterarDietaDiaria(menu, diet);
        /*PacienteData pacienteData= new PacienteData(conexion);
          DietaData dietaData = new DietaData(conexion);
        System.out.println(pacienteData.buscarPaciente(1).toString());
          System.out.println(dietaData.buscarDieta(1).toString());
        for (Paciente paciente : pacienteData.listaPaciente()) {
            System.out.println(paciente.toString());
        }
          Dieta diet = dietaData.buscarDieta(1);
          diet.setPesoFinal(70);
          dietaData.actualizarDieta(diet);
          Paciente paciente=pacienteData.buscarPaciente(1);
          paciente.setEdad(105);
          pacienteData.actualizarPaciente(paciente);
          Paciente paciente2 = new Paciente("Jorge", 28, 1.7f, 68, 72);
          pacienteData.guardarPaciente(paciente2);
          pacienteData.borradoFisico(4);
          paciente = new Paciente(1, "Jorge", 28, 1.7f, 68, 72);  // ID, Nombre, Edad, Altura, Peso Inicial, Peso Final

        // Crear alimentos
        Comida licuadoBanana = new Comida(1, "Licuado de Banana", "desayuno", 89, "Banana, leche", true);
       Comida polloArroz = new Comida(2, "Pollo grillado c/ arroz", "almuerzo", 230, "Pollo, arroz", true);
        Comida barraCereal = new Comida(3, "Barra de Cereal", "snack", 150, "Avena, arroz", true);
        Comida cafeTostada = new Comida(4, "Café + tostada", "merienda", 200, "Café, pan, huevo", true);
        Comida pescadoZanahoria = new Comida(5, "Pescado Grill", "cena", 180, "Pescado, zanahoria", true);
        Comida huevoRevuelto = new Comida(6, "Huevo Revuelto", "desayuno", 80, "Huevo", true);
        Comida Jugo = new Comida(7, "Jugo de Naranja", "desayuno", 10, "Jugo", true);
        Comida Asado = new Comida(8, "Asado", "cena", 180, "Carne", true);

        // Crear renglones de menú
        RenglonDeMenu renglon1 = new RenglonDeMenu(licuadoBanana, 1);
        RenglonDeMenu renglon2 = new RenglonDeMenu(polloArroz, 1);
        RenglonDeMenu renglon3 = new RenglonDeMenu(barraCereal, 2);
        RenglonDeMenu renglon4 = new RenglonDeMenu(cafeTostada, 2);
        RenglonDeMenu renglon5 = new RenglonDeMenu(pescadoZanahoria, 1);
        RenglonDeMenu renglon6 = new RenglonDeMenu(huevoRevuelto, 2);
        RenglonDeMenu renglon7 = new RenglonDeMenu(Jugo, 2);
        RenglonDeMenu renglon8 = new RenglonDeMenu(Asado, 1);
               
        // Crear lista de renglones
        List<RenglonDeMenu> renglonesDeMenu = new ArrayList<>();
        renglonesDeMenu.add(renglon1);
        renglonesDeMenu.add(renglon2);
        renglonesDeMenu.add(renglon3);
        renglonesDeMenu.add(renglon4);
        renglonesDeMenu.add(renglon5);
        renglonesDeMenu.add(renglon6);
        renglonesDeMenu.add(renglon7);
        renglonesDeMenu.add(renglon8);

        // Ingredientes elegidos
        List<String> ingredientesElegidos = List.of("arroz", "pescado", "huevo");

        // Generar dieta diaria para 3 días
//         MenuDiario dietaGenerada = MenuDiario.generarDietaDiaria(comidas, ingredientesElegidos, 1);
          MenuDiario menu1 = new MenuDiario(1);
          menu1 = menu1.armarDietaDiaria(renglonesDeMenu);
          MenuDiario menu2 = new MenuDiario(2);
          menu2 = menu2.armarDietaDiaria(renglonesDeMenu);
          
          List<MenuDiario> menus = new ArrayList<>();
          menus.add(menu1);
          menus.add(menu2);
          
           Dieta dieta = new Dieta("Dieta balanceada", menus, LocalDate.now(), LocalDate.now().plusDays(7), 70.0, true, 0, paciente, 68.0);
           dieta.imprimirDietaCompleta();
           
           dieta.cargarPesoYFinalizar(69);
           
           System.out.println("Peso inicial: " + dieta.getPesoInicial() + " Peso Final: " + dieta.getPesoFinal());
//           Imprimir los menús generados
//           menu.imprimirMenuDiario(); */
                        
        Menu  VistaMenu = new Menu(); // Crear una instancia de la vista
        VistaMenu.setVisible(true);
       
                
    }
    
}
