
package main;

import operaciones.Subclase_resta;
import operaciones.Subclase_suma;
import operaciones.Clase_principal;

public class Clase_fundamental {
    public static void main(String[] args) {
        Subclase_suma mensajerosuma = new Subclase_suma();
        
        mensajerosuma.sumar();
        System.out.print("El Resultado de la suma es: ");
        mensajerosuma.MostrarResultado();
        
        Subclase_resta mensajeroresta = new Subclase_resta();
        mensajeroresta.PedirDatos();
        mensajeroresta.Restar();
        System.out.print("El Resultado de la Resta es: ");
        mensajeroresta.MostrarResultado();
        
}
}