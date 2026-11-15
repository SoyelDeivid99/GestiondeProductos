package gestiondeproductos;

/**
 * Clase derivada: producto que caduca.
 * Hereda nombre, precio, stock y todos los métodos de Producto.
 */
public class ProductoPerecedero extends Producto {

    // Atributo único de esta subclase
    private int diasParaCaducar;

    // super(...) llama al constructor de la clase base
    public ProductoPerecedero(String nombre, double precio, int stock, int diasParaCaducar) {
        super(nombre, precio, stock);
        this.diasParaCaducar = diasParaCaducar;
    }

    // Sobrescritura: reutiliza el método de la base con super y agrega información
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("   Caduca en " + diasParaCaducar + " días");
    }

    // Método exclusivo de esta subclase
    public void aplicarDescuentoPorCaducidad() {
        if (diasParaCaducar <= 3) {
            precio = precio * 0.80; // atributo heredado
            System.out.println("Descuento del 20% a " + nombre + ". Nuevo precio: $" + precio);
        } else {
            System.out.println(nombre + " aún no requiere descuento");
        }
    }
}