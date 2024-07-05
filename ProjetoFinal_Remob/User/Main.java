
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//Informações dos usuarios    
// instancia do objeto motorista 
        Motorista motorista = new Motorista("Joao", "19636703027", 32, "M", 61985649538l, "JoaoGomes@gmail.com", 3256968, 2659638, "Limpo", "Aprovado!", true);
        Motorista motorista2 = new Motorista("Ruan", "03190648085", 32, "M", 61964646455l, "RuanMatias@gmail.com", 3256415, 35684569, "Limpo", "Aprovado!", false);

// instancia do objeto cliente
        Cliente cliente = new Cliente("Antonio", "02935053060", 25, "M", 61985649538l, "AntonioGerman@gmail.com", 3568547569526485l, true);
        Cliente cliente2 = new Cliente("Davi", "62712606086", 35, "M", 61985649538l, "DaviGuerra@gmail.com", 1365148919512561l, false);
        Cliente cliente3 = new Cliente("Pedro", "33748098049", 18, "M", 61985649538l, "PedroDias@gmail.com", 3241895877845656l, false);
        Cliente cliente4 = new Cliente("kaua", "25482978028", 86, "M", 61985649538l, "KauaForte@gmail.com", 6894819778998892l, false);

// instancia do objeto chamado
        Chamado chamado = new Chamado("Problema com pedido", 1, "Em andamento...", cliente);
        Chamado chamado2 = new Chamado("Cliente nao pagou", 2, "Fechado", motorista);
        Chamado chamado3 = new Chamado("Nao deu troco", 3, "Em andamento...", cliente4);

// instancia do objeto pagamento
        Pagamento pagamento = new Pagamento("Antonio", "credito", cliente.getNumeroCartao(), "Visa", 1090, "29/05/2024", "APROVADO");
        Pagamento pagamento2 = new Pagamento("Davi", "debito", cliente2.getNumeroCartao(), "Mastercard", 1230, "18/03/2024", "PROCESSANDO");
        Pagamento pagamento3 = new Pagamento("Pedro", "debito", cliente3.getNumeroCartao(), "Mastercard", 1230, "18/03/2024", "NEGADO");

// intancia do objeto Viagem
        Viagem viagem = new Viagem("Encerrada", "Premium", "Normal", "10/05/2024", "Csb 9, quadra 9, casa 9", "Csb 9, quadra 9, casa 9", motorista.getNome(), motorista.getCpf(), cliente4.getNome(), cliente4.getCpf());
        Viagem viagem2 = new Viagem("Encerrada", "Premium", "Normal", "10/05/2024", "Csb 9, quadra 9, casa 9", "Csb 9, quadra 9, casa 9", motorista2.getNome(), motorista2.getCpf(), cliente.getNome(), cliente.getCpf());
        Viagem viagem3 = new Viagem("Encerrada", "Premium", "Normal", "10/05/2024", "Csb 9, quadra 9, casa 9", "Csb 9, quadra 9, casa 9", motorista.getNome(), motorista.getCpf(), cliente3.getNome(), cliente3.getCpf());
//Fim de Informações dos usuarios
//Arraylist dos Motoristas
        ArrayList<Motorista> motoristas = new ArrayList<>();
        motoristas.add(motorista);
        motoristas.add(motorista2);
//Arraylist dos Clientes
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
//Arraylist dos Chamados
        ArrayList<Chamado> chamados = new ArrayList<>();
        chamados.add(chamado);
        chamados.add(chamado2);
        chamados.add(chamado3);

// Arraylist do Pagamento
        ArrayList<Pagamento> pagamentos = new ArrayList<>();
        pagamentos.add(pagamento);
        pagamentos.add(pagamento2);
        pagamentos.add(pagamento3);
// Arraylist de Viagem
        ArrayList<Viagem> viagens = new ArrayList<>();
        viagens.add(viagem);
        viagens.add(viagem2);
        viagens.add(viagem3);

//Fim de ArrayLists
//Imprimir lista de Motoristas
        System.out.println("\n\n|------- Motoristas: -------|\n\n");
        for (Motorista motoristaS : motoristas) {
            System.out.println(motoristaS.exibeDados());
            System.out.println("_________________________________\n");
        }
//Imprimir lista de Clientes
        System.out.println("\n\n|------- Clientes: -------|\n\n");
        for (Cliente clienteS : clientes) {
            System.out.println(clienteS.exibeDados());
            System.out.println("_________________________________\n");
        }
//Imprimir Chamados
        System.out.println("\n\n|------- Chamados: -------|\n\n");
        for (Chamado chamadoS : chamados) {
            if (chamadoS.getUsuario() instanceof Motorista) {
                System.out.println(chamadoS.exibeDados());
            } else if (chamadoS.getUsuario() instanceof Cliente) {
                System.out.println(chamadoS.exibeDados2());
            }
        }
// imprimir pagamento
        System.out.println("\n\n|------- Pagamento: -------|\n\n");
        for (Pagamento pagamentoS : pagamentos) {
            System.out.println(pagamentoS.exibeDados());
            System.out.println("_________________________________\n");

        }
    
// imprimir Viagens
        System.out.println("\n\n|------- Viagens: -------|\n\n");
        for (Viagem viagenS : viagens) {
            System.out.println(viagenS.exibeDados());
            System.out.println("_________________________________\n");

        }
    }
}
// fim da main
