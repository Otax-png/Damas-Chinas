package src;

public class Casilla {
        private boolean ocuparCasilla;
        private int tipoCasilla;

    public Casilla(boolean ocuparCasilla, int tipoCasilla) {
        this.ocuparCasilla = ocuparCasilla;
        this.tipoCasilla = tipoCasilla;
        llenarCasilla();
    }

    public void llenarCasilla(){
        int checkTipoCasilla = 1;
        boolean checkOcuparCasilla = false;

        setTipoCasilla(checkTipoCasilla);
        setOcuparCasilla(checkOcuparCasilla);
    }

    public boolean isOcuparCasilla() {
        return ocuparCasilla;
    }

    public int getTipoCasilla() {
        return tipoCasilla;
    }

    public void setOcuparCasilla(boolean ocuparCasilla) {
        this.ocuparCasilla = ocuparCasilla;
    }

    public void setTipoCasilla(int tipoCasilla) {
        this.tipoCasilla = tipoCasilla;
    }
}