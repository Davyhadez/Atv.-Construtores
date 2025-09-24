public class Produto {

    public Produto(String tablet, double par) {
    }
    private String nome;
    private double preco;

public void setNome(String nome) {
    this.nome = nome;
}

public String getNome() {
    return nome;
}

public void setPreco(double preco) {
    if (preco < 0) {
        System.out.println("Preço inválido. O preço não pode ser negativo.");
    } else {
        this.preco = preco;
    }
}

public double getPreco() {
    return preco;
}
}
