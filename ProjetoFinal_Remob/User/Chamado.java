

public class Chamado{

    String assunto;
    int numeroDoChamado;
    String status;
    Usuario usuario;

//Método construtor
          public Chamado(String assunto, int numeroDoChamado, String status, Usuario usuario){
                            this.assunto = assunto;
                            this.numeroDoChamado = numeroDoChamado;
                            this.status = status;
                            this.usuario = usuario;
                      }
//Fim Método construtor

//Getters and Setters
    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public int getNumeroDoChamado() {
        return numeroDoChamado;
    }

    public void setNumeroDoChamado(int numeroDoChamado) {
        this.numeroDoChamado = numeroDoChamado;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
//Fim de Getters and Setters

//Método para exibir dados do "Chamado" e dados
    public String exibeDados() {
        return  "|Dados do Chamado| \n|Assunto: " + assunto +
                "|\n|N do chamado: " + numeroDoChamado + "|\n|Status: " + status +
                "|\n|Motorista| \n" + usuario.exibeDados() + "_________________________________\n";
    }

    public String exibeDados2() {
        return  "|Dados do Chamado| \n|Assunto: " + assunto +
                "|\n|N do chamado: " + numeroDoChamado + "|\n|Status: " + status +
                "|\n|Cliente| \n" + usuario.exibeDados() + "_________________________________\n";
    }

}