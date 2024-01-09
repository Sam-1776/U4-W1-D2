package it.sam.be.carrozzeria;

public class Telaio {

    //Attributi o stati
    private String numeroMatricola;

    //Costruttore di default non definito
    public Telaio(String numeroMatricola){
        this.numeroMatricola = numeroMatricola;
    }

    //opzionali getters (Metodi get per il passaggio di dati in altre calssi)
    public String getNumeromatricola(){
        return numeroMatricola;
    }
}
