import java.util.ArrayList;

public class Aluno {

    private String nome;

    private ArrayList<Double> notas = new ArrayList<>();

    public void adicionaNota(double nota){
        notas.add(nota);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
}
