package Teatro;

public class Professore extends Persona {
    private String codiceDocente;
    private String dipartimento;

    // Costruttore
    public Professore(String nome, String indirizzo, String codiceDocente, String dipartimento) {
        super(nome, indirizzo);
        this.codiceDocente = codiceDocente;
        this.dipartimento = dipartimento;
    }

    // Getter per codiceDocente
    public String getCodiceDocente() {
        return codiceDocente;
    }

    // Getter per dipartimento
    public String getDipartimento() {
        return dipartimento;
    }

    // Override del metodo visualizza della classe padre
    @Override
    public void visualizza() {
        super.visualizza();
        System.out.println("Codice Docente: " + codiceDocente);
        System.out.println("Dipartimento: " + dipartimento);
    }
}