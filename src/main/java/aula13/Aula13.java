package aula13;

public class Aula13 {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Lobo lobo = new Lobo();

        cachorro.reagir("Olá");
        cachorro.reagir("Vai apanhar");
        cachorro.reagir(15, 40); //hora, min
        cachorro.reagir(22, 00);
        cachorro.reagir(true); // dono
        cachorro.reagir(false);
        cachorro.reagir(2, 15.5); //idade, peso
        cachorro.reagir(19, 8.5);


        cachorro.emitirSom();

    }

}
