
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String Cadena;
    int Espacios=0;
    int i ;
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa una palabra, frase u oracion: ");
    Cadena = sc.nextLine();

    for(i=0;i< Cadena.length(); i=i+1){
      if(Cadena.charAt(i)==' '){
        Espacios= Espacios+1;
      }
    }
    System.out.println("la cantidad de espacios en el texto ingresado es:"+Espacios);
  }
}