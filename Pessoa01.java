public class Pessoa01 {
    private String nome;
    private int idade;
    private Endereco endereco;

    public void setPessoa01(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    public void setPessoa01(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        if (endereco != null) {
            System.out.println("Endereço: " + endereco.getRua() + ", " + endereco.getNumero());
        } else {
            System.out.println("Endereço: Não informado");
        }
    }
}
