package br.com.senac.product.entity;

public class Products {

    int id;
    String name;
    int price;
    String registrationDate;
    String category;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRegistrationDate() {
        return this.registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String showDate() {
        
        String dados ="Dados do Produto" + "<br> <br>" + "id do produto: " + getId() + "<br>" + "nome do produto: "
                + getName()
                + "<br>" + "preço do produto: " + getPrice() + "<br>" + "data de cadastro: " + getRegistrationDate() +
                "<br>" + "categoria do produto: " + getCategory();
        return dados;
    }

    

}
