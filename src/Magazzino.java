import java.util.ArrayList;

public class Magazzino {
    int numeroPacci;
    int pacchiAsssegnati;
    int pacchiRimanenti;
    int tentativiFaliti;
    int assegnazioniRiuscite;
    int assegnazioneFalite;
    ArrayList<Pacco> pacchi = new ArrayList<>( );

    public Magazzino(int numeroPacci) {
        this.numeroPacci = numeroPacci;
        for (int i = 0; i < numeroPacci; i++) {
                this.pacchi.add(new Pacco(i+1));
        } 
    }
    
}
