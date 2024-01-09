package it.sam.be.automobile;

import it.sam.be.carrozzeria.Telaio;
import it.sam.be.motore.BloccoMotore;

import java.util.Objects;
import java.util.Scanner;

public class Automobile {
    private Telaio telaio;
    private BloccoMotore motore;
    public boolean batteriaCarica = false;
    private static String conf = "si";


    public Automobile(int _cilindrata, String _numeroMatricola){
        this.telaio = new Telaio(_numeroMatricola);
        this.motore = new BloccoMotore(_cilindrata);
    }

    public void avviaAuto(){
        if (batteriaCarica == true) {
            accendiMotore();
        }else{
            spiaBatteria();
            Scanner scanner = new Scanner(System.in);
            System.out.println("vuoi caricare la batteria?");
            String chiave = scanner.nextLine();
            String newRisp = chiave;
            if (Objects.equals(newRisp, conf)) {
                caricaBatteria();
            }

            scanner.close();
        }
    };

    public void accendiMotore(){
        String avvio = "Motore avviato";
        System.out.println(avvio);
    };

    public void spiaBatteria(){
        String batteria = "Batteria scarica";
        System.out.println(batteria);
    };

    public void caricaBatteria(){
        for (int i = 0; i <= 100; i++) {
            System.out.println(i + "%");
        }
        System.out.println("Batteria ricaricata");
        batteriaCarica = true;
        avviaAuto();
    }


}
