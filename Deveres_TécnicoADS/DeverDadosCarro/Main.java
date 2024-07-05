class Main{
    public static void main(String[] args) {
        
        Carro carro = new Carro();

        carro.dono = "Marcos aurelion souza";
        carro.marca = "Nissan";
        carro.modelo = "Eclipse";
        carro.placa = "EOP-1234";
        carro.ano = 1998;
        carro.dados();
        System.out.println("Ano do carro: "+carro.idade(1998)+" Anos");
    }
}