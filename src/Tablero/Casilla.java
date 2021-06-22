package src;

import src.Tablero.Ficha;

public class Casilla {
    private boolean esColor;
    private Ficha ficha;
    private char celda = '░';
    private char celdaColor = '░';
    //█▓
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public void setFicha(Ficha f){
        this.ficha = f;
    }

    public boolean getEsColor(){
        return this.esColor;
    }

    public Ficha getFicha(){
        Ficha tmp = this.ficha;
        this.ficha = null;
        return tmp;
    }

    //se quiere editar INICIO
    public boolean desocupadaPorFicha(){
        return (ficha==null);
    }
    //se quiere editar FIN

    public boolean ocupadaPorFicha(){
        return (ficha!=null);
    }
    public Casilla(boolean esColor){
        this.esColor = esColor;
        this.ficha = null;
    }
    public String pintarCelda( int linea){
        String res = "";
        if(esColor){
            res = imprimir(ANSI_WHITE, linea);
        }
        else{
            res = imprimir(ANSI_BLACK, linea);
        }
        return res;
    }
    private String imprimir(String color, int linea){
        String res = "";
        if(ficha!=null){
            if ((linea == 0)||(linea == 2))
                res="" + color+celdaColor+celdaColor+   ficha.getCaracter()+ficha.getCaracter()+    color+celdaColor+celdaColor;
            if (linea == 1)
                res=""+color+celdaColor+  ficha.getCaracter()+    ficha.getId()      +ficha.getCaracter()       +color+ celdaColor;

        }else{
            res =""+ color+celdaColor+celdaColor+celdaColor+celdaColor+celdaColor+celdaColor;
        }
        return res;
    }
}