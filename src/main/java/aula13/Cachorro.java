package aula13;

//polimofirsmo por sobrecargas, varias maneiras de usar a mesma classe fazendo coisas diferentes

public class Cachorro extends Lobo {
    @Override
    public void emitirSom() {
        System.out.println("Au, au, au!");
    }

    public void reagir(String frase) {
        if (frase.equalsIgnoreCase("Toma comida") || frase.equalsIgnoreCase("Olá")) {
            System.out.println("Abanou e latiu");
        } else {
            System.out.println("Rosnou");
        }
    }

    public void reagir(int hora, int min) {
        if (hora < 12) {
            System.out.println("Abanou");
        } else if (hora >= 18) {
            System.out.println("Ignorou");
        } else {
            System.out.println("Abanou e latiu");
        }
    }

    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanou");
        } else {
            System.out.println("Rosnou e latiu");

        }
    }

    public void reagir(int idade, double peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanou");
            } else {
                System.out.println("Latiu");
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnou");
            } else {
                System.out.println("Ignorou");
            }
        }
    }
}