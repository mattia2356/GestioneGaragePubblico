import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Garage garage = new Garage();
        boolean cond = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("GARAGE PUBBLICO:");
        for (int i = 0; i < 2; i++) {
            cond = true;
            System.out.println("Che Veicolo vuoi inserire: ");
            System.out.println("\t1) Furgone: \n" + "\t 2) AutoVettura: \n" + "\t 3) Motocicletta: \n");
            int key = sc.nextInt();
            while (cond == true) {
                switch (key) {
                case 1:
                    System.out.println("Furgone: \n");
                    System.out.println("Anno Immatricolazione: ");
                    int annoImmatricolazione = sc.nextInt();
                    System.out.println("Marca: ");
                    String marca = sc.next();
                    System.out.println("Modello: ");
                    String modello = sc.next();
                    System.out.println("Tipo Alimentazione: ");
                    String tipoAlimentazione = sc.next();
                    System.out.println("Cilindrata: ");
                    int cilindrata = sc.nextInt();
                    System.out.println("Capacità Carico: ");
                    float capacitàCarico = sc.nextFloat();
                    Veicolo furgone = new Furgone(annoImmatricolazione, marca, modello, tipoAlimentazione, cilindrata,
                            capacitàCarico);
                    garage.ingressoVeicolo(furgone, 14, 30);
                    System.out.println("\n"+garage.toString()+"\n");
                    break;

                case 2:
                    System.out.println("AutoVettura:");
                    System.out.println("Anno Immatricolazione: ");
                    int annoImmatricolazione2 = sc.nextInt();
                    System.out.println("Marca: ");
                    String marca2 = sc.next();
                    System.out.println("Modello: ");
                    String modello2 = sc.next();
                    System.out.println("Tipo Alimentazione: ");
                    String tipoAlimentazione2 = sc.next();
                    System.out.println("Cilindrata: ");
                    int cilindrata2 = sc.nextInt();
                    System.out.println("Numero Posti: ");
                    int numeroPosti = sc.nextInt();
                    Veicolo macchina = new Autovettura(annoImmatricolazione2, marca2, modello2, tipoAlimentazione2,
                            cilindrata2, numeroPosti);
                    garage.ingressoVeicolo(macchina, 17, 36);
                    System.out.println("\n"+garage.toString()+"\n");
                    break;

                case 3:
                    System.out.println("MotoVeicolo: ");
                    System.out.println("Anno Immatricolazione: ");
                    int annoImmatricolazione3 = sc.nextInt();
                    System.out.println("Marca: ");
                    String marca3 = sc.next();
                    System.out.println("Modello: ");
                    String modello3 = sc.next();
                    System.out.println("Tipo Alimentazione: ");
                    String tipoAlimentazione3 = sc.next();
                    System.out.println("Cilindrata: ");
                    int cilindrata3 = sc.nextInt();
                    System.out.println("Tempi Motore: ");
                    int tempiMotore = sc.nextInt();
                    Veicolo moto = new Motocicletta(annoImmatricolazione3, marca3, modello3, tipoAlimentazione3,
                            cilindrata3, tempiMotore);
                    garage.ingressoVeicolo(moto, 20, 14);
                    System.out.println("\n"+garage.toString()+"\n");
                    break;

                default:
                    System.out.println("Errore, non hai inserito il veicolo corretto");
                    break;
                }
                cond = false;
            }
        }
    }
}
