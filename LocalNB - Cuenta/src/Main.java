
public class Main {
    public static void main(String[] args) {
        
        Cuenta C1 = new Cuenta();
        Cuenta C2 = new Cuenta("Sebastian Chamorro");
        
        C1.MotrarTitular("Newton Mercado");
        C2.MostrarMonto(1000000);
        
        C2.Ingresar(200000);
        C2.retirar(100000);
        
        System.out.println(C1.Mostrar());
        System.out.println(C2.Mostrar());
       
    }
}
