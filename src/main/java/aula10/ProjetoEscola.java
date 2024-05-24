package aula10;

public class ProjetoEscola {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30, "Masculino");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Sexo: " + pessoa.getSexo());
        pessoa.fazerAniversario();
        System.out.println("Nova idade após aniversário: " + pessoa.getIdade());

        // Funcionario
        Funcionario funcionario = new Funcionario("Maria", 25, "Feminino", "RH", true);
        System.out.println("\nNome do Funcionário: " + funcionario.getNome());
        System.out.println("Idade do Funcionário: " + funcionario.getIdade());
        System.out.println("Sexo do Funcionário: " + funcionario.getSexo());
        System.out.println("Setor do Funcionário: " + funcionario.getSetor());
        System.out.println("Está trabalhando? " + funcionario.isTrabalhando());
        funcionario.MudarSeEstaAtivo();
        System.out.println("Após mudar o status, está trabalhando? " + funcionario.isTrabalhando());

        // Aluno
        Aluno aluno = new Aluno("Pedro", 20, "Masculino", 12345, "Engenharia");
        System.out.println("\nNome do Aluno: " + aluno.getNome());
        System.out.println("Idade do Aluno: " + aluno.getIdade());
        System.out.println("Sexo do Aluno: " + aluno.getSexo());
        System.out.println("Matrícula do Aluno: " + aluno.getMatricula());
        System.out.println("Curso do Aluno: " + aluno.getCurso());

        //  Professor
        Professor professor = new Professor("Ana", 35, "Feminino", "Matemática", 3000);
        System.out.println("\nNome do Professor: " + professor.getNome());
        System.out.println("Idade do Professor: " + professor.getIdade());
        System.out.println("Sexo do Professor: " + professor.getSexo());
        System.out.println("Especialidade do Professor: " + professor.getEspecialidade());
        System.out.println("Salário do Professor: " + professor.getSalario());
        professor.receberAumento(500);
        System.out.println("Novo salário após aumento: " + professor.getSalario());
    }
}

