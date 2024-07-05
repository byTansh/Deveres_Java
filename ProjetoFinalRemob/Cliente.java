
public class Cliente extends Usuario{

//Atributos
    long numeroCartao;
    boolean pcd;
//Fim atributos

//Getters and Setters
    public long getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(long numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public boolean isPcd() {
        return pcd;
    }

    public void setPcd(boolean pcd) {
        this.pcd = pcd;
    }
//Fim Getters and Setters

//Método construtor
    public Cliente(String nome, String cpf, int idade, String sexo, long telefone,
                   String email, long numeroCartao, boolean pcd){
                    super(nome, cpf, idade, sexo, telefone, email);
                    this.numeroCartao = numeroCartao;
                    this.pcd = pcd;
            }
//Fim Método construtor

//Método para exibir dados do Cliente
    @Override
    public String exibeDados() {
        return  "|Nome: " + getNome() + "|\n|Cpf: " + getCpf() + "|\n|Idade: " + getIdade()
                + "|\n|Sexo: " + getSexo() + "|\n|Telefone: " + getTelefone()
                + "|\n|Numero do Cartao: " + numeroCartao + "|\n|Pcd: " + pcd + "|\n";
    }
//Fim Método para exibir dados do Cliente


} // fim da classe 