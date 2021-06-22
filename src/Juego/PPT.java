package src;

public class PPT {
    int jugador1, jugador2;

    public PPT(){
        generarPiedraPT();
        iniciarJuegoPPT();
    }

    /**
     * 1. Piedra
     * 2. Papel
     * 3. Tijera
     */
    public void iniciarJuegoPPT(){
        do {
            if (jugador1 != jugador2 ) {
                if (jugador1 == 1 && jugador2 == 3) {
                    System.out.println("\nEL JUGADOR 1 HA GANADO\n");
                    break;
                }
                else if (jugador1 == 2 && jugador2 == 1) {
                    System.out.println("\nEL JUGADOR 1 HA GANADO\n");
                    break;

                } else  if (jugador1 == 3 && jugador2 == 2) {
                    System.out.println("\nEL JUGADOR 1 HA GANADO\n");
                    break;

                } else {
                    System.out.println("\nEL JUGADOR 2 HA GANADO\n");
                    break;
                }

            } else {
                System.out.println("\nEMPATE, DECIDAMOSLO EN OTRA RONDA\n\n\n");
                generarPiedraPT();
            }

        } while (jugador1 != jugador2);
    }

    public void generarPiedraPT(){
        System.out.println("Ahora iniciará el juego de Piedra Papel o Tijera\n" +
                           " PIEDRA, PAPEL O TIJERA 1 - 2 - 3\n" +
                           "            YA!\n");
        jugador1 = (int) Math.floor(Math.random() * (3 - 1 + 1) + 1);
        jugador2 = (int) Math.floor(Math.random() * (3 - 1 + 1) + 1);

        switch (jugador1){
            case 1:
                System.out.print("El jugador 1 ha sacado PIEDRA ");
                break;
            case 2:
                System.out.print("El jugador 1 ha sacado PAPEL ");
                break;
            case 3:
                System.out.print("El jugador 1 ha sacado TIJERA ");
                break;
        }
        switch (jugador2){
            case 1:
                System.out.println(" El jugador 2 ha sacado PIEDRA ");
                break;
            case 2:
                System.out.println(" El jugador 2 ha sacado PAPEL");
                break;
            case 3:
                System.out.println(" El jugador 2 ha sacado TIJERA");
                break;
        }
    }

}
