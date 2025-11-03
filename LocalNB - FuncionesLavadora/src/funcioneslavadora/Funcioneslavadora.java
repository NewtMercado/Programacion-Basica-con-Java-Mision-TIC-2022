package funcioneslavadora;

public class Funcioneslavadora {
    private int Kilos = 0, TipoDeRopa = 0; 
    private int LlenadoCompleto = 0,  Lavadocompleto = 0, EnjuagadoCompleto = 0 , SecadoCompleto = 0;
    
    public Funcioneslavadora(int Kilos, int TipoDeRopa){
        this.Kilos = Kilos;
        this.TipoDeRopa = TipoDeRopa;
    }
    //Metodos:
    private void Llenado(){
        if(Kilos<=12){
            System.out.println("Llenando...");
            LlenadoCompleto = 1;
        }else{
            System.out.println("Mucha carga de ropa, por favor retire ropa hasta que halla maximo 12 kilos...");
        }
    }
    
    private void Lavado(){
        Llenado();
        if (LlenadoCompleto==1){
          if(TipoDeRopa==1){
              System.out.println("Ropa blanca : lavado suave");
              System.out.println("Lavando..."); 
          Lavadocompleto = 1;
          
          }else if(TipoDeRopa==2){
              System.out.println("Ropa de color : lavado intenso");
              System.out.println("Lavando..."); 
          Lavadocompleto = 1;
          
          }else{
              System.out.println("Ropa (otros): lavado normal");
          System.out.println("Lavando..."); 
          Lavadocompleto = 1;
          }
        }else{
            System.out.println("llene completamente por favor..."); 
        }
      } 
    
    private void Enjuagado(){
       Lavado(); 
       if(Lavadocompleto == 1){
          System.out.println("Enjuagando...");
          EnjuagadoCompleto = 1;
       }else{
         System.out.println("Espere a que finalize el lavado...");  
       }
    }
       
    private void Secado(){
       Enjuagado();
       if(EnjuagadoCompleto == 1){
          System.out.println("Secando...");
          SecadoCompleto = 1;
       }else{
         System.out.println("Espere a que finalize el enjuagado..."); 
       }
     }
    public void CicloFinalizado(){
        if(SecadoCompleto == 1){
        System.out.println("Lavado finalizado, ciclo completo..."); 
        }
    }
    }
    

