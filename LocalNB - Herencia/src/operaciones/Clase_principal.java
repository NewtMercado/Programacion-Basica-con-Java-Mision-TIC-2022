
package operaciones;

import java.util.Scanner;

public class Clase_principal {
    protected int Valor1,Valor2;
    protected double Resultado;
    
    Scanner sc = new Scanner (System.in);
    
    public void PedirDatos(){
        System.out.println("Ingrese el dato 1:");
        Valor1 = sc.nextInt();
        System.out.println("Ingrese el dato 2:");
        Valor2 = sc.nextInt();
    }
    
    public void MostrarResultado(){
        System.out.println("El resultado de la operacion es: "+Resultado);
    }
}
