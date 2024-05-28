package aula12;

public class Peixe extends Animal{
    private String corEscama;

    public void soltarBolha() {
        System.out.println("Soltou uma bolha.");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Peixe comendo.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som.");
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public String getCorEscama() {
        return this.corEscama;
    }
}
