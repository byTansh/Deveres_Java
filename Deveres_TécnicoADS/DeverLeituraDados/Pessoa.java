import java.util.Date;

public class Pessoa{

    private String nome;
    private int cpf;
    private float saldoBancario;
    private Date dataNascimento;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public float getSaldoBancario() {
        return saldoBancario;
    }

    public void setSaldoBancario(float saldoBancario) {
        this.saldoBancario = saldoBancario;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    void andar(){
        System.out.println(this.nome +  "Andando...");
    }
    void falar(){
        System.out.println(this.nome +  "Falando...");
    }
    void dormir(){
        System.out.println(this.nome +  "Dormindo...");
    }
    void comer(){
        System.out.println(this.nome +  "Comendo...");
    }


}