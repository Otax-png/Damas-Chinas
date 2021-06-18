public class Jugador {

    int idJugador;
    String Nombre;
    int Puntuacion;

    public Jugador(int idJugador, String nombre, int puntuacion) {
        this.idJugador = idJugador;
        Nombre = nombre;
        Puntuacion = puntuacion;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getPuntuacion() {
        return Puntuacion;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setPuntuacion(int puntuacion) {
        Puntuacion = puntuacion;
    }
}