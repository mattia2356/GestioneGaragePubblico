public class VeicoloInGarage {
    //Attributi
    private int oraArrivo;
    private int minutiArrivo;
    private Veicolo veicolo;

    //Costruttori
    public VeicoloInGarage(){

    }
    public VeicoloInGarage(int oraArrivo, int minutiArrivo, Veicolo veicolo){
        setOraArrivo(oraArrivo);
        setMinutiArrivo(minutiArrivo);
        setVeicolo(veicolo);
    }

    //Setter && Getter
    public void setOraArrivo(int oraArrivo) {
        this.oraArrivo = oraArrivo;
    }
    public void setMinutiArrivo(int minutiArrivo) {
        this.minutiArrivo = minutiArrivo;
    }
    public void setVeicolo(Veicolo veicolo) {
        this.veicolo = veicolo;
    }
    public int getOraArrivo() {
        return oraArrivo;
    }
    public int getMinutiArrivo() {
        return minutiArrivo;
    }
    public Veicolo getVeicolo() {
        return veicolo;
    }

    //toString
    public String toString(){
        String s="";
        s+= " | Ora Arrivo: " + getOraArrivo() + " | Minuti Arrivo: " + getMinutiArrivo() + " | Specifiche: " +getVeicolo();
        return s;
    }

    public VeicoloInGarage clone(){
        return new VeicoloInGarage(getOraArrivo(), getMinutiArrivo(), getVeicolo());
    }
    
}
