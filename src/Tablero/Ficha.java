package src.Tablero;


public class Ficha {
        //variables
        private boolean esNegra;
        private tablero tablero;
        private char celda = '░', colorCelda = '░';
        private String id;

        //CONSTANTES DE colores
        public static final String ANSI_BLACK = "\u001B[30m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_YELLOW = "\u001B[33m";
        public static final String ANSI_BLUE = "\u001B[34m";
        public static final String ANSI_PURPLE = "\u001B[35m";
        public static final String ANSI_CYAN = "\u001B[36m";
        public static final String ANSI_WHITE = "\u001B[37m";


    //constructor
        public Ficha(boolean esNegra, String id){
            this.esNegra = esNegra;
            this.id = id;
        }

        //mm
        public boolean getEsNegra() {
            return esNegra;
        }

        //get set
        public String getCaracter(){
            String res =(esNegra)?"" + ANSI_RED + celda: "" + ANSI_BLUE + celda;
            return res;
        }

        public String getId() {
            return id;
        }

}