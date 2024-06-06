package projetoFinal;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    @Override
    public void play() {
        this.setReproduzindo(true);
        this.setViews(this.getViews() + 1);
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }

    // Métodos especiais
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    // Sobrecarga do método setAvaliacao para calcular a nova avaliação
    public void setAvaliacao(int avaliacao) {
        int novaAvaliacao = (this.avaliacao * this.views + avaliacao) / (this.views + 1);
        this.avaliacao = novaAvaliacao;
    }

    // Sobrecarga do método setAvaliacao para aceitar double como parâmetro
    public void setAvaliacao(double avaliacao) {
        int novaAvaliacao = (int) avaliacao;
        this.setAvaliacao(novaAvaliacao);
    }

    public int getAvaliacao() {
        return this.avaliacao;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getViews() {
        return this.views;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getCurtidas() {
        return this.curtidas;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public boolean getReproduzindo() {
        return this.reproduzindo;
    }

    @Override
    public String toString() {
        return "Video [titulo=" + this.getTitulo() +
                ", avaliacao=" + this.getAvaliacao() +
                ", views=" + this.getViews() +
                ", curtidas=" + this.getCurtidas() +
                ", reproduzindo=" + this.getReproduzindo() + "]";
    }
}
