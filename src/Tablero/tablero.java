package src.Tablero;

public class tablero{
    //Reset
    public static final String ANSI_RESET = "\u001B[0m";
    //Colores Letra
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    //Colores Fondo
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";

    private src.Casilla[][] casillas;
    private final int x,y;
    private boolean juegoEnBlancas;

    private String[][] mostrarTablero;

    public tablero(int x, int y, boolean juegoEnBlancas){
        this.juegoEnBlancas = juegoEnBlancas;
        this.x = x;
        this.y = y;
        casillas = new src.Casilla[x][y];
        inicializarTablero();
        generarFichas(0, 3, true, "░░");
        generarFichas(5, 8, false, "░░");

    }

    public void generarCasillas(){
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < mostrarTablero.length; j++) {
                if(i <= 2){
                    if((i + j) % 2 == 0){
                        mostrarTablero[i][j] = ANSI_BLACK_BACKGROUND+"  "+ANSI_RED+"O"+"  " + ANSI_RESET;
                        System.out.println(mostrarTablero[i][j]);
                    }
                    else{
                        mostrarTablero[i][j] = ANSI_BLACK_BACKGROUND + "     " + ANSI_RESET;
                    }
                }
                else if(i >= 5 && i <= 7){
                    if((i + j) % 2 == 0){
                        mostrarTablero[i][j] =ANSI_BLACK_BACKGROUND+"  "+ANSI_YELLOW+"x"+"  " + ANSI_RESET;
                        System.out.println(mostrarTablero[i][j]);
                    }
                    else{
                        mostrarTablero[i][j] = ANSI_BLACK_BACKGROUND + "     " + ANSI_RESET;
                    }
                }
                else{
                    mostrarTablero[i][j] = ANSI_BLACK_BACKGROUND + "     " + ANSI_RESET;
                }
            }
            System.out.println(" ");
        }
    }

    private void generarFichas(int ini, int cant, boolean esBlanca, String id){
        for (int i = ini; i < cant; i++) {
            for (int j = 0; j < x; j++) {
                if (casillas[j][i].getEsColor() == !juegoEnBlancas){
                    casillas[j][i].setFicha(new Ficha(!esBlanca, id ));
                }
            }
        }
    }

    public boolean moverFicha(int posXIni, int posYIni, int posXFin, int posYFin){
        boolean resultado = false;
        if (casillas[posXIni][posYIni].ocupadaPorFicha()){
            if (!casillas[posXFin][posYFin].ocupadaPorFicha()){
                casillas[posXFin][posYFin].setFicha(casillas[posXIni][posYIni].getFicha());
                resultado = true;
            }
        }
        return resultado;
    }

    public boolean  comerFicha(int posXIni, int posYIni, int posXFin, int posYFin){
        boolean resultado = false;
        if (casillas[posXIni][posYIni].ocupadaPorFicha()){
            if (casillas[posXFin][posYFin].ocupadaPorFicha()){
                casillas[posXFin][posYFin].desocupadaPorFicha();
                casillas[posXFin][posYFin].setFicha(casillas[posXIni][posYIni].getFicha());
                resultado = true;
            }
        }
        return resultado;
    }

    private void inicializarTablero() {
        boolean esColorInicio = false;
        boolean esColorIteracion = false;
        for (int i = 0; i < y; i++) {
            esColorIteracion = !esColorInicio;
            for (int j = 0; j < x; j++) {
                casillas[j][i] = new src.Casilla(esColorIteracion);
                esColorIteracion = !esColorIteracion;

            }
            esColorInicio = !esColorInicio;
        }
    }

        public void pintarTablero () {

            for (int i = 0; i < y; i++) {

                for (int k = 0; k < 3; k++) {
                    for (int j = 0; j < x; j++) {
                        System.out.print(casillas[j][i].pintarCelda(k));
                    }
                    System.out.println("");
                }

            }
        }
}