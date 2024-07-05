public class Musica {

    String nomeMusica, artista;

    int anoDelancamento;


    int somaDasAvaliacoes;

    int numeroAvaliacao;

    double recuperarMedia(){
        return somaDasAvaliacoes/numeroAvaliacao;
    }

    void avalia(double avaliacao){

        somaDasAvaliacoes += avaliacao;
        numeroAvaliacao++;
    }

    //Retorno vazio(void), pois só irá printar
    void exibirDados(){
        System.out.println("Artista: "+artista);
        System.out.println("Nome da música: "+nomeMusica);
        System.out.println("Ano de lançamento: "+anoDelancamento);

    }
}