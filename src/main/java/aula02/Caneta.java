package aula02;

public class Caneta {
    public String modelo;
    public String cor;
    public float ponta;
    protected int carga;
    private boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada?: " + this.tampada);
    }

    public void rabiscar(){
        if(this.tampada){
            System.out.println("Erro, não é possível rabiscar");
        }
        if(!this.tampada){
            System.out.print("Pode rabiscar patrao");
        }
    }
    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
}