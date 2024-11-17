package Teatro;

public class Studente extends Persona {
    private int matricola;
    private int anno;
    private static int ultimaMatricola = 0;

    // Costruttore
    public Studente(String nome, String indirizzo, int anno) {
        super(nome, indirizzo);
        this.anno = anno;
        this.matricola = ++ultimaMatricola;
    }

    // Getter per matricola
    public int getMatricola() {
        return matricola;
    }

    // Getter per anno
    public int getAnno() {
        return anno;
    }

    // Setter per anno
    public void setAnno(int anno) {
        this.anno = anno;
    }

    // Override del metodo visualizza della classe padre
    @Override
    public void visualizza() {
        super.visualizza();
        System.out.println("Matricola: " + matricola);
        System.out.println("Anno: " + anno);
    }
}
