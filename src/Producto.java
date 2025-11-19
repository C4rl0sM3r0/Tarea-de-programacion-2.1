// Clase base abstracta que define características comunes para todos los productos
public abstract class Producto {
    private String nombre;        // Nombre del producto
    private double precioBase;    // Precio base sin impuestos ni costos extra

    // Constructor para inicializar el nombre y el precio base
    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    // Getter del nombre
    public String getNombre() {
        return nombre;
    }

    // Getter del precio base
    public double getPrecioBase() {
        return precioBase;
    }

    // Setter del precio base (se usa cuando aplicamos descuentos)
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    // Método abstracto: obliga a las subclases a implementar su propia forma de calcular el precio final
    public abstract double calcularPrecioFinal();

    // Método que muestra información general de cualquier producto
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio base: " + precioBase);
    }
}
