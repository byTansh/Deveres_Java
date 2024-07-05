import java.util.Scanner;

public class DeverMaiorMenor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int a,b;
        a = 0;
        b = 0;

        System.out.print("Digite o valor de A: ");
        a = entrada.nextInt();

        System.out.print("Digite o valor de B: ");
        b = entrada.nextInt();

        if (a == b){
            System.out.println("--Os valores são iguais!--");
        } else {
            System.out.println("--Os valores digitados são diferentes!--");
        }

        if (a > b){
            System.out.println("O valor de A é maior. Valor de A = "+a);
        }
        else if (a < b) {
            System.out.println("O valor de B é maior. Valor de B = "+b);
        }
    }
}
