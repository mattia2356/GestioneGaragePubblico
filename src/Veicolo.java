abstract public class Veicolo {
    //Attributi
    private int annoImmatricolazione;
    private String marca;
    private String modello;
    private String tipoAlimentazione;
    private int cilindrata;

    //Costruttori
    public Veicolo(){

    }
    public Veicolo(int annoImmatricolazione, String marca, String modello, String tipoAlimentazione, int cilindrata){
        setAnnoImmatricolazione(annoImmatricolazione);
        setMarca(marca);
        setModello(modello);
        setTipoAlimentazione(tipoAlimentazione);
        setCilindrata(cilindrata);
    }
    public Veicolo(Veicolo v){
        setAnnoImmatricolazione(v.getAnnoImmatricolazione());
        setMarca(v.getMarca());
        setModello(v.getModello());
        setTipoAlimentazione(v.getTipoAlimentazione());
        setCilindrata(v.getCilindrata());
    }

    //Setter && Getter
    public void setAnnoImmatricolazione(int annoImmatricolazione) {
        this.annoImmatricolazione = annoImmatricolazione;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }
    public void setTipoAlimentazione(String tipoAlimentazione) {
        this.tipoAlimentazione = tipoAlimentazione;
    }
    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }
    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }
    public String getMarca() {
        return marca;
    }
    public String getModello() {
        return modello;
    }
    public String getTipoAlimentazione() {
        return tipoAlimentazione;
    }
    public int getCilindrata() {
        return cilindrata;
    }

    //toString
    public String toString(){
        String s="";
        s+=" | Anno Immatricolazione: " + getAnnoImmatricolazione() + " | Marca: " + getMarca() + " | Modello: " + getModello() + " | Tipo Alimentazione: " + getTipoAlimentazione() + " | Cilindrata: " +getCilindrata();
        return s;
    }
    
    //Equals
    public boolean equals(Veicolo v){
        return(getAnnoImmatricolazione() == v.getAnnoImmatricolazione() && getMarca().equals(v.getMarca()) && getModello().equals(v.getModello()) && getTipoAlimentazione().equals(v.getTipoAlimentazione()) && getCilindrata() == v.getCilindrata());
    }

    //Clone
    abstract public Veicolo clone();
}
