
package polimorfismo;

import java.util.Scanner;


public abstract class Operaciones_superclase { //la clase debe ser abstracta para poder almacenar un metodo abstracto
    protected int Valor1,Valor2;
    protected double Resultado;
    
    Scanner sc = new Scanner (System.in);
    
    public void PedirDatos(){
        System.out.println("Ingrese el dato 1:");
        Valor1 = sc.nextInt();
        System.out.println("Ingrese el dato 2:");
        Valor2 = sc.nextInt();
    }
    public abstract void Operaciones(); //definir metoto debe ser abstracta para que sea polimorfismo. (un metodo abstracto)
   
     public void MostrarResultado(){
        System.out.println("El resultado de la operacion es: "+Resultado);
    }
}
