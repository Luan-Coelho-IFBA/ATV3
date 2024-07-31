public class Livro extends Publicacao {
    private int edicao;
    private long isbn;

    public Livro(String titulo, String autor, int anoDePublicacao, String genero, String editora,
            int quantidadeDisponivel, int edicao, long isbn) {
        super(titulo, autor, anoDePublicacao, genero, editora, quantidadeDisponivel);
        this.edicao = edicao;
        this.isbn = isbn;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Ano de publicação: " + this.getAnoDePublicacao());
        System.out.println("Gênero: " + this.getGenero());
        System.out.println("Editora: " + this.getEditora());
        System.out.println("Quantidade disponível: " + this.getQuantidadeDisponivel());
        System.out.println("Edição: " + this.edicao);
        System.out.println("ISBN: " + this.isbn);
    }

}
