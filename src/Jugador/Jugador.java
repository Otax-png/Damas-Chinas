package src.Jugador;

import java.util.Scanner;

public class Jugador {

    private String[] nombre = new String[10];
    private int[] id = new int[10];
    private int[] partidasGanadas = new int[10];
    private int[] cantidadFichas = new int[10];

    Scanner entrada  = new Scanner(System.in);

    public Jugador() {
        for (int i = 0; i < 10; i++) {
            id[i] = (i+1);
        }
        nombre[0] = "1. Solid Snake";
        nombre[1] = "2. Liquid Snake";
        nombre[2] = "3. Solidus Snake";
        nombre[3] = "4. Naked Snake";
        nombre[4] = "5. Old Snake";
        nombre[5] = "6. Venom Snake";
        nombre[6] = "7. Big Boss";
        nombre[7] = "8. The Boss";
        nombre[8] = "9. Revolver Ocelot";
        nombre[9] = "10. Liquid Ocelot";
    }
    public void mostrarPuntuacion(){
        for (int i = 1; i < 10; i++) {
            partidasGanadas[i] = 0;
            System.out.println(nombre[i] +  ",    Puntuacion: " + partidasGanadas[i]);
        }
    }

    public void seleccionarPersonaje(){
        mostrarpersonajes();
        int seleccion;
        System.out.print("Ingresa el numero del personaje que elegiste: ");
        seleccion = entrada.nextInt();

        for (int i = 0; i < nombre.length; i++) {
            if (seleccion == id[i]) {
                System.out.println("Has selecciomado a: " + nombre[i]);

                break;
            }
        }
    }

    public void mostrarpersonajes(){
        for (int i = 0; i < 10; i++) {
            System.out.println(nombre[i]);
        }
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public int[] getId() {
        return id;
    }

    public void setId(int[] id) {
        this.id = id;
    }

    public int[] getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int[] partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public int[] getCantidadFichas() {
        return cantidadFichas;
    }

    public void setCantidadFichas(int[] cantidadFichas) {
        this.cantidadFichas = cantidadFichas;
    }
}