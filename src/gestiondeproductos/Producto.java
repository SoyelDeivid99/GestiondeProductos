package gestiondeproductos;

/**
 * Clase base Producto: representa un artículo de la tienda.
 * Sus atributos son protected para que las clases derivadas puedan usarlos.
 */
public class Producto {

    // protected: visibles para esta clase y para sus subclases
    protected String nombre;
    protected double precio;
    protected int stock;

    // Constructor de la clase base
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