
/**
 *
 * @author httpp4t0
 */
abstract class Producto {
    private String nombre;
    private int preciosinIVA;
    
    //Constructor sin parametros
    public Producto() {
    }
    
    //Constructor con parametros

    public Producto(String nombre, int preciosinIVA) {
        this.nombre = nombre;
        this.preciosinIVA = preciosinIVA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPreciosinIVA() {
        return preciosinIVA;
    }

    public void setPreciosinIVA(int preciosinIVA) {
        this.preciosinIVA = preciosinIVA;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", preciosinIVA=" + preciosinIVA + '}';
    }
    
    public abstract String descripcionDetallada ();
}
