
/**
 *
 * @author httpp4t0
 */
public interface CalculoIVA {
    
    double IVA = 0.19;
    
    default int calcularIVA(int precioSinIVA){
        return (int) (precioSinIVA * IVA);
    }
    
}
