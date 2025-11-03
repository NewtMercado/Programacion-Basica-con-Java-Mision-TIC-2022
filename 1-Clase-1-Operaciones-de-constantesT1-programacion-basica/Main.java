import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    int A, B, Resultado=0;
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
  
      if(Operacion.equals("Sumar")){
        Resultado = A+B;
        System.out.println("El resultado de la suma es:"+Resultado );
          
      }else if(Operacion.equals("Restar")){
        Resultado = A-B;
        System.out.println("El resultado de la resta es:"+ Resultado);
          
      }else if(Operacion.equals("Multiplicar")){
        Resultado = A*B;
        System.out.println("El resultado de la multiplicacion es:"+ Resultado);
      
      }else{
        System.out.println("Operacion desconocida");
        
      }
  
    
  }
}