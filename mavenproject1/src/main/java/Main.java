
import java.util.ArrayList;




/**
 *
 * @author httpp4t0
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayList<Producto> listaProductos = new ArrayList<>();
                
        Telefono iphone = new Telefono("Iphone x", 890000, "IOS", "x12345");
        Telefono samsung = new Telefono("Samsung j7", 500000, "Android", "x54321");
        Computador computador1 = new Computador("Intel", "Torre", "PC pepe", 600000);
        
        
        SistemaPOS sistema = new SistemaPOS();
        
        sistema.agregarProducto(iphone);
        sistema.agregarProducto(samsung);
        
        
        sistema.listarProductos();
        
        }
       
    }
 
