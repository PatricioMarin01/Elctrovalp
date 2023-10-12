
/**
 *
 * @author httpp4t0
 */
public class Computador extends Producto {
    
    private String procesador;
    private String tipo;
    
    //Constructor sin parametros
    public Computador() {
        super();
    }
    
    //Constructor con parametros solo computador
    public Computador(String procesador, String tipo) {
        this.procesador = procesador;
        this.tipo = tipo;
    }
    //Constructor con parametros + super
    public Computador(String procesador, String tipo, String nombre, int preciosinIVA) {
        super(nombre, preciosinIVA);
        this.procesador = procesador;
        this.tipo = tipo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Computador{" + "procesador=" + procesador + ", tipo=" + tipo + '}';
    }
    

    @Override
    public String descripcionDetallada() {
        String descripcion = "Computador: " + super.getNombre() + "\nPrecio: " + super.getPreciosinIVA() + "\nProcesador: " + procesador + "\nTipo: " + tipo;
        return descripcion;
    }
    
}
