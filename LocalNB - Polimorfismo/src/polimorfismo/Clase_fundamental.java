
package polimorfismo;

public class Clase_fundamental {
    public static void main(String[] args) {
        
        Operaciones_superclase Mensajerosuma = new Subclase_suma();
        
        Mensajerosuma.PedirDatos();
        Mensajerosuma.Operaciones();
        Mensajerosuma.MostrarResultado();
        
        Operaciones_superclase Mensajeroresta = new Subclase_Resta();
        
        Mensajeroresta.PedirDatos();
        Mensajeroresta.Operaciones();
        Mensajeroresta.MostrarResultado();
        
    }
}
