package src.Jugador;

public class Jugador {

    private int idJugador;
    private String Nombre;
    private int partidasGanadas;
    private int cantidadFichas;


    public Jugador(int idJugador, String nombre, int partidasGanadas, int cantidadFichas) {
        this.idJugador = idJugador;
        Nombre = nombre;
        this.partidasGanadas = 0;
        this.cantidadFichas = cantidadFichas;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public int getCantidadFichas() {
        return cantidadFichas;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public void setCantidadFichas(int cantidadFichas) {
        this.cantidadFichas = cantidadFichas;
    }
}