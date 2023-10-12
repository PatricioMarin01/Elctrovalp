
import java.util.ArrayList;




/**
 *
 * @author httpp4t0
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayList<Producto> listaProductos = new ArrayList<>();
                
        Telefono iphone = new Telefono("Iphone x", 890000, "IOS", "x12345");
        Computador computador1 = new Computador("Intel", "Torre", "PC pepe", 600000);
        
        listaProductos.add(iphone);
        listaProductos.add(computador1);
        
        for (Producto producto : listaProductos) {
            System.out.println(producto.descripcionDetallada());
            System.out.println("------------------------------");
            
        }
        

        
     
    }
    
}
