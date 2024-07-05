public class Viagem{
//Atributos
    String status;
    private String plano;
    private String tipoViagem;
    private String dataViagem;
    private String localPartida;
    private String localChegada;

    private String nomeMotorista;
    private String cpfMotorista;
    private String nomeCliente;
    private String cpfCliente;
//Fim Atributos

//Método construtor
    public Viagem(String status, String plano, String tipoViagem, String dataViagem, String localPartida, String localChegada,
                  String nomeMotorista, String cpfMotorista,
                  String nomeCliente, String cpfCliente){
        this.status = status;
        this.plano = plano;
        this.tipoViagem = tipoViagem;
        this.dataViagem = dataViagem;
        this.localPartida = localPartida;
        this.localChegada = localChegada;

        this.nomeMotorista = nomeMotorista;
        this.cpfMotorista = cpfMotorista;

        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
    }
//Método construtor

//Getters and Settters
    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public String getTiposViagem() {
        return tipoViagem;
    }

    public void setTiposViagem(String tipoViagem) {
        this.tipoViagem = tipoViagem;
    }

    public String isstatus() {
        return status;
    }

    public void setstatus(String status) {
        this.status = status;
    }
//Fim Getters and Settters

    public String exibeDados() {
        return  "|Dados da Viagem| \n|Plano: " + plano +
                "|\n|Tipo de Viagem: " + tipoViagem + "|\n|Data da Viagem: " + dataViagem +
                "|\n|Local de Partida: " + localPartida + "|\n|Local de Chegada: " + localChegada +
                "|\n\n|Nome do Motorista: "+ nomeMotorista +
                "|\n|Cpf do Motorista: "+ cpfMotorista +
                "|\n\n|Nome do Cliente: "+ nomeCliente +
                "|\n|Cpf do Cliente "+ cpfCliente + "|\n";

    }

}