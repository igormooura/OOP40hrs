package aula08;

import aula07.Lutador;
import java.util.Random;

public class Luta {
    private Lutador desafiado; //declarar com um tipo abstrato de dados
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }


    public void marcarLuta(Lutador L1, Lutador L2) {
        if (L1 != L2 && L1.getCategoria().contentEquals(L2.getCategoria())) {
            this.setAprovada(true);
            this.setDesafiado(L1);
            this.setDesafiante(L2);
        } else {
            this.setAprovada(false);
        }
    }

        public void lutar(){
            if(this.aprovada){
                System.out.println("--- DESAFIADO! ---");
                this.getDesafiado().apresentar();
                System.out.println("--- DESAFIANTE! ---");
                this.getDesafiante().apresentar();
                System.out.println("-------------------");

                Random gerador = new Random();

                int vencedor = gerador.nextInt(3); // 0 1 2

                switch (vencedor){
                    case 0:
                        System.out.println("Empatou");
                        this.getDesafiado().empatarLuta();
                        this.getDesafiante().empatarLuta();
                        break;
                    case 1:
                        System.out.println(this.desafiante.getNome() + " ganhou!");
                        System.out.println(this.desafiado.getNome() + " perdeu!");
                        this.getDesafiante().ganharLuta();
                        this.getDesafiado().perderLuta();
                        break;
                    case 2:
                        System.out.println(this.desafiado.getNome() + " ganhou!");
                        System.out.println(this.desafiante.getNome() + " perdeu!");
                        this.getDesafiado().ganharLuta();
                        this.getDesafiante().perderLuta();
                        break;
                }
                System.out.println("====================");
            }
            else {
                System.out.println("A luta nao pode ocorrer");
            }
        }

}