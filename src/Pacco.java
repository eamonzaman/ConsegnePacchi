public class Pacco {

    private int numeroPacco;
    private boolean stato;
    
    public Pacco(int numeroPacco) {
        this.numeroPacco = numeroPacco;
        this.stato = false;
    }


    public int getNumeroPacco() {
        return numeroPacco;
    }

    public void setNumeroPacco(int numeroPacco) {
        this.numeroPacco = numeroPacco;
    }

    public boolean isStato() {
        return stato;
    }

    public void setStato(boolean stato) {
        this.stato = stato;
    }

}
