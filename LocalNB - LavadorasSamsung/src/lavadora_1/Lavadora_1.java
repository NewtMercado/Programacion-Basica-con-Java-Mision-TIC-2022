
package lavadora_1;
import libreria.Funcioneslavadora;
import java.util.Scanner;

public class Lavadora_1 {
    
    public static void main(String[] args) {
        int TipoDeRopa=0, Kilos=0;
        
        System.out.println("La Ropa es: ");
        System.out.println("[1] Blanca ");
        System.out.println("[2] Color ");
        System.out.println("[3] Otros ");
        
        Scanner Rp = new Scanner(System.in);
        System.out.println("Persione un numero :");
        TipoDeRopa = Rp.nextInt();
        
        Scanner Kl = new Scanner(System.in);
        System.out.println("¿Cuantos kilos ingreso?:");
        Kilos = Kl.nextInt();
        
        Funcioneslavadora Mensajero = new Funcioneslavadora(Kilos, TipoDeRopa);
     
        Mensajero.CicloFinalizado();
    }
  
}
