import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {

    int SumaNumeros=0;    
    int NumerosDeNumeros=0;
    double Promedio=0.0;
    double Varianza=0.0;
    double Desviacion=0.0;
    int i;
    double Rango;
    int Valor[] = new int [10];
  
    Scanner sc= new Scanner(System.in);
    System.out.println("Ingresa 10 numeros como muestra");
    
    for(i=0;i<10;i=i+1){
      System.out.println("Ingresa el numero: "+ (NumerosDeNumeros=i+1));
      Valor[i] =sc.nextInt();
      
      SumaNumeros = SumaNumeros + Valor[i];
  }
    sc.close();
    Promedio = SumaNumeros / NumerosDeNumeros; 

    for(i=0;i<10;i=i+1){
     Rango = Math.pow(Valor[i]-Promedio, 2f);
    Varianza = Varianza + Rango;
    }
    
     Varianza = Varianza / 10f; //suma de la diferencia sobre n
    
    Desviacion = Math.sqrt(Varianza);
    System.out.println("El promedio de los datos es: "+ Promedio);
    System.out.println("La varianza estandar de los datos es: "+ Varianza);
    System.out.println("La desviacion estandar de los datos es: "+ Desviacion);
    
  }
}