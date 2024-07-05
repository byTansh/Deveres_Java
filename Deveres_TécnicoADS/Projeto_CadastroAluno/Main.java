import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        int op1, op2;

        double media;

        String nomeRemovido;

        System.out.println("---- Bem vindo ao sistema do colegio Estar Bem ----\n");

        while (true) {
            System.out.print("\n1 >> Cadastrar aluno" +
                    "\n2 >> Remover Aluno" +
                    "\n3 >> Calcular médias" +
                    "\n4 >> Aluno com maior médio" +
                    "\n>> ");
            op1 = entrada.nextInt();

            if (op1 == 1) {
                System.out.print("\nDigite o nome do Aluno: ");
                if (entrada.hasNextLine()){
                    entrada.nextLine();
                }
                Aluno aluno = new Aluno();
                aluno.setNome(entrada.nextLine());
                alunos.add(aluno);
            lop2:while (true){
                for (int index = 1; index <= 10; index++) {
                        System.out.print("\nDigite a "+ index + "ª nota: ");
                        aluno.adicionaNota(entrada.nextDouble());
                        while (true){
                            System.out.print("\n1 >> Inserir outra nota" +
                                               "\n2 >> Terminar"+
                                               "\n>> ");
                            op2 = entrada.nextInt();

                            if (op2 == 1) {
                                break;
                            }
                            else if (op2 == 2){

                                break lop2;
                            }
                        }
                }
            }

            }
            else if (op1 == 2){

                System.out.println("Digite o nome do aluno a ser removido: ");
                if (entrada.hasNextLine()){
                    entrada.nextLine();
                }
                nomeRemovido = entrada.nextLine();

                for (int index = 1; index <= 10; index++){
                    alunos.get(index);
                    if (nomeRemovido.equals(alunos.get(index))){
                        alunos.remove(index);
                        System.out.println("Aluno Removido com Sucesso!");
                    }
                    else {
                        System.out.println("Aluno não existe!");
                        continue;
                    }
                }

            }
        }
    }
}
