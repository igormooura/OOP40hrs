package aula12;

public class Reptil extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Rastejando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Reptil comendo.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil.");
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public String getCorEscama() {
        return this.corEscama;
    }
}
