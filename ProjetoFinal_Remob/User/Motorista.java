public class Motorista extends Usuario{

//Atributos
    private int rg;
    private int cnh;
    private String nadaConsta;
    private String examePsicotecnico;
    private boolean statusDisponibilidade;
//Fim Atributos
//Método construtor
     public Motorista(String nome, String cpf, int idade, String sexo, long telefone,
                      String email, int rg,
                      int cnh, String nadaConsta, String examePsicotecnico, boolean statusDisponibilidade){
                            super(nome, cpf, idade, sexo, telefone, email);
                            this.rg = rg;
                            this.cnh = cnh;
                            this.nadaConsta = nadaConsta;
                            this.examePsicotecnico = examePsicotecnico;
                            this.statusDisponibilidade = statusDisponibilidade;
                      }
//Fim Método construtor

//Getters and Setters

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getCnh() {
        return cnh;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }

    public String getNadaConsta() {
        return nadaConsta;
    }

    public void setNadaConsta(String nadaConsta) {
        this.nadaConsta = nadaConsta;
    }

    public String getExamePsicotecnico() {
        return examePsicotecnico;
    }

    public void setExamePsicotecnico(String examePsicotecnico) {
        this.examePsicotecnico = examePsicotecnico;
    }
//Fim Getters and Setters
    @Override
    public String exibeDados() {
        return  "|Nome: " + getNome() + "|\n|Idade: " + getIdade()
                + "|\n|Sexo: " + getSexo() + "|\n|Telefone: " + getTelefone()
                + "|\n|Email: " + getEmail() + "|\n|Rg: " + rg 
                + "|\n|Cnh: " + cnh + "|\n|Nada Consta: " + nadaConsta
                + "|\n|Exame psicotecnico: " + examePsicotecnico + "|\n";
    }
}
