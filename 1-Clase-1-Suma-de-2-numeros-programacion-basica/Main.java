import java.util.Scanner;

class Main {
  
  
  public static void main(String[] args) {

    int Numero1, Numero2,Resultado=0;
    //resultado va a recibir parametros, por lo que se inicializa en 0
    Scanner Sc=new Scanner (System.in);
    
    System.out.println("Suma de 2 numeros");
    //para la entrada de datos
    
    System.out.println("Ingrese el numero 1:");
    Numero1 = Sc.nextInt();
    //captura el valor y lee lo ingresado

    System.out.println("Ingrese el numero 2:");
    Numero2 = Sc.nextInt();
    //captura el valor y lee lo ingresado

    Resultado= Numero1 + Numero2;
    System.out.println("El resultado de la suma de los 2 numeros es: "+ Resultado);
    
    
    
  }
}