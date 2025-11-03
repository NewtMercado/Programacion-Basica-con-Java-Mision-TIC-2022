class Main {
  public static void main(String[] args) {
    int i;
    int[] Enteros = new int[10];

    for (i = 0; i < Enteros.length; i++) {
      Enteros[i] = (int) Math.floor(Math.random() * 10 + 1);
    }
    int Suma = 0;
    for (i = 0; i < Enteros.length; i++) {
      System.out.print(Enteros[i] + " ");
      Suma = Suma + Enteros[i];
    }
    System.out.print("\n");
    System.out.print("la suma es: " + Suma);
  }
}