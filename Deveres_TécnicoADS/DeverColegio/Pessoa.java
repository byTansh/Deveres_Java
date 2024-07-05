//SuperClass

class Pessoa {

// 4 atributos
    private String nome;
    private int idade;
    private String email;
    private String sexo;

// 1 Método Construtor sem parametros
    // public Pessoa() {
    //     this.nome = "";
    //     this.idade = 0;
    //     this.email = "";
    //     this.sexo = "";
    //}
// 1 Método Construtor com parametros
    public Pessoa(String nome, int idade, String email, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.sexo = sexo;
    }

// 4 Getters and 4 Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
// 1 Método Criado para Imprimir dados da "Pessoa"

    public String exibeDados() {
        return "Nome: " + nome + "\nIdade: " + idade
                + "\nEmail: " + email + "\nSexo: " + sexo;
    }

}  
//fim classe Pessoa
