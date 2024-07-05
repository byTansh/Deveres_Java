import java.util.Scanner;

public class DeverImparPar {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int a;

        System.out.print("Digite o valor: ");
        a = entrada.nextInt();

        a = a % 2;

        if (a == 1){
            System.out.println("Esse número é impar!");
        } else if (a == 0){
            System.out.println("Esse número é par!");
        }
    }
}
