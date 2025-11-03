
package hasmap;

import java.util.HashMap;
import java.util.Iterator;

public class HasMap {
    
    public static void ImprimirMapa(HashMap<Integer,String> MapaNombres){
        System.out.println(MapaNombres);
        
     Iterator<Integer> iterador = MapaNombres.keySet().iterator();
    
    while(iterador.hasNext()){
        Integer Llave = iterador.next();
        System.out.println(Llave+".."+MapaNombres.get(Llave));
    }
    }

    public static void main(String[] args) {
    HashMap<Integer,String> MapaNombres = new HashMap<Integer,String>();
    MapaNombres.put(1, "Newton");
    MapaNombres.put(2, "Mercado");
    MapaNombres.put(3,"Chamorro");
    MapaNombres.put(13,null);
    
    ImprimirMapa(MapaNombres);
    
        
    /*Iterator<Integer> iterador = MapaNombres.keySet().iterator();
    
    while(iterador.hasNext()){
        Integer Llave = iterador.next();
        System.out.println(Llave+"..."+MapaNombres.get(Llave));
    }*/
    
    System.out.println(MapaNombres);
    //System.out.println(MapaNombres.keySet());
    //System.out.println(MapaNombres.values());
    
    //MapaNombres.remove(2); //clave
    //System.out.println(MapaNombres);
    //MapaNombres.clear();
    System.out.println(MapaNombres);
    if(MapaNombres.containsValue("Newton")){
        System.out.println("Contiene Newton");
    }else{
        System.out.println("No contiene Newton");
    }
    if(MapaNombres.containsValue(null)){
        System.out.println("Contiene un valor nulo");
    }else{
        System.out.println("No contiene un valor nulo");
    }
    }
    
}


















