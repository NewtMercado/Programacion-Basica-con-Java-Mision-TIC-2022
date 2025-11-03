import java.util.Scanner;

class Reto1{

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

  public static double IMC(int Masa, int Altura){
    
    double IMC=0;
    IMC = Masa / (Altura*Altura);
    
    return IMC;
  }

  public static double ValidezDatosEntrada(double Masa, double Altura, int Edad){
 
    if(Masa >= 0 && Masa <= 150  ) && (Altura >= 0.1 && Altura <= 2.5) && (Edad >= 0 && Edad <= 110){
      Respuesta = "CORRECTO";
    }else{
      Respuesta = "ERROR";
    }
   return Respuesta; 
  }
  
    private final Scanner scanner = new Scanner(System.in);

    public String read(){
        return this.scanner.nextLine();
    }

  

 public void run(){
    String[] DatosUsuario = read().split(" ");
    double MasaPersona= double.parseDouble(DatosUsuario[0]);
    double AlturaPersona= double.parseDouble(DatosUsuario[1]);
    int EdadPersona= integer.parseInteger(DatosUsuario[2]);
    
    if(ValidezDatosEntrada(MasaPersona, AlturaPersona, EdadPersona).equals("CORRECTO")){
    double CalculoIMC = IMC(MasaPersona, AlturaPersona);
    CalculoNivelDeRiezgo = NivelRiesgo( CalculoIMC, EdadPersona); 
      
    System.out.println("Respuesta: " +CalculoIMC + ", " + CalculoNivelDeRiezgo);
      
    }else{
      System.out.println(Respuesta);
    }

    
    }
}