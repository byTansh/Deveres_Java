//import java.util.Date;


public class Pagamento {
    private String nomeCliente;
    private String tipoPagamento;
    private long numeroCartao;
    private String bandeira;  
    private float valorCobrado;
    private String dataViagem; 
    private String statusPagamento;
    //private Date dataViagem;

// método construtor 
public Pagamento(String nomeCliente,String tipoPagamento, long numeroCartao, String bandeira, 
    float valorCobrado, String dataViagem, String statusPagamento) {
        this.nomeCliente = nomeCliente; 
        this.tipoPagamento = tipoPagamento;
        this.numeroCartao = numeroCartao; 
        this.bandeira = bandeira; 
        this.valorCobrado = valorCobrado; 
        this.dataViagem = dataViagem;
        this.statusPagamento = statusPagamento; 


} 
// fim do construtor

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
//Método para exibir dados do cartao/cliente

    public String exibeDados() {
    //     String nomeCliente,String tipoPagamento, long numeroCartao, String bandeira, 
    // float valorCobrado, String dataViagem
        return  "|Dados do Pagamento| \n|Nome Cliente: " + nomeCliente +
                "|\n|Tipo de pagamento: " + tipoPagamento + "|\n|Numero do Cartao  : " + numeroCartao +
                "|\n|Bandeira: " + bandeira + "|\n|Valor Cobrado: " + valorCobrado +
                "|\n|Data da Viagem: "+ dataViagem +
                "|\n|Status do Pagamento: " + statusPagamento + "|\n";

    } // fim do método eibe dados
    
// metodos status aprovado, problemas com o cartao, negado; 


//Fim Método para exibir dados do cartao/cliente
//  public String emitirReciboCliente() { 
    // valor total da corrida 
    // data da viagem 
    // tipo de pagamento

//  }    
// criar método para exibir pagamento cliente 
// criar método para exibir pagamento motorista
//  public String emitirReciboMotorista() { 
    // valor da corrida 

// criar método para exibir
// emitir recibo cliente 
// emitir recibo motorista
// adicionar método concluir viagem com data e pagamento 
// curta distancia --> até 10km -->  
// media distancia --> 
// longa distancia ---> 


// criar método autoriza pagamento

} // fim da classe Pagamento



