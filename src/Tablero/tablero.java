package src;

public class tablero{
    //Reset
    public static final String ANSI_RESET = "\u001B[0m";
    //Colores Letra
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    //Colores Background
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";

    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    private String[][] mostrarTablero;
    private src.Casilla[][] casillas = new src.Casilla[8][8];

    public tablero(){
        mostrarTablero = new String[8][8];

    }

    public void dibujarTablero(){

        int filas = 0;
        for (int i = 0; i < mostrarTablero.length; i++) {
            filas++;
            System.out.print(filas);
            for (int j = 0; j < mostrarTablero.length; j++) {
                if ((i + j)%2 == 0){
                    mostrarTablero[i][j] = ANSI_WHITE_BACKGROUND + "     " + ANSI_RESET;
                    casillas[i][j].setTipoCasilla(1);
                    casillas[i][j].setOcuparCasilla(false);
                    System.out.print(mostrarTablero[i][j]);
                } else if(i>=0 && i <3){
                    //casillas[i][j].setTipoCasilla(0);
                    //casillas[i][j].setOcuparCasilla(true);
                    mostrarTablero[i][j] = ANSI_BLACK_BACKGROUND+"  "+ANSI_RED+"O"+"  " + ANSI_RESET;
                    System.out.print(mostrarTablero[i][j]);
                } else if(i>= 5 && i <=7){
                    //casillas[i][j].setTipoCasilla(0);
                    //casillas[i][j].setOcuparCasilla(true);
                    mostrarTablero[i][j] = ANSI_BLACK_BACKGROUND+"  "+ANSI_YELLOW+"X"+"  " + ANSI_RESET;
                    System.out.print(mostrarTablero[i][j]);
                } else {
                    //casillas[i][j].setTipoCasilla(0);
                    //casillas[i][j].setOcuparCasilla(false);
                    mostrarTablero[i][j] = ANSI_BLACK_BACKGROUND + "     " + ANSI_RESET;
                    System.out.print(mostrarTablero[i][j]);
                }
            }
            System.out.println("");
        }
        System.out.println("\n");
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


    public String[][] getMostrarTablero() {
        return mostrarTablero;
    }

    public void setMostrarTablero(String[][] mostrarTablero) {
        this.mostrarTablero = mostrarTablero;
    }
}