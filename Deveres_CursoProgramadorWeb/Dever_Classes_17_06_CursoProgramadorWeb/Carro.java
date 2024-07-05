public class Carro {

    String modelo, cor;

    int ano;

    int idade(int ano){
        return 2024 - ano;
    }

    void frase() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("idade: " + idade(1998)+ " Anos");
    }

}
