import java.util.ArrayList;
import java.util.List;

// Clase que administra un carrito de compras
public class CarritoCompras {

    private List<Producto> productos; // Lista de productos usando polimorfismo

    // Constructor sin parámetros: inicializa la lista
    public CarritoCompras() {
        this.productos = new ArrayList<>();
    }

    // Agrega un producto a la lista
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    // Limpia todo el carrito
    public void vaciarCarrito() {
        productos.clear();
    }

    // Muestra todos los productos del carrito
    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El carrito está vacío.");
            return;
        }

        // Recorremos la lista e invocamos mostrarInformacion()
        for (Producto p : productos) {
            p.mostrarInformacion(); // Polimorfismo
        }
    }

    // Calcula el total a pagar sumando el precio final de cada producto
    public double calcularTotal() {
        double total = 0;

        for (Producto p : productos) {
            total += p.calcularPrecioFinal(); // Polimorfismo
        }

        return total;
    }
}
