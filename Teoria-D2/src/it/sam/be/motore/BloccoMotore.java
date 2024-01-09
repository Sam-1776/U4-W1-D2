package it.sam.be.motore;

public class BloccoMotore {

    private int cilindrata;

    //COSTRUTTORE (si può evitare la dichiarazione con qualificatore di visabilità)
    public BloccoMotore(int cilindrata){
        this.cilindrata = cilindrata;
    };

    public int getCilindrata(){
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }
}
