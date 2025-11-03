import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    
    String Mensaje;
    Mensaje="";
    
    Scanner sc= new Scanner(System.in);
      System.out.println("Salude usuario, o ingrese a frase: salir del juego para finalizar");
    do{  
       Mensaje = sc.nextLine();
       System.out.println("");
       System.out.println(Mensaje);
       System.out.println("");
      
    }while (!Mensaje.equals("salir del juego"));
     System.out.println("El juego ha finalizado");   
  }
}