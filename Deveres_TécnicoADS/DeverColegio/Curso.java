
import java.util.ArrayList;

class Curso {

// 3 Atributos
    private String nome;
    private ArrayList<Aluno> alunos;
    private Professor professor;

// 2 Getters and  2 Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

// 1 Método Criado para Imprimir dados da "Curso"
    public String exibeDadosCurso() {
        return ">> Curso: " + nome + " <<"
             + "\n\n|------- Professor: -------|\n\n" + professor.exibeDados()
             + "\n\n|--------- Alunos: ---------|\n" + exibeAlunos();

    }

// 1 Método Criado para Imprimir dados da "Alunos"
    public String exibeAlunos() {
        String str = "";
        for (Aluno aluno : alunos) {
            str += "\n" + aluno.exibeDados() + "\n";
        }
        return str;
    }

// 2 Métodos para inserir "Alunos" dentro de uma lista
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
} 
//fim classe Curso
