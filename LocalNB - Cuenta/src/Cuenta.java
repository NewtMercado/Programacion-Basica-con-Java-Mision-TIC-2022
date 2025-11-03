
public class Cuenta {
    private String Titular;
    private double Monto;
    
   public Cuenta(){
       
   }
   public Cuenta(String Titular){
       this.Titular = Titular;
   }

   public String getTitular(){
       return Titular;
   }
   public void MotrarTitular(String Titular){
       this.Titular=Titular;
   }
     public double getMonto(){
       return Monto;
   }
     public void MostrarMonto(double Monto){
       this.Monto=Monto;
   }
     
    public void Ingresar(double Monto){
        
        if (Monto>0){
            this.Monto = this.Monto + Monto;
        }
    }
    public void retirar(double Monto){
        if (this.Monto - Monto < 0){
            this.Monto = 0;
            
        }else{
           this.Monto = this.Monto - Monto; 
        } 
    }
    
    public String Mostrar(){
        return "Cuenta[Titular: "+Titular+", Monto: "+Monto+"]";
    }
    }
