package Teatro;

public class Persona {
    private String nome;
    private String indirizzo;

    // Costruttore
    public Persona(String nome, String indirizzo) {
        this.nome = nome;
        this.indirizzo = indirizzo;
    }

    // Getter per nome
    public String getNome() {
        return nome;
    }

    // Getter per indirizzo
    public String getIndirizzo() {
        return indirizzo;
    }

    // Setter per indirizzo
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    // Metodo visualizza
    public void visualizza() {
        System.out.println("Nome: " + nome);
        System.out.println("Indirizzo: " + indirizzo);
    }
}
