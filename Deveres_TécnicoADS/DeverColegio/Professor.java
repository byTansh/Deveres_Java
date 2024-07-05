
class Professor extends Pessoa {

// 2 Atributos
    private String disciplina;
    private float salario;

// 1 Método Construtor Com parametros
// 1 Super == SuperClass. Procura o método Construtor...
// da SuperClass "Pessoa" e o adiciona ao Construtor da class "Professor"
    public Professor(String nome, int idade,
                   String email, String sexo,
                   String disciplina, float salario) {
        super(nome, idade, email, sexo);
        this.disciplina = disciplina;
        this.salario = salario;
    }


    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

//Método para imprimir quando o "Aluno" for cadastrado
    public void cadastraAluno() {
        System.out.println("Aluno cadastrado com sucesso!");
    }

//Método para imprimir dados do "Professor"
    @Override
    public String exibeDados() {
        return "|Nome: " + getNome() + "|\n|Idade: " + getIdade()
                + "|\n|Email: " + getEmail() + "|\n|Sexo: " + getSexo()
                + "|\n|Disciplina: " + disciplina + "|\n|Salario: " + salario + "|";
    }
}
