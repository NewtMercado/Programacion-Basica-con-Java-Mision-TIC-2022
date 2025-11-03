import java.util.ArrayList;

class Main {
  
  public static void main(String[] args) {
    int i;
    
    ArrayList <String> Array=new ArrayList<String>();

    //agregar elementos
    Array.add("Hola");
    Array.add("Como");
    Array.add("estas");
    Array.add("Hoy");

    
                        //cambia de una linea a otra ->
  Array.forEach((Nombres)->{
    System.out.println(Nombres);
  }                                                                                  // forma 1
  );

    Array.remove(1); //1 es posicion (elimina)

    for(i=0;i<Array.size();i++){        //arraylist siempre utiliza .size
      System.out.println(": "+Array.get(i));                                        // forma 2  
    }
    
  if(Array.contains("Hoy")){
    System.out.println("Si esta Hoy");
  }else{
    System.out.println("No esta Hoy");
  }
    System.out.println("ubicacion de un  elemento: "+Array.indexOf("Hola"));
    System.out.println("tamaño o cantidad de elementos: "+Array.size());
  }
}