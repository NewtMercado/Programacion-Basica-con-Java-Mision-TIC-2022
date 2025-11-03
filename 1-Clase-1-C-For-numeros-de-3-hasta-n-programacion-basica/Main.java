import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    int Numero=0, Suma=0;
    int i;
    
    Scanner sc= new Scanner(System.in);
    System.out.println("Ingrese un numero mayor a 3");
    Numero = sc.nextInt();

    for(i=3;i<=Numero;i=i+1){
    System.out.println("Numero:"+i);
      Suma =  Suma + i;
    }
  System.out.println("La suma de los numeros es: "+ Suma);
  }
}