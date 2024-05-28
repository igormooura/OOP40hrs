package aula12;

public class Aula12 {
    public static void main(String[]args){
        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();

        mamifero.setPeso(85.3);
        mamifero.setIdade(2);
        mamifero.setMembros(4);
        mamifero.alimentar();
        mamifero.emitirSom();
        mamifero.locomover();

        System.out.println("------------");
        reptil.setPeso(0.35);
        reptil.setIdade(1);
        reptil.setMembros(0);
        reptil.locomover();
        reptil.alimentar();
        reptil.emitirSom();

        System.out.println("----------");
        peixe.setPeso(0.35);
        peixe.setIdade(1);
        peixe.setMembros(0);
        peixe.locomover();
        peixe.alimentar();
        peixe.emitirSom();
        peixe.soltarBolha();

        System.out.println("----------");
        ave.setPeso(0.89);
        ave.setIdade(2);
        ave.setMembros(2);
        ave.locomover();
        ave.alimentar();
        ave.emitirSom();
        ave.fazerNinho();

        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        Tartaruga tartaruga = new Tartaruga();
        System.out.println("Cachorro:");
        cachorro.alimentar();
        cachorro.emitirSom();
        cachorro.locomover();
        cachorro.abanarRabo();

        System.out.println("\n Canguru: ");
        canguru.alimentar();
        canguru.emitirSom();
        canguru.locomover();
        canguru.usarBolsa();

        System.out.println("\n Tartaruga:");
        tartaruga.locomover();



    }
}
