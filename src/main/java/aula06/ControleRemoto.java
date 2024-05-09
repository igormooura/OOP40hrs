package aula06;

public class ControleRemoto implements Controlador{


    private Integer Volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public Integer getVolume() {
        return Volume;
    }

    public void setVolume(Integer volume) {
        Volume = volume;
    }


    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()) {
            System.out.println("----- MENU -----");
            System.out.println("Está ligado? " + this.getLigado());
            System.out.println("Está tocando? " + this.getTocando());
            System.out.print("Volume: " + getVolume() + "\n ");
            for (int i = 0; i < this.getVolume(); i+=5) {
                System.out.print("/");
            }
            System.out.println();
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando o menu...");
    }

    @Override
    public void maisVolume() {
            if(getLigado()){
                setVolume(getVolume() + 1);
            }
            if(!getLigado()){
                System.out.println("Tv desligada");
            }
    }

    @Override
    public void menosVolume() {
        if(getLigado()){
            setVolume(getVolume() - 1);
        }
        if(!getLigado()){
            System.out.println("Tv desligada");
        }
    }

    @Override
    public void ligarMudo() {
        if(getLigado() && getVolume() > 0){
            setVolume(0);
        } else{
            System.out.println("Não é possível");
        }
    }

    @Override
    public void desligarMudo() {
        if(getLigado() && getVolume() > 0){
            System.out.println("Mudando o volume de 0 para 50");
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if(getLigado() && getTocando()) setTocando(true);
    }

    @Override
    public void pause() {
        if(getTocando() && getLigado()) setTocando(false);
    }
}
