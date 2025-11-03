import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    int A, B, Resultado=0;
    char Symbol;
    
    A=66;
    B=22;

    Scanner Sc = new Scanner (System.in);
      
    System.out.println("operaciones arimeticas");
    System.out.println("+.Sumar");
    System.out.println("-.Restar");
    System.out.println("*.Multiplicar");
    System.out.println("Ingrese la operacion arimetica a realizar");     
    Symbol = Sc.nextLine().charAt(0);
  
      if(Symbol=='+'){
        Resultado = A+B;
        System.out.println("El resultado de la suma es:"+Resultado );
          
      }else if(Symbol=='-'){
        Resultado = A-B;
        System.out.println("El resultado de la resta es:"+ Resultado);
          
      }else if(Symbol=='*'){
        Resultado = A*B;
        System.out.println("El resultado de la multiplicacion es:"+ Resultado);
      
      }else{
        System.out.println("Operacion desconocida");
        
      }
  
    
  }
}