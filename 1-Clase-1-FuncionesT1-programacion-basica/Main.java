import java.util.Scanner;

class Main {
  //funcion:
  public static double AreaDelTriangulo(double Base, double Altura){
    double AreaTriangulo;
    AreaTriangulo=(Base*Altura)/2;
    return AreaTriangulo;
  }
  
  public static void main(String[] args) {
    double Base, Altura,AreaTriangulo;
    Scanner sc = new Scanner (System.in);
    System.out.println("Ingrese la base del triangulo:");
    Base = sc.nextDouble();
    System.out.println("Ingrese la altura del triangulo:");
    Altura = sc.nextDouble();

    AreaTriangulo = AreaDelTriangulo(Base, Altura);
    System.out.println("El area del triangulo es:"+AreaTriangulo);
    
      
  
  }
}