package src.Juego;

import src.Jugador.Jugador;
import src.PPT;
import src.Jugador.vectorJugador;
import src.Tablero.tablero;

import java.util.Scanner;


public class JuegoDamas {

    private int posicionX, posicionY, movimientoX, movimientoY;
    private int fichas = 65;

    tablero Jugar = new tablero(8,8,true);
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
                case 1:
                    System.out.println("\n\n\nSelecciona un jugador");
                    //mio
                    //acaterminamio
                    Jugador j1 = new Jugador();
                    System.out.print("\tEl jugador 1 ha seleccionado a  " +  j1.seleccionarPersonaje() + "\n\n\n\n");
                    Jugador j2 = new Jugador();
                    System.out.print("\tEl jugador 2 ha seleccionado a " +  j2.seleccionarPersonaje() + "\n\n\n\n");


                    PPT juegoPiedraPT = new PPT();
                    System.out.println();

                    do {
                        Jugar.pintarTablero();
                        System.out.println("Ingresa la posicion X de la ficha a seleccionar");
                        System.out.print("Poicion X = ");
                        posicionX = entrada.nextInt();

                        System.out.println("Ingrese la POSICION Y, de la ficha que desea seleccionar");
                        System.out.print("Poicion Y = ");
                        posicionY = entrada.nextInt();

                        System.out.println("Ingrese el MOVIMIENTO X, de la ficha que desea mover");
                        System.out.print("Movmiento X = ");
                        movimientoX = entrada.nextInt();

                        System.out.println("Ingrese el MOVIMIENTO Y, de la ficha que desea mover");
                        System.out.print("Movmiento Y = ");
                        movimientoY = entrada.nextInt();

                        System.out.println(Jugar.moverFicha(posicionX, posicionY, movimientoX, movimientoY));
                        System.out.println(Jugar.comerFicha(posicionX, posicionY, movimientoX, movimientoY));
                        fichas--;

                    } while (fichas > 0);

                    System.out.println("Ganaste");
                    break;
                case 2: jugadores.mostrarJugadores();
                    break;

            }

        }while (checkOption != 3);
    }

}
