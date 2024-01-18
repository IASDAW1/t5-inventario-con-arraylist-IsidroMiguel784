/*
 * Ejercicio de la Práctica del Inventario para GitHub
 * 
 * @author Isidro M. Honrubia
 */

import java.util.ArrayList;
import java.util.Scanner;

public class inventarioTienda {

   public static void mostrarMenu() {
      System.out.println("MENÚ DE INVENTARIO DE TIENDA");
      System.out.println("1. Agregar productos");
      System.out.println("2. Actualizar inventario");
      System.out.println("3. Buscar productos");
      System.out.println("4. Mostrar invetario actualizado");
      System.out.println("5. Salir");
   }

   public static void main(String[] args) {

      // ATRIBUTOS
      ArrayList<String> lista = new ArrayList<>(); // arraylist provisional.
      Scanner entrada = new Scanner(System.in); // atributo que me va a ayudar a leer los datos por consola.
      Boolean funciona = true; // atributo que controla el menú de opciones, por defecto siempre esta en true.

      mostrarMenu();

      while (funciona) {

         System.out.print("\nIntroduzca opcion deseada (1 al 5): ");
         int op = entrada.nextInt(); // atrubuto local que me va a leer las opciones numéricas que le introduzcamos
                                     // por consola

         switch (op) {
            case 1:

               break;

            case 2:
               break;

            case 3:
               break;

            case 4:
               break;

            case 5:

               // OPCIOM 5. Opción añadida por mi, que hace que el programa termine.
               System.out.println("Saliendo del programa....");
               funciona = false;
               break;

            default:
               System.out.println("Opcion no soportada. Intentelo de nuevo");
               break;
         }

      }

   }
}