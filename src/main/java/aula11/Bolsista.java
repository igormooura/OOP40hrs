package aula11;

public class Bolsista extends Aluno{
    private int bolsa;

    public void renovarBolsa(){
        System.out.println("Bolsa renovada");
    }
    @Override //mesmo metodo, mas como é de bolsista, tem q ser diferente
    public void pagarMensal(){
        System.out.println("Mensalidade paga como bolsista");
    }

    public int getBolsa() {
        return bolsa;
    }

    public Bolsista(String nome, int idade, String sexo, int matricula, String curso, int bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }


}
