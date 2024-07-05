
import java.util.Date;

public class Main {
    public static void main(String[] args){
        
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("João");
        pessoa.setCpf(05056607177);
        pessoa.setSaldoBancario(1000);
        pessoa.setDataNascimento(new Date("01/09/2005"));
        pessoa.setEndereco("Rua 1, casa 89");

        System.out.println("--------------------------");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Cpf: " + pessoa.getCpf());
        System.out.println("Saldo: " + pessoa.getSaldoBancario());
        System.out.println("Data nascimento: " + pessoa.getDataNascimento());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("--------------------------");

        pessoa.andar();
        pessoa.falar();
        pessoa.dormir();
        pessoa.comer();

    }
}