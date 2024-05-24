package aula11;

public class Aula11 {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", 20, "Masculino", 12345, "Engenharia");
        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Idade do aluno: " + aluno.getIdade());
        System.out.println("Sexo do aluno: " + aluno.getSexo());
        System.out.println("Matrícula do aluno: " + aluno.getMatricula());
        System.out.println("Curso do aluno: " + aluno.getCurso());
        aluno.fazerAniversario();
        aluno.pagarMensal();
        System.out.println("-----------------------------------------------------------");

        Bolsista bolsista = new Bolsista("Maria", 22, "Feminino", 54321, "Medicina", 1500);
        System.out.println("\nNome do bolsista: " + bolsista.getNome());
        System.out.println("Idade do bolsista: " + bolsista.getIdade());
        System.out.println("Sexo do bolsista: " + bolsista.getSexo());
        System.out.println("Matrícula do bolsista: " + bolsista.getMatricula());
        System.out.println("Curso do bolsista: " + bolsista.getCurso());
        System.out.println("Valor da bolsa: " + bolsista.getBolsa());
        bolsista.fazerAniversario();
        bolsista.renovarBolsa();
        bolsista.pagarMensal();
        System.out.println("-----------------------------------------------------------");

        Tecnico tecnico = new Tecnico("Carlos", 25, "Masculino", 98765, "Informática", 54321);
        System.out.println("\nNome do técnico: " + tecnico.getNome());
        System.out.println("Idade do técnico: " + tecnico.getIdade());
        System.out.println("Sexo do técnico: " + tecnico.getSexo());
        System.out.println("Matrícula do técnico: " + tecnico.getMatricula());
        System.out.println("Curso do técnico: " + tecnico.getCurso());
        System.out.println("Registro Profissional do técnico: " + tecnico.getRegitroProfissional());
        tecnico.fazerAniversario();
        tecnico.praticar();
        System.out.println("-----------------------------------------------------------");

        Professor professor = new Professor("Ana", 35, "Feminino", "Matemática", 5000);
        System.out.println("\nNome do professor: " + professor.getNome());
        System.out.println("Idade do professor: " + professor.getIdade());
        System.out.println("Sexo do professor: " + professor.getSexo());
        System.out.println("Especialidade do professor: " + professor.getEspecialidade());
        System.out.println("Salário do professor: " + professor.getSalario());
        professor.fazerAniversario();
        professor.receberAumento();
        System.out.println("-----------------------------------------------------------");

        Visitante visitante = new Visitante("Robert", 33, "Masculino");
        System.out.println("\nNome do visitante: " + visitante.getNome());
        System.out.println("Idade do visitante: " + visitante.getIdade());
        System.out.println("Gênero do visitante: " + visitante.getSexo());
    }
}
