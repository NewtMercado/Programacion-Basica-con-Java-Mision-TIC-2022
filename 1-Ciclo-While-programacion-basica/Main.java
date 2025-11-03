

class Main {
  
  public static void main(String[] args) {
  int x, y;
    x = 0;
    y = 5;

    while (x < y){
      System.out.println("X es menor que Y...");
      System.out.println("X: " + x + " y Y: "+ y);
      x = x + 2;
      
    }
     System.out.println("X ya no es menor que Y...");
    System.out.println("X: " + x + " y Y: "+ y);
  }
}