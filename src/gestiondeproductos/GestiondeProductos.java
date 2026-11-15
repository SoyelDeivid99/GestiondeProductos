package gestiondeproductos;

/**
 * Programa principal: crea objetos de la clase base y de las clases derivadas
 * y prueba los métodos heredados, sobrescritos y exclusivos.
 */
public class GestiondeProductos {

    public static void main(String[] args) {
        // Objeto de la clase base (Unidad 2)
        Producto leche = new Producto("Leche", 28.5, 10);
        leche.mostrarInfo();
        leche.vender(3);

        // Objetos de las clases derivadas (Unidad 3)
        ProductoPerecedero yogurt = new ProductoPerecedero("Yogurt", 18.0, 30, 2);
        ProductoElectronico audifonos = new ProductoElectronico("Audifonos", 350.0, 8, 12);

        System.out.println("\n== Perecedero ==");
        yogurt.mostrarInfo();                    // versión sobrescrita
        yogurt.vender(5);                        // método heredado
        yogurt.aplicarDescuentoPorCaducidad();   // método exclusivo
        yogurt.mostrarInfo();

        System.out.println("\n== Electrónico ==");
        audifonos.mostrarInfo();                 // versión sobrescrita
        audifonos.reabastecer(4);                // método heredado
        audifonos.extenderGarantia(6);           // método exclusivo
        System.out.println("Valor del inventario: $" + audifonos.valorInventario());

        // Polimorfismo: una variable de la clase base puede apuntar a una hija
        System.out.println("\n== Polimorfismo ==");
        Producto p = yogurt;
        p.mostrarInfo();
    }
}