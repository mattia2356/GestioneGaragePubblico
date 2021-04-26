public class Autovettura extends Veicolo{
    // Attributi
    private int numeroPosti;

    // Costruttori
    public Autovettura(){

        }

    public Autovettura(int annoImmatricolazione, String marca, String modello, String tipoAlimentazione, int cilindrata, int numeroPosti){
        super(annoImmatricolazione, marca, modello, tipoAlimentazione, cilindrata);
        setNumeroPosti(numeroPosti);
    
        }

    // Setter && Getter
    public void setNumeroPosti(int numeroPosti) {
        this.numeroPosti = numeroPosti;
    }
    public int getNumeroPosti() {
        return numeroPosti;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + " | Numero Posti: " + getNumeroPosti();
    }

    //Equals
    public boolean equals(Autovettura v) {
        return (super.equals(v) && getNumeroPosti() == v.getNumeroPosti());
    }

    //clone
    public Autovettura clone(){
        return new Autovettura(getAnnoImmatricolazione(), getMarca(), getModello(), getTipoAlimentazione(), getCilindrata(), getNumeroPosti());
    }
}
