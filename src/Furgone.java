public class Furgone extends Veicolo{
    //Attributi
    private float capacitàCarico;

    //Costruttori
    public Furgone(){

    }
    public Furgone(int annoImmatricolazione, String marca, String modello, String tipoAlimentazione, int cilindrata, float capacitàCarico){
        super(annoImmatricolazione, marca, modello, tipoAlimentazione, cilindrata);

    }

    //Setter && Getter
    public void setCapacitàCarico(float capacitàCarico) {
        this.capacitàCarico = capacitàCarico;
    }
    public float getCapacitàCarico() {
        return capacitàCarico;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + " | Capacità Carico: " + getCapacitàCarico();
    }

    //equals
    public boolean equals(Furgone v) {
        return (super.equals(v) && getCapacitàCarico() == v.getCapacitàCarico());
    }
    
    //Clone
    public Furgone clone(){
        return new Furgone(getAnnoImmatricolazione(), getMarca(), getModello(), getTipoAlimentazione(), getCilindrata(), getCapacitàCarico());
    }

}
