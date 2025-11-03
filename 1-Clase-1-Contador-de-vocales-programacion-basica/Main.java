import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String Cadena;
    int Vocales=0;
    int i ;
    Scanner sc = new Scanner (System.in);
   
    System.out.println("Ingresa una palabra, frase u oracion: ");
    Cadena = sc.nextLine();

    for(i=0;i< Cadena.length(); i=i+1){
      if ((Cadena.charAt(i)=='a') || (Cadena.charAt(i)=='e') || (Cadena.charAt(i)=='i') || (Cadena.charAt(i)=='o') || (Cadena.charAt(i)=='u') || (Cadena.charAt(i)=='A') || (Cadena.charAt(i)=='E') || (Cadena.charAt(i)=='I') || (Cadena.charAt(i)=='O') || (Cadena.charAt(i)=='U')){
        Vocales = Vocales+1;
      }
    }
    System.out.println("la cantidad de vocales en el texto ingresado es:"+Vocales);
  }
}



