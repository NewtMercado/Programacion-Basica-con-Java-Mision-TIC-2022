class Main {

  public static void main(String[] args) {

    int Columnas, Filas;
    double NotasTeoria, NotaFinal,NotaParcial;
    boolean Resultado;

    String[][] Informacion = { { "Newton", "Mercado", "2.0", "3.4", "5.0" }, { "Yasihn", "Rueda", "4.0", "1.5", "3,0" },
        { "Yanelis", "Correa", "5.0", "1.9", "5.0" } };

    boolean Resultados[] = new boolean[Informacion.length];

    for (Filas = 0; Filas < Informacion.length; Filas = Filas + 1) {
      for (Columnas = 0; Columnas < Informacion[Filas].length; Columnas = Columnas + 1) {
        NotasTeoria = (Double.parseDouble(Informacion[Filas][1]) + Double.parseDouble(Informacion[Filas][2])) / 2;
        NotaParcial= Double.parseDouble(Informacion[Filas][3]);
        NotaFinal = (NotasTeoria * 0.4) + (NotaParcial*0.6);

        if (NotaFinal >= 3.0) {
          Resultados[Filas] = true;
        } else {
          Resultados[Filas] = false;
        }
      }
    }

    for (Filas = 0; Filas < Informacion.length; Filas = Filas + 1) {
      if (Resultados[Filas]) {
        System.out.println("El estudiante: " + Informacion[Filas][0] + "Gano");
      } else {
        System.out.println("El estudiante: " + Informacion[Filas][0] + "Perdio");
      }
    }

  }
}