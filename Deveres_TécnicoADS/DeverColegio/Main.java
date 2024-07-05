
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n**Programa de matricula em Java**\n");

        // Jeito Simples de dar valor para variaveis
        // Porem ocupa mais linhas de codigo
        // Professor prof = new Professor();
        // prof.setNome("João");
        // prof.setIdade(50);
        // prof.setEmail("prof@gmail.com");	
        // prof.setSexo("M");
        // prof.setDisciplina("Matemática");
        // prof.setSalario(5000);
        // System.out.println("**Professor**");
        // String dados = prof.exibeDados();
        // System.out.println(dados);
        // System.out.println("");
        Professor professor = new Professor("Joao", 31, "JoaoPaulo@gmail.com", "M", "Matematica", 3000);

        Aluno aluno = new Aluno("Jonathan", 19, "JonathanFerreira@gmail.com", "M", 004002, "Matematica");

        Aluno aluno2 = new Aluno("Yasmim", 18, "YasmimMota@gmail.com", "F", 004003, "Matematica");

        Aluno aluno3 = new Aluno("Victor", 22, "VictorHugo@gmail.com", "M", 004004, "Matematica");

        Aluno aluno4 = new Aluno("Pedro", 18, "Pedrinho@gmail.com", "M", 004005, "Matematica");

        Aluno aluno5 = new Aluno("Kefera", 19, "Kefera023@gmail.com", "F", 004006, "Matematica");

        Aluno aluno6 = new Aluno("Maria", 18, "MariaHuana@gmail.com", "F", 004007, "Matematica");

        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);
        alunos.add(aluno6);

        //instancia objeto da classe Curso
        Curso curso = new Curso();
        curso.setNome("Matematica");
        curso.setAlunos(alunos);
        curso.setProfessor(professor);

        System.out.println(curso.exibeDadosCurso());

    } // FIM MAIN

    // public static void salvarArquivo(Pessoa armazena) throws IOException {
    //     String str = armazena.exibeDados();
    //     BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
    //     writer.write(str);    
    //     writer.close();
    // }
} //fim classe Programa
