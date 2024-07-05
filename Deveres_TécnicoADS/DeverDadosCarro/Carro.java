class Carro{

    String modelo, marca, placa, dono;

    int ano;

    int idade(int ano){
        return 2024 - ano;
    }

    void dados(){
        System.out.println("Dono do carro: "+dono);
        System.out.println("Marca do carro: "+marca);
        System.out.println("Modelo do carro: "+modelo);
        System.out.println("Placa do carro: "+placa);
        System.out.println("Ano do carro: "+ano);
    }



}