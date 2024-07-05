import java.util.Random;
import java.util.Scanner;

public class DeverNumberRandom {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        int y = random.nextInt(100);

        int x,z;
        x = 0;

        System.out.println(y);

        lop:for (z = 1; z < 6; z++) {

            System.out.print("Digite seu chute: ");
            x = entrada.nextInt();

            if (x < y) {
                System.out.println("\n" + "Errou, o valor certo é maior!");
                System.out.println("Numero de tentativas: "+ z+"/5" + "\n");
            } else if (x > y) {
                System.out.println("\n" + "Errou, o valor certo é menor!");
                System.out.println("Numero de tentativas: "+ z +"/5" + "\n");
            } else {
                System.out.println("\n" + "PARABENS, VOCE ACERTOU!!!");
                break lop;
            }

            if (z == 5){
                System.out.println("Seu numero de tentativas acabou!");
            }
        }
    }
}
