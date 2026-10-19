import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<Operatore> operatori = new ArrayList<>();
        Magazzino magazzino1 = new Magazzino(120);

        for (int i = 0; i < 50; i++) {
            operatori.add(new Operatore(("sc" + i), magazzino1)); 
            
        }

    }
}
