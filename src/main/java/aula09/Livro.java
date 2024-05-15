package aula09;
import java.util.Scanner;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int TotalPaginas;
    private int paginaAtual;
    private boolean Aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "Livro\n" +
                "  título = " + titulo + "\n" +
                "  Autor = " + autor + "\n" +
                "  Total de Páginas = " + TotalPaginas + "\n" +
                "  Página Atual = " + paginaAtual + "\n" +
                "  Aberto = " + Aberto + "\n" +
                "  Leitor: \n" +
                "    Nome = " + leitor.getNome() + "\n" +
                "    Idade = " + leitor.getIdade() + "\n" +
                "    Sexo = " + leitor.getSexo();
    }

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotalPaginas(totalPaginas);
        this.setAberto(false);
        this.setPaginaAtual(0);
        this.setLeitor(leitor);
    }


    @Override
    public void abrir() {
        this.setAberto(true);
        System.out.println("Livro abrindo.");
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        System.out.println("Livro fechando.");
    }

    @Override
    public void folhear() {
        int pagina;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a Página para onde você quer ir:");
        pagina = sc.nextInt();
        if (pagina > 0 && pagina <= getTotalPaginas()) {
            System.out.println("Estamos na página " + pagina);
            this.paginaAtual = pagina;
        } else {
            System.out.println("Página inválida.");
        }
    }


    @Override
    public void avancarPagina() {
        if (this.isAberto()) {
            if (paginaAtual < TotalPaginas && paginaAtual >= 0) {
                this.setPaginaAtual(paginaAtual + 1);
                System.out.println("Página avançada para " + this.getPaginaAtual());
            } else {
                System.out.println("Não há mais páginas para avançar ou a página não existe");
            }
        } else {
            System.out.println("Não é possível avançar a página. O livro está fechado.");
        }
    }

    @Override
    public void voltarPagina() {
        if (this.isAberto()) {
            if (paginaAtual > 0 && paginaAtual < TotalPaginas) {
                this.setPaginaAtual(paginaAtual - 1);
                System.out.println("Página voltada para " + this.getPaginaAtual());
            } else {
                System.out.println("Você está na primeira página ou a página nao existe");
            }
        } else {
            System.out.println("Não é possível voltar a página. O livro está fechado.");
        }
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return TotalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        TotalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return Aberto;
    }

    public void setAberto(boolean aberto) {
        Aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}
