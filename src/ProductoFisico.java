// Subclase que representa productos físicos
// Hereda de Producto e implementa la interfaz de descuento
public class ProductoFisico extends Producto implements DescuentoAplicable {
    private double costoEnvio;   // Costo adicional del envío
    private double impuestoIVA;  // Porcentaje de IVA

    // Constructor para inicializar los atributos del producto físico
    public ProductoFisico(String nombre, double precioBase, double costoEnvio, double impuestoIVA) {
        super(nombre, precioBase);  // Llamamos al constructor de la clase base
        this.costoEnvio = costoEnvio;
        this.impuestoIVA = impuestoIVA;
    }

    // Calcula el precio final sumando IVA y costo de envío
    @Override
    public double calcularPrecioFinal() {
        double iva = getPrecioBase() * (impuestoIVA / 100); // Cálculo del IVA
        return getPrecioBase() + iva + costoEnvio;           // Precio final completo
    }

    // Aplica descuento modificando el precio base del producto
    @Override
    public double aplicarDescuento(double porcentaje) {
        double descuento = getPrecioBase() * (porcentaje / 100);
        setPrecioBase(getPrecioBase() - descuento);  // Se reduce el precio base
        return getPrecioBase();
    }

    // Muestra toda la información del producto físico
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Se muestra la info general
        System.out.println("Tipo: Físico");
        System.out.println("Costo envío: " + costoEnvio);
        System.out.println("IVA (%): " + impuestoIVA);
        System.out.println("Precio final: " + calcularPrecioFinal());
        System.out.println("-----------------------------------");
    }
}
