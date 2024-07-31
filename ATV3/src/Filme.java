public class Filme extends Publicacao {
    private String diretor;
    private String atorPrincipal;
    private String sinopse;
    private int tempoDeDuracao;

    public Filme(String titulo, String autor, int anoDePublicacao, String genero, String editora,
            int quantidadeDisponivel, String diretor, String atorPrincipal, String sinopse, int tempoDeDuracao) {
        super(titulo, autor, anoDePublicacao, genero, editora, quantidadeDisponivel);
        this.diretor = diretor;
        this.atorPrincipal = atorPrincipal;
        this.sinopse = sinopse;
        this.tempoDeDuracao = tempoDeDuracao;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Ano de publicação: " + this.getAnoDePublicacao());
        System.out.println("Gênero: " + this.getGenero());
        System.out.println("Editora: " + this.getEditora());
        System.out.println("Quantidade disponível: " + this.getQuantidadeDisponivel());
        System.out.println("Diretor: " + this.diretor);
        System.out.println("Ator principal: " + this.atorPrincipal);
        System.out.println("Sinopse: " + this.sinopse);
        System.out.println("Tempo de duração: " + this.tempoDeDuracao);
    }

}
