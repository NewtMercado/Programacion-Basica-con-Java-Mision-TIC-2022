import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    int A, B;
    String Operacion;
    Operacion="";
    A=66;
    B=22;
  
    Scanner Sc = new Scanner (System.in);
      
    System.out.println("operaciones arimeticas");
    System.out.println("1.Sumar");
    System.out.println("2.Restar");
    System.out.println("3.Multiplicar");
    System.out.println("Ingrese la operacion arimetica a realizar");     
    Operacion = Sc.nextLine();
  
    switch(Operacion){
    case "Sumar":
        System.out.println("El resultado de la suma es:"+ (A+B));
         break;
      
    case"Restar":
        System.out.println("El resultado de la resta es:"+ (A-B));
        break;
      
    case "Multiplicar":
        System.out.println("El resultado de la multiplicacion es:"+ (A*B));
        break;
      
    default:
        System.out.println("Operacion desconocida");
        break;
        }
  
    
  }
}