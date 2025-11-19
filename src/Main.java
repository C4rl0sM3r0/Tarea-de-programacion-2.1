public class Main {
    public static void main(String[] args) {

        // Productos físicos
        ProductoFisico laptop = new ProductoFisico("Laptop Gamer", 1200.0, 25.0, 12.0);
        ProductoFisico smartphone = new ProductoFisico("Smartphone X", 800.0, 15.0, 12.0);
        ProductoFisico silla = new ProductoFisico("Silla Oficina", 150.0, 10.0, 12.0);
        ProductoFisico teclado = new ProductoFisico("Teclado Mecánico", 100.0, 8.0, 12.0);

        // Productos digitales
        ProductoDigital curso = new ProductoDigital("Curso Java Avanzado", 50.0, 10.0);
        ProductoDigital ebook = new ProductoDigital("Ebook Clean Code", 20.0, 2.0);
        ProductoDigital musica = new ProductoDigital("Pack Música Lo-Fi", 5.0, 1.0);

        // Crear carrito
        CarritoCompras carrito = new CarritoCompras();

        // Agregar productos al carrito
        carrito.agregarProducto(laptop);
        carrito.agregarProducto(smartphone);
        carrito.agregarProducto(curso);
        carrito.agregarProducto(ebook);
        carrito.agregarProducto(silla);
        carrito.agregarProducto(musica);
        carrito.agregarProducto(teclado);

        // Mostrar productos
        System.out.println("=== CONTENIDO DEL CARRITO ===");
        carrito.mostrarProductos();

        // Mostrar total
        System.out.println("TOTAL GENERAL: $" + carrito.calcularTotal());

        // Vaciar carrito
        carrito.vaciarCarrito();
        System.out.println("\nCarrito vaciado.");
        carrito.mostrarProductos();
    }
}
