package src.Jugador;

public class vectorJugador {
    int cantidadJugadores = 10;
    public Jugador[] listaJugadores = new Jugador[10];
    public vectorJugador(){

    }

    public void mostrarJugadores(){
        for (int i = 0; i < listaJugadores.length; i++) {
            System.out.println();
        }
    }

}
