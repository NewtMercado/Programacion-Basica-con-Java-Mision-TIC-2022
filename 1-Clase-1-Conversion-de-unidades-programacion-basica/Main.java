import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
  int KMetros, Metros=0,CMetros=0;
    
    Scanner sc=new Scanner (System.in);
    
    System.out.println("Conversion de  unidades");
    
    System.out.println("Ingrese la el valor en unidades de Km:");
    KMetros = sc.nextInt();

    Metros = KMetros*(1000/1);
    System.out.println("El resultado de la conversion de" + KMetros + "Km" + "es: " + Metros + " M");
    
    CMetros = Metros*(100/1);
     System.out.println("El resultado de la conversion de" + KMetros + "Km" + "es: " + CMetros + " Cm"); 
    
  }
 
}