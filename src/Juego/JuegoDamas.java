package src.Juego;

import src.tablero;
import src.Jugador.vectorJugador;

import java.util.Scanner;


public class JuegoDamas {
    tablero Jugar = new tablero();
    vectorJugador jugadores = new vectorJugador();
    Scanner entrada = new Scanner(System.in);

    public JuegoDamas(){
        Menu();
    }

    public void Menu(){
        int checkOption;
        do{
            System.out.println("--------DAMAS--------");
            System.out.println("1. Jugar");
            System.out.println("2. Mostrar Jugadores");
            System.out.println("3. Salir");

            checkOption = entrada.nextInt();

            switch (checkOption){
                case 1: Jugar.dibujarTablero();
                        break;
                case 2: jugadores.mostrarJugadores();
                        break;

            }

        }while (checkOption != 3);
    }

}
