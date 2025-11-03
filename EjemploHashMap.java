
package ejemplohashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class EjemploHashMap {

    
    public static void main(String[] args) {
        HashMap <String, Float> listaProductos = new HashMap<String, Float>();
     Scanner sc = new Scanner(System.in);
     int opcionelegida = 0;
     float precio;
     String codigo;
     
     while (opcionelegida!=5){
         System.out.println("Ingrese la opcion deseada");
         System.out.println("1. Ingresar Producto");
         System.out.println("2. Modificar Producto");
         System.out.println("3. Mostar todos los Productos");
         System.out.println("4. Eliminar Productos");
         System.out.println("5. Salir");
         opcionelegida = sc.nextInt();
         switch (opcionelegida){
             case 1: 
                 System.out.println("Ingresa el codigo del producto");
                 codigo = sc.next();
                 System.out.println("Ingrese el precio del producto");
                 precio = sc.nextFloat();
                 guardarproducto(codigo, precio, listaProductos);
                 
                 break;
             case 2: 
                 System.out.println("Ingresa el codigo del producto a cambiar");
                 codigo = sc.next();
                 modificarprecio(codigo, listaProductos);
                 //modificaprecio = sc.nextFloat();
                 break;
             case 3:
                 mostrarproducto (listaProductos);
                 break;
             case 4: 
                 System.out.println("Ingresa el codigo del producto");
                 codigo = sc.next();
                 eliminarproducto(codigo, listaProductos);
                 break;
             case 5:
                 break; 
             default:
                 System.out.println("Tienes que ingresar una opcion valida");
                 
         }
         
     }
         
    }
     
    public static void guardarproducto(String codigo, float precio, HashMap<String, Float> listaProductos){
     if (listaProductos.containsKey(codigo)){
         System.out.println("No se puede ingresar el producto. El codigo esta repetido");
         
     }   else{
         listaProductos.put(codigo, precio);
     }
    }
    public static void modificarprecio (String codigo, HashMap<String, Float>listaprecios){
     Scanner sc = new Scanner(System.in)  ;
     if(listaprecios.containsKey(codigo)){
         System.out.println("Ingrese el precio del producto"); 
     listaprecios.put(codigo, sc.nextFloat());
     }else{
         System.out.println("NO hay producto con ese codigo");
     }
    }
    
    public static void mostrarproducto(HashMap<String,Float> listaprecios){
        String clave;
        Iterator<String> productos = listaprecios.keySet().iterator();
        System.out.println("Contiene los siguientes productos:");
        while(productos.hasNext()){
            clave = productos.next();
            System.out.println(clave + " - " + listaprecios.get(clave));
        }
    }

    public static void eliminarproducto(String codigo,HashMap<String,Float> listaprecios){
        if(listaprecios.containsKey(codigo)){
           listaprecios.remove(codigo);
        } else {
            System.out.println("No hay ningun producto con ese codigo");
        }
    }
}
