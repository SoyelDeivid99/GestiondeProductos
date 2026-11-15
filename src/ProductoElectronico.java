package gestiondeproductos;

/**
 * Clase derivada: producto electrónico con garantía.
 * Hereda de Producto y agrega su propio atributo y método.
 */
public class ProductoElectronico extends Producto {

    // Atributo único de esta subclase
    private int garantiaMeses;

    public ProductoElectronico(String nombre, double precio, int stock, int garantiaMeses) {
        super(nombre, precio, stock); // constructor de la clase base
        this.garantiaMeses = garantiaMeses;
    }

    // Sobrescritura de mostrarInfo
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("   Garantía: " + garantiaMeses + " meses");
    }

    // Método exclusivo de esta subclase
    public void extenderGarantia(int meses) {
        garantiaMeses += meses;
        System.out.println("Garantía de " + nombre + " extendida a " + garantiaMeses + " meses");
    }
}