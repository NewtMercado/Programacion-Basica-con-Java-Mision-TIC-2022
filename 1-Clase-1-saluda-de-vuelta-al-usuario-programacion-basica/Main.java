import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
  String SaluUsuario;
    
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Salude usuario:");
    SaluUsuario=sc.nextLine();
    
    if (SaluUsuario.equals("Hola mundo")){
      System.out.println("Hola usuario");
    }
    
  }
}