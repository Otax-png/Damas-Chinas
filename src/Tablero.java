package src;

public class Tablero{
    private String[][] tablero;

    public Tablero(){
        tablero = new String[8][8];
        dibujarTablero();
    }

    public void dibujarTablero(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if ((i + j)%2 == 0){
                    tablero[i][j] = "|||||";
                        System.out.print(tablero[i][j]);
                } else {
                    tablero[i][j] = "-----";
                    System.out.print(tablero[i][j]);
                }
            }
            System.out.println("");
        }
    }

    public void agregarFichas(){

    }

}