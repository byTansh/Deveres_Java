import java.util.Scanner;

public class DeverBanco {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        double saldoInicial, deposito, retirada, saldoTotal;

        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Digite seu saldo inicial: ");
        saldoInicial = entrada.nextDouble();

        System.out.println("Você depositou: " + saldoInicial + "\n");

        saldoTotal = saldoInicial;


        lop:
        while (true) {

            int menu;

            System.out.print("1 - Exibir saldo \n" +
                    "2 - Depositar \n" +
                    "3 - Retirar \n" +
                    "4 - Encerrar o sistema \n" + ">");
            menu = entrada.nextInt();

            lop2:
            while (true) {
                if (menu == 2) {
                    System.out.println("\n" + "Digite o valor do Deposito: ");
                    deposito = entrada.nextDouble();
                    saldoTotal = saldoInicial + deposito;
                    System.out.println("\n" + "Você depositou: " + deposito);
                    System.out.println("Seu saldo atual: " + saldoTotal + "\n");
                    break;
                } else if (menu == 3) {
                    System.out.println("\n" + "Digite o valor da Retirada: ");
                    retirada = entrada.nextDouble();
                        if (retirada > saldoTotal) {
                            System.out.println("Retirada não pode ser maior que seu saldo!\n");
                            break lop2;
                        } else {
                            saldoTotal = saldoTotal - retirada;
                            System.out.println("\n" + "Você retirou: " + retirada);
                            System.out.println("Seu saldo atual: " + saldoTotal + "\n");
                            break lop2;
                    }
                } else if (menu == 1) {
                    System.out.println("\n" + "Seu saldo atual: " + saldoTotal + "\n");
                    break;
                } else if (menu == 4) {
                    System.out.println("\n" + "Nome do usuario: " + nome + "\n" + "Saldo Final: " + saldoTotal + "\n");
                    break lop;
                }
            }
        }
    }
}