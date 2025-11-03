
public class Main {
 public static void main (String[] args){
     Perro MiMascota1 = new Perro(5,"Apolo","Blanco");
     Perro MiMascota2 = new Perro(10,"Capitan","Negro");
     Perro MiMascota3 = new Perro(5,"Lucas","Marron");
     
     MiMascota1.Ladrar();
     System.out.println(MiMascota1.Nombre);
     System.out.println(MiMascota1.Color);
     System.out.println(MiMascota1.Edad);
 
     MiMascota2.Ladrar();
     System.out.println(MiMascota2.Nombre);
     System.out.println(MiMascota2.Color);
     System.out.println(MiMascota2.Edad);
     
     MiMascota3.Ladrar();
     System.out.println(MiMascota3.Nombre);
     System.out.println(MiMascota3.Color);
     System.out.println(MiMascota3.Edad);
 }
 }
 

