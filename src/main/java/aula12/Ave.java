package aula12;

public class Ave extends Animal {
    private String corPena;

    public void fazerNinho() {
        System.out.println("Fez um ninho.");
    }

    @Override
    public void locomover() {
        System.out.println("Voando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Passaro comendo.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Aves cantam.");
    }

    //métodos especiais
    public void setCorEscama(String corPena) {
        this.corPena = corPena;
    }

    public String getCorPena() {
        return this.corPena;
    }
}
