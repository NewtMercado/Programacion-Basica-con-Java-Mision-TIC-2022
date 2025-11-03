import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
  int NumA, NumB;
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Ingrese el numero 1:");
    NumA = sc.nextInt();
    
    System.out.println("Ingrese el numero 2:");
    NumB = sc.nextInt();

    if (NumA>NumB){
      System.out.println("A es mayor");
    }else{
      System.out.println("B es mayor o igual");
    }
      
    
  }
}