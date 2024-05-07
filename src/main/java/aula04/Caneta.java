package aula04;

public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta( String m, String c, float p){ //Este é o metodo construtor
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }

    public String getModelo(){   //Getter
        return this.modelo;
    }
    public void setModelo(String m){ //Setter
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("Caneta DAORA DEMAIS ABAIXO");
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Modelo: " + this.modelo );
        System.out.println("Cor: " + this.cor);
        System.out.println("Tá tampada?: " + this.tampada + "\n");
    }
}
