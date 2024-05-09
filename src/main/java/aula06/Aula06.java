package aula06;

public class Aula06 {
    public static void main(String[] args){
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.setTocando(true);
        c.maisVolume();
        c.abrirMenu();
        c.pause();
        c.ligarMudo();
        c.fecharMenu();

    }
}
