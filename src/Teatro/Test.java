package Teatro;

public class Test {
    public static void main(String[] args) {
        // Creazione dello spettacolo
        Spettacolo spettacolo = new Spettacolo(
                "Romeo e Giulietta",
                "Compagnia Teatro Classico",
                "20/12/2024",
                "21:00",
                30.00
        );

        // Creazione e aggiunta di una Persona normale
        Persona persona = new Persona("Marco", "Via Roma 1");
        spettacolo.aggiungiSpettatore(persona);

        // Creazione e aggiunta di uno Studente
        Studente studente = new Studente("Sofia", "Via Milano 2", 2);
        spettacolo.aggiungiSpettatore(studente);

        // Creazione e aggiunta di un Professore
        Professore professore = new Professore("Paolo", "Via Napoli 3", "DOC123", "Lettere");
        spettacolo.aggiungiSpettatore(professore);

        // Stampa delle informazioni dello spettacolo
        spettacolo.stampaInfoSpettacolo();

        // Stampa dell'elenco degli spettatori con i prezzi
        spettacolo.stampaPrenotazioni();

        // Stampa dei posti disponibili
        System.out.println("\nPosti ancora disponibili: " + spettacolo.postiDisponibili());
    }
}
