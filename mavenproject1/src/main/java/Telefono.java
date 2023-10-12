
/**
 *
 * @author httpp4t0
 */
public class Telefono extends Producto {
    
    private String marca;
    private String modelo;
    
    //Constructor sin parametros
    public Telefono() {
    }
    
    //Constructor parametros solo telefono
    public Telefono(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    //Constructor con parametros + super
    public Telefono(String nombre, int preciosinIVA, String marca, String modelo) {
        super(nombre, preciosinIVA);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Telefono{"+ super.toString() + "marca=" + marca + ", modelo=" + modelo + '}';
    }
    

    @Override
    public String descripcionDetallada() {
        return "Telefono: " + super.getNombre() + super.getPreciosinIVA() + marca + modelo;
    }
    
}
