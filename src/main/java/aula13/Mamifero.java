package aula13;

public class Mamifero extends Animal {
    protected String corPelo;

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
