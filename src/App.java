import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<Thread> operatori = new ArrayList<>();
        Magazzino magazzino1 = new Magazzino(120);
        for (int i = 0; i < magazzino1.getNumeroPacci(); i++) {
            magazzino1.pacchi.add(new Pacco(i));
        }

        for (int i = 1; i <= 50; i++) {
            operatori.add(new Thread(new Operatore("sc" + i, magazzino1))); 
            System.out.println(operatori.get(i-1).getName());
        }

    }
}
