public class ProgramaBiblioteca {
    public static void main(String[] args) throws Exception {
        Livro livro1 = new Livro("Percy Jackson", "Rick Riordan", 2005, "Fantasia", "Intriseca", 200, 1,
                1111111111111L);
        Filme filme1 = new Filme("Percy Jackson", "Rick Riordan", 2005, "Fantasia", "Intriseca", 800, "Chris Columbus",
                "Logan Lerman",
                "O adolescente Percy Jackson descobre que os deuses gregos e as criaturas mitológicas são reais. Ele é filho de uma divindade e logo entra para um acampamento de treinamento para semideuses. Enquanto tenta se adaptar a seus novos poderes e amigos, ele descobre que o Raio-Mestre do poderoso Zeus foi roubado e ele é o principal suspeito. Assim, ele tenta solucionar o mistério junto com seus novos colegas, Grover e Annabeth.",
                120);

        Publicacao[] publicacoes = { livro1, filme1 };

        for (Publicacao publicacao : publicacoes) {
            publicacao.imprimeDados();
        }

        // Resposta da V: Isso foi possível devido ao conceito de polimorfismo, as
        // classes Livro e Filme são filhas da classe Publicacao
        // Resposta da VI: Isso é possível, porque o método imprimeDados, apesar de ser
        // abstrata na classe mãe, foi implementada nas classes filhas
    }
}
