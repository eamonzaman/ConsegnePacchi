public class Operatore implements Runnable {

    private String nome;
    private Magazzino magazzino;
    private int numPaccCompl;
    private int numPaccFall;

    public int getNumPaccFall() {
        return numPaccFall;
    }

    public void setNumPaccFall(int numPaccFall) {
        this.numPaccFall = numPaccFall;
    }

    private Pacco pacco;
    private int tentativi;

    public Operatore(String nome, Magazzino magazzino) {
        this.nome = nome;
        this.magazzino = magazzino;

        this.numPaccCompl = 0;
        this.numPaccFall = 0;
        this.pacco = null;
        this.tentativi = 0;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumPaccCompl() {
        return numPaccCompl;
    }

    public void setNumPaccCompl(int numPaccCompl) {
        this.numPaccCompl = numPaccCompl;
    }

    public Pacco getPacco() {
        return pacco;
    }

    public void setPacco(Pacco pacco) {
        this.pacco = pacco;
    }

    public int getTentativi() {
        return tentativi;
    }

    public void setTentativi(int tentativi) {
        this.tentativi = tentativi;
    }

}
