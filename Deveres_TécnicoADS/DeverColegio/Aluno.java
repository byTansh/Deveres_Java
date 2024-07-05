
class Aluno extends Pessoa {

// 2 Atributos
    private int matricula;
    private String curso;

// 1 Método Construtor sem parametros
// 1 Super == SuperClass. Procura o método Construtor...
// da SuperClass "Pessoa" e o adiciona ao Construtor da class "ALuno"
        public Aluno(String nome, int idade,
                        String email, String sexo,
                        int matricula, String curso) {
                super(nome, idade, email, sexo);
                this.matricula = matricula;
                this.curso = curso;
        }
// 2 Getters e 1 setters

    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

// 1 Método para Criar novos cursos
    public void atualizarCurso(String novoCurso) {
        this.curso = novoCurso;
    }
// 1 Método para Apagar Matricula dos alunos

    public void apagaMatricula() {
        this.matricula = 0;
    }

// 2 Método para imprimir Dados dos alunos
    @Override
    public String exibeDados() {
        return "|Nome: " + getNome() + "|\n|Idade: " + getIdade()
                + "|\n|Email: " + getEmail() + "|\n|Sexo: " + getSexo()
                + "|\n|Matricula: " + matricula + "|\n|Curso: " + curso + "|";
    }

    public void exibeDados(String msg) {
        System.out.println(msg);
        System.out.println("|Nome: " + getNome() + "|\n|Idade: " + getIdade()
                + "|\n|Email: " + getEmail() + "|\n|Sexo: " + getSexo()
                + "|\n|Matricula: " + matricula + "|\n|Curso: " + curso + "|");
        System.out.println("");
    }

}
