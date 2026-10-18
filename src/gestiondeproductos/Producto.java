package gestiondeproductos;

/**
 * Clase Producto: representa un artículo de la tienda.
 * Cada objeto tiene su propio nombre, precio y existencias.
 */
public class Producto {

    // Atributos privados (encapsulamiento)
    private String nombre;
    private double precio;
    private int stock;

    // Constructor: se ejecuta al crear el objeto con "new"
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Descuenta unidades si hay suficientes en existencia
    public void vender(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Vendidas " + cantidad + " unidades de " + nombre);
        } else {
            System.out.println("Stock insuficiente de " + nombre);
        }
    }

    // Suma unidades al inventario
    public void reabastecer(int cantidad) {
        stock += cantidad;
        System.out.println("Reabastecidas " + cantidad + " unidades de " + nombre);
    }

    // Calcula el valor total del inventario de este producto
    public double valorInventario() {
        return precio * stock;
    }

    // Muestra los datos del producto
    public void mostrarInfo() {
        System.out.println(nombre + " | $" + precio + " | stock: " + stock);
    }
}