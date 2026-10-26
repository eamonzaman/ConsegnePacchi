import java.util.ArrayList;

public class Magazzino {
    int numeroPacci;
    int pacchiAsssegnati;
    int pacchiRimanenti;
    int tentativiFaliti;
    int assegnazioniRiuscite;
    int assegnazioneFalite;
    ArrayList<Pacco> pacchi = new ArrayList<>();

    public Magazzino(int numeroPacci) {
        this.numeroPacci = numeroPacci;
        this.pacchiAsssegnati = numeroPacci;
        for (int i = 0; i < numeroPacci; i++) {
            this.pacchi.add(new Pacco(i + 1));
        }
    }

   

    public int getNumeroPacci() {
        return numeroPacci;
    }

    public void setNumeroPacci(int numeroPacci) {
        this.numeroPacci = numeroPacci;
    }

    public int getPacchiAsssegnati() {
        return pacchiAsssegnati;
    }

    public void setPacchiAsssegnati(int pacchiAsssegnati) {
        this.pacchiAsssegnati = pacchiAsssegnati;
    }

    public int getPacchiRimanenti() {
        return pacchiRimanenti;
    }

    public void setPacchiRimanenti(int pacchiRimanenti) {
        this.pacchiRimanenti = pacchiRimanenti;
    }

    public int getTentativiFaliti() {
        return tentativiFaliti;
    }

    public void setTentativiFaliti(int tentativiFaliti) {
        this.tentativiFaliti = tentativiFaliti;
    }

    public int getAssegnazioniRiuscite() {
        return assegnazioniRiuscite;
    }

    public void setAssegnazioniRiuscite(int assegnazioniRiuscite) {
        this.assegnazioniRiuscite = assegnazioniRiuscite;
    }

    public int getAssegnazioneFalite() {
        return assegnazioneFalite;
    }

    public void setAssegnazioneFalite(int assegnazioneFalite) {
        this.assegnazioneFalite = assegnazioneFalite;
    }

    public ArrayList<Pacco> getPacchi() {
        return pacchi;
    }

    public void setPacchi(ArrayList<Pacco> pacchi) {
        this.pacchi = pacchi;
    }

}
