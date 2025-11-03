import java.util.Scanner;
class Main {
  public static String NivelRiesgo(double IMC, int Edad){
    String Riesgo=" ";
    if(Edad < 45 && IMC < 22 ){
      Riesgo = "Bajo";
    }
    if(Edad < 45 && IMC >= 22 ){
      Riesgo = "Medio";
    }
    if(Edad >= 45 && IMC < 22 ){
      Riesgo = "Medio";
    }
    if(Edad >= 45 && IMC >= 22 ){
      Riesgo = "Alto";
    }
    return Riesgo;
  }

  public static double IMC(double Masa, double Altura){
    
    double IMC=0;
    IMC = Masa / (Altura*Altura);
    
    return IMC;
  }

  public static boolean ValidezDatosEntrada(double Masa, double Altura, int Edad){
 
    if(Masa > 0 && Masa < 150   && Altura > 0.1 && Altura < 2.5 && Edad > 0 && Edad < 110){
      return true; 
    }else{
      return false; 
    }
   
  }
  

  public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    
    String[] DatosUsuario = sc.nextLine().split(" ");
    double MasaPersona= Double.parseDouble(DatosUsuario[0]);
    double AlturaPersona= Double.parseDouble(DatosUsuario[1]);
    int EdadPersona= Integer.parseInt(DatosUsuario[2]);
    
    if(ValidezDatosEntrada(MasaPersona, AlturaPersona, EdadPersona)){
    double CalculoIMC = IMC(MasaPersona, AlturaPersona);
    String CalculoNivelDeRiezgo = NivelRiesgo( CalculoIMC, EdadPersona); 
      
    //System.out.println(+CalculoIMC + " " + CalculoNivelDeRiezgo);
    System.out.println(String.format("%.1f",CalculoIMC) + " " + CalculoNivelDeRiezgo);
      
    }else{
      System.out.println("ERROR");
    }

  }
}

