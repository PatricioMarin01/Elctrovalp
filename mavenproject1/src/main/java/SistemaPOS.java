
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
    
    
}