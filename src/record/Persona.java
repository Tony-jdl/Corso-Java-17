package src.record;

public record Persona(String nome, int annoNascita){
    public Persona(String nome, int annoNascita) {
        this.nome = nome.toUpperCase();
        this.annoNascita = annoNascita;
    }

    public Persona(int annoNascita) {
        this("Nessun", annoNascita);
    }
}
