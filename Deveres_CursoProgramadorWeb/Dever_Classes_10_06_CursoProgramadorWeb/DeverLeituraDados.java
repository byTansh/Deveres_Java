import java.util.Scanner;

public class DeverLeituraDados {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do seu filme favorito: ");
        String filme = entrada.nextLine();

        System.out.println("Digite o ano de lançamento do filme: ");
        int anoLancamento = entrada.nextInt();

        System.out.println("Digite a nota do filme: ");
        double nota = entrada.nextDouble();

        System.out.println("Digite a sinopse do filme: ");
        String sinopse = entrada.nextLine();


        System.out.println("Seu filme preferido é: " + filme);
        System.out.println("Foi lançado em: " + anoLancamento);
        System.out.println("Sua note é:" + nota);
        System.out.println("Sinopse do filme: " + sinopse);
    }
}
