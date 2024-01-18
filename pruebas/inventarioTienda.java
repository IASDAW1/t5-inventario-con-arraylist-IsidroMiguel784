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

      //ATRIBUTOS
       
      ArrayList<String> listaNombre = new ArrayList<>();
      ArrayList<String> listaPrecios = new ArrayList<>();
      ArrayList<String> listaStock = new ArrayList<>();

      Scanner entrada = new Scanner(System.in); // atributo que me va a ayudar a leer los datos por consola.
      Boolean funciona = true; // atributo que controla el menú de opciones, por defecto siempre esta en true.

      mostrarMenu();

      while (funciona) {

         System.out.print("\nIntroduzca opcion deseada (1 al 5): ");
         int op = entrada.nextInt(); // atrubuto local que me va a leer las opciones numéricas que le introduzcamos
                                     // por consola

         switch (op) {
            case 1:
               System.out.print("\nIngresa nombre del producto: ");
               String nombre = entrada.nextLine();
               System.out.print("\nIngresa precio del producto (en €): ");
               String precio = entrada.nextLine();
               System.out.print("\nIntroduce la cantidad en stock del producto: ");
               String cantStock = entrada.nextLine();

               if (!listaNombre.contains(nombre)) {
                  listaNombre.add(nombre);
                  listaPrecios.add(precio);
                  listaStock.add(cantStock);
                  System.out.println("PRODUCTO AÑADIDO CORRECTAMENTE");
               } else {
                  System.out.println("Error: El producto ya existe en la lista");
               }
               break;

            case 2:
               System.out.print("\nIntroduce el nombre del producto a actualizar: ");
               String nombreActualizar = entrada.nextLine();

               if (listaNombre.contains(nombreActualizar)) {
                  int indiceActualizar = listaNombre.indexOf(nombreActualizar);

                  System.out.print("\nIntroduce la cantidad a agregar (positiva) o restar (negativa): ");
                  int cantidadActualizar = entrada.nextInt();

                  // Actualizar la cantidad en stock
                  int stockActual = Integer.parseInt(listaStock.get(indiceActualizar));
                  stockActual += cantidadActualizar;
                  listaStock.set(indiceActualizar, String.valueOf(stockActual));

                  System.out.println("Inventario actualizado para " + nombreActualizar);
               } else {
                  System.out.println("Error: Producto no encontrado.");
               }

               break;

            case 3:
               System.out.print("\nIntroduce el nombre del producto que quieres buscar :");
               String nombreBusqueda = entrada.nextLine();

               if (listaNombre.contains(nombreBusqueda)) {

                  int indice = listaNombre.indexOf(nombreBusqueda);
                  String precioEncontrado = listaPrecios.get(indice);
                  String stockEncontrado = listaStock.get(indice);

                  System.out.print("\nPrecio del producto: " + precioEncontrado);
                  System.out.print("\nStock del producto: " + stockEncontrado);
               } else {
                  System.out.println("Error: Producto no encontrado.");
               }
               break;

            case 4:
               System.out.println("\nMostrando inventario actualizado:");

               for (int i = 0; i < listaNombre.size(); i++) {
                  String nombreProducto = listaNombre.get(i);
                  String precioProducto = listaPrecios.get(i);
                  String stockProducto = listaStock.get(i);

                  System.out.println(
                        "Nombre: " + nombreProducto + ", Precio: " + precioProducto + "€, Stock: " + stockProducto);
               }

               break;

            case 5:
               // OPCION 5. Opción añadida por mi, que hace que el programa termine.
               System.out.println("Saliendo del programa....");
               funciona = false;
               break;

            default:
               System.out.println("Opcion no soportada. Intentelo de nuevo");
               break;
         }

      }
      entrada.close();
   }
}