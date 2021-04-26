public class Motocicletta extends Veicolo{
    //Attributi
    private int tempiMotore;

    //Costruttori
    public Motocicletta(){

    }
    public Motocicletta(int annoImmatricolazione, String marca, String modello, String tipoAlimentazione, int cilindrata, int tempiMotore){
        super(annoImmatricolazione, marca, modello, tipoAlimentazione, cilindrata);
        setTempiMotore(tempiMotore);
    }

    //Setter && Getter
    public void setTempiMotore(int tempiMotore) {
        this.tempiMotore = tempiMotore;
    }
    public int getTempiMotore() {
        return tempiMotore;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + " | Tempi Motore: " + getTempiMotore();
    }
    //equals
    public boolean equals(Motocicletta m) {
        return (super.equals(m) && getTempiMotore() == m.getTempiMotore());
    }

    //CLone
    public Motocicletta clone(){
        return new Motocicletta(getAnnoImmatricolazione(), getMarca(), getModello(), getTipoAlimentazione(), getCilindrata(), getTempiMotore());
    }
}
