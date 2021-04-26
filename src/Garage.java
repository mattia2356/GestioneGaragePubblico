import java.util.*;

public class Garage {
    // Attributi
    private List<VeicoloInGarage> veicolo = new ArrayList<VeicoloInGarage>();

    // Costruttori
    public Garage() {

    }

    public Garage(List<VeicoloInGarage> veicoli) {
        this.veicolo.addAll(veicoli);
    }

    public Garage(VeicoloInGarage[] veicoli) {
        this.veicolo = Arrays.asList(veicoli);
    }

    // Setter && Getter
    public void setVeicolo(List<VeicoloInGarage> veicolo) {
        this.veicolo = veicolo;
    }

    public List<VeicoloInGarage> getVeicolo() {
        return veicolo;
    }

    private double calcoloCosto(int oraEntrata, int minutiEntrata, int oraUscita, int minutiUscita) {
        double ht, mt;
        if (oraEntrata < oraUscita || (oraEntrata == oraUscita && minutiEntrata <= minutiUscita)) {
            ht = oraUscita - oraEntrata;
        } else {
            ht = oraUscita + 24 - oraEntrata;
        }
        if (minutiEntrata <= minutiUscita) {
            mt = minutiUscita - minutiEntrata;
        } else {
            mt = minutiUscita + 60 - minutiEntrata;
            ht--;
        }
        return ht + mt / 60;
    }

    // Add elemento
    public int ingressoVeicolo(Veicolo vei, int oraArrivo, int minutiArrivo) {
        VeicoloInGarage veig = new VeicoloInGarage(oraArrivo, minutiArrivo, vei);
        if (veicolo.contains(null)) {
            veicolo.add(veicolo.indexOf(null), veig);
        } else {

            veicolo.add(veig);
        }

        return veicolo.indexOf(veig);
    }

    // toString
    public String toString() {

        String s = "";
        for (int i = 0; i < veicolo.size(); i++) {
            s += veicolo.get(i).toString() + "\n";
        }
        return s;
    }

}
