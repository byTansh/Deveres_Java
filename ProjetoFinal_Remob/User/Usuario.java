
public class Usuario {
//Atributos
    private String nome;
    private String cpf;
    private int idade;
    private String sexo;
    private long telefone;
    private String email;
//Fim atributos

//Método construtor
    public Usuario(String nome, String cpf,int idade, String sexo, long telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
    }
//Fim Método construtor

//Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
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
//Fim Getters and Setters

        
    public String exibeDados() {
        return  "|Nome: " + getNome() + "|\n|Cpf: " + getCpf() + "|\n|Idade: " + getIdade()
                + "|\n|Sexo: " + getSexo() + "|\n|Telefone: " + getTelefone() + "|\n\n";
    }   
}