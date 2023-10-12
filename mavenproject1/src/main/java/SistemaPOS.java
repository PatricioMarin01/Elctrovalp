
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author httpp4t0
 */
public class SistemaPOS {

    private ArrayList<Producto> productos = new ArrayList<>();

    public SistemaPOS() {
    }

    public boolean agregarProducto(Producto producto) {
        return productos.add(producto);
    }

    public void listarProductos() {
        System.out.println("------- Lista De Productos------");
        for (Producto producto : productos) {
            System.out.println(producto.descripcionDetallada());
            System.out.println("--------------------------------");         

        }
    }
    
    public final void imprimirBoleta(){
        System.out.println("------------------- Bolate -------------------");
        System.out.println("Fecha de venta: " + LocalDate.now());
        int total = 0;
        
        for (Producto producto : productos )
            System.out.println(producto.getNombre() + " - $" + producto.obtenerPrecioConIVA());
        
              
        
    }
}