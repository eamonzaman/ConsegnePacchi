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
        int index= 0;
        while (index <= magazzino.getNumeroPacci()) {
            this.pacco = magazzino.getPacchi().get(index);
            prendi();
            try {
                Thread.sleep(2500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void prendi() {
        if (pacco.isStato() == false) {
            pacco.setStato(true);
            setTentativi(tentativi + 1);
            if (pacco.isStato() == true) {
                setNumPaccCompl(numPaccCompl + 1);
                magazzino.setAssegnazioniRiuscite(magazzino.getAssegnazioniRiuscite() + 1);
                magazzino.setPacchiAsssegnati(magazzino.getPacchiAsssegnati() + 1);
                magazzino.setPacchiRimanenti(magazzino.getPacchiRimanenti() - 1);
            } else {
                setNumPaccFall(numPaccFall + 1);
                magazzino.setAssegnazioneFalite(magazzino.getAssegnazioneFalite() + 1);
                magazzino.setTentativiFaliti(tentativi);
            }
            if (magazzino.getNumeroPacci() >= magazzino.getAssegnazioniRiuscite()) {
                System.out.println("Tutti i pacchi sono stati consegnati");
            } else {

            }

        }
        ;
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
