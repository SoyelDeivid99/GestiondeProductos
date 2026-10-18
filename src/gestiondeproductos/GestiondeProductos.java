/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiondeproductos;

/**
 *
 * @author Marco Esparza Tiger
 */
public class GestiondeProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // Instanciación: se crean tres objetos a partir de la clase Producto
        Producto leche = new Producto("Leche", 28.5, 10);
        Producto pan = new Producto("Pan", 12.0, 25);
        Producto huevo = new Producto("Huevo", 3.5, 60);

        // Prueba de métodos
        leche.mostrarInfo();
        leche.vender(3);
        leche.vender(20);      // provoca "stock insuficiente"
        pan.reabastecer(10);
        huevo.mostrarInfo();

        System.out.println("Valor del inventario de pan: $" + pan.valorInventario());
    }
    
}
