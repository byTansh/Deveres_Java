import java.security.AlgorithmConstraints;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        System.out.println("\n" + "Atividade Pessoa");
        pessoa.frase();

        Calculadora calculadora = new Calculadora();

        System.out.println("\n" + "Atividade calculadora");
        System.out.println("Total: "+calculadora.dobro(3));

        Musica musica = new Musica();

        System.out.println("\n" + "Atividade Musica");
        musica.artista = "Veigh";
        musica.nomeMusica = "Bolsa de ombro";
        musica.anoDelancamento = 2023;
        musica.avalia(10);
        musica.avalia(14);
        musica.avalia(12);
        musica.exibirDados();
        System.out.println("Media: "+musica.recuperarMedia()+"\n");

        Carro carro = new Carro();
        System.out.println("\n" + "Atividade Carro");

        carro.modelo = "Eclipse";
        carro.ano = 1998;
        carro.cor = "Vermelho";
        carro.frase();

        Aluno aluno = new Aluno();
        System.out.println("\n" + "Atividade Aluno");

        aluno.nome = "Marcos";
        aluno.idade = 18;
        aluno.frase();

    }
}