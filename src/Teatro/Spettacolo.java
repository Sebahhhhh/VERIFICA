package Teatro;

public class Spettacolo {
    private String titolo;
    private String compagnia;
    private String data;
    private String ora;
    private double prezzo;
    private Persona[] spettatori;
    private int numSpettatori;
    private static final int POSTI_TOTALI = 100;

    public Spettacolo(String titolo, String compagnia, String data, String ora, double prezzo) {
        this.titolo = titolo;
        this.compagnia = compagnia;
        this.data = data;
        this.ora = ora;
        this.prezzo = prezzo;
        this.spettatori = new Persona[POSTI_TOTALI];
        this.numSpettatori = 0;
    }

    public boolean aggiungiSpettatore(Persona persona) {
        if (numSpettatori < POSTI_TOTALI) {
            spettatori[numSpettatori] = persona;
            numSpettatori++;
            return true;
        }
        return false;
    }

    public void stampaPrenotazioni() {
        System.out.println("Elenco prenotazioni:");
        for (int i = 0; i < numSpettatori; i++) {
            double prezzoFinale = prezzo;
            if (spettatori[i] instanceof Studente || spettatori[i] instanceof Professore) {
                prezzoFinale = prezzo * 0.9;
            }
            System.out.println("Spettatore " + (i+1) + ":");
            spettatori[i].visualizza();
            System.out.println("Prezzo biglietto: " + prezzoFinale + " euro");
        }
    }

    public double costo{Persona persona}
    if ()

    public int postiDisponibili() {
        return POSTI_TOTALI - numSpettatori;
    }

    public void stampaInfoSpettacolo() {
        System.out.println("Informazioni spettacolo:");
        System.out.println("Titolo: " + titolo);
        System.out.println("Compagnia: " + compagnia);
        System.out.println("Data: " + data);
        System.out.println("Ora: " + ora);
        System.out.println("Prezzo intero: " + prezzo + " euro");
    }
}

