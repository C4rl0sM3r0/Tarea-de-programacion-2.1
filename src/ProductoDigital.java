// Subclase que representa productos digitales
// No tienen envío ni IVA, pero sí un costo de licencia
public class ProductoDigital extends Producto implements DescuentoAplicable {
    private double costoLicencia;  // Costo adicional del producto digital

    public ProductoDigital(String nombre, double precioBase, double costoLicencia) {
        super(nombre, precioBase);   // Se inicializa desde la clase base
        this.costoLicencia = costoLicencia;
    }

    // Calcula el precio final sumando únicamente la licencia
    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase() + costoLicencia;
    }

    // Aplica un descuento modificando el precio base
    @Override
    public double aplicarDescuento(double porcentaje) {
        double descuento = getPrecioBase() * (porcentaje / 100);
        setPrecioBase(getPrecioBase() - descuento);
        return getPrecioBase();
    }

    // Muestra la información completa del producto digital
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Info general
        System.out.println("Tipo: Digital");
        System.out.println("Costo licencia: " + costoLicencia);
        System.out.println("Precio final: " + calcularPrecioFinal());
        System.out.println("-----------------------------------");
    }
}
