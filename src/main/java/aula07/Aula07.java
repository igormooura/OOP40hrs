package aula07;
import aula08.Luta;

public class Aula07 {
    public static void main(String[] args){
        Lutador[] L = new Lutador [6];

        L[0] = new Lutador("Prety Boy", "França", 31, 175f, 68.9f, 11, 2, 1);

        L[1] = new Lutador("Putscript", "Brasil", 29, 168f, 57.8f, 14, 2, 3);

        L[2] = new Lutador("Snapshadow", "EUA", 35, 165f, 80.9f, 12, 2, 1);

        L[3] = new Lutador("Dead Code", "Austrália", 28, 193f, 81.6f, 13, 0, 2);

        L[4] = new Lutador("UFOCobol", "Brasil", 37, 170f, 119.3f, 5, 4, 3);

        L[5] = new Lutador("Nerdaart", "EUA", 30, 181f, 105.7f, 12, 2, 4);

        //L[1].status();
        //L[2].apresentar();

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(L[4], L[5]);
        UEC01.lutar();
    }
}
