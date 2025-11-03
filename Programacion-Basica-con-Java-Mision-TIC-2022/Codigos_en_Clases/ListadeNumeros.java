import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
class Main {
    ArrayList <double> ListaDeNumeros;

  public void LeerSeleccion(){
    Scanner Op = new Scanner(System.in);
    int Opcion=0;

    do{
       System.out.println("Menu de opciones");
      System.out.println("[1]Agregar");
      System.out.println("[2]Buscar");
      System.out.println("[3]Modificar");
      System.out.println("[4]Insertar");
      System.out.println("[5]Eliminar");
      System.out.println("[6]Mostrar");
      System.out.println("[7]Salir");
      System.out.println("¿Cual es su opcion?");
      Opcion=Op.nextInt();

      switch(Opcion){
        case 1:
          AgregarElemento();
          break
        case 2:
          BuscarElemento();
          break
        case 3:
          ModificarElemento();
          break
        case 4:
          InsertarElemento();
          break
        case 5:
          EliminarElemento();
          break
        case 6:
          MostrarElemento();
          break
        default:
          System.out.println("Por favor ingrese una opcion valida");
      }while(Opcion!=7);
    }
  }

  public void AgregarElemento(){
    Scanner el = new Scanner(System.in);
    double Elemento=0;
      System.out.println("¿que numero desea ingresar?");
      Elemento=el.nextDouble();
      ListaDeNumeros.add(Elemento);
  }

  public void BuscarElemento(){
    Scanner el = new Scanner(System.in);
    double Elemento=0;
    int Posicion=0;
      System.out.println("¿que numero desea buscar?");
      Elemento=el.nextDouble();
      Posicion=ListaDeNumeros.indexOf(Elemento); 

    if(Posicion!=-1){
      System.out.println("Si esta: "+Elemento+"y esta en la posicion:"+Posicion);
  }else{
     System.out.println("No esta: "+Elemento);
  }
  }

  public void ModificarElemento(){
  Scanner el = new Scanner(System.in);
    double ElementoInicial=0;
    double ElementoFinal=0;
    int Posicion=0;
    System.out.println("¿que numero desea modificar?");
    ElementoInicial=el.nextDouble();
    Posicion=ListaDeNumeros.indexOf(ElementoInicial); 

    if(Posicion!=-1){
      System.out.println("Si se encontro: "+ElementoInicial+"por cual lo quiere cambiar :");
      ElementoFinal=el.nextDouble();
      ListaDeNumero.set(Posicion,ElementoFinal);
      System.out.println("Cambio realizado con exito");
  }else{
     System.out.println("No se encontro: "+ElementoInicial);
  }
  }

  public void InsertarElemento(){
    Scanner el = new Scanner(System.in);
    double Elemento=0;
    int Posicion=0;
      System.out.println("¿que numero desea ingresar?");
      Elemento=el.nextDouble();
    System.out.println("¿que posicicion desea insertar el numero?");
    Posicion=el.nextInt();
      ListaDeNumeros.add(Posicion,Elemento);
  }

  public void EliminarElemento(){
    Scanner el = new Scanner(System.in);
    double Elemento=0;
    int Posicion=0;
      System.out.println("¿que numero desea eliminar?");
      Elemento=el.nextDouble();
      Posicion=ListaDeNumeros.indexOf(Elemento);
    if(Posicion!=-1){
      System.out.println("Si se encontro: "+Elemento);
      ListaDeNumeros.remove(Posicion);
      System.out.println("Cambio realizado con exito");
  }else{
     System.out.println("No se encontro: "+Elemento);
  }
  }

  public void MostrarElemento(){

  }


  public static void main(String[] args) {




  }
}