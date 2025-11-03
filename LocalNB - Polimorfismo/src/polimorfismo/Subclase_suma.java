
package polimorfismo;


public class Subclase_suma extends Operaciones_superclase { //extends para heredar
    
    public void Sumar(){
        
    }

    @Override
    public void Operaciones() {
        Resultado = Valor1 + Valor2;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
