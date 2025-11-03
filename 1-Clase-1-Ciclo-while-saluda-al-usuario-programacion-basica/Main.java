import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    
    String Mensaje;
    Mensaje="";
    
    Scanner sc= new Scanner(System.in);
      System.out.println("Salude usuario:");
      Mensaje = sc.nextLine();
    
    while (!Mensaje.equals("salir del juego")){
      System.out.println(Mensaje);
      
      System.out.println("");
      System.out.println("Salude usuario, o ingrese a frase: salir del juego para finalizar");
      System.out.println("");
      Mensaje = sc.nextLine();
      
    }
     System.out.println("El juego ha finalizado");   
  }
}