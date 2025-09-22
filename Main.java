public class Main {
    public static void main(String [] args) {
        Pessoa p1 = new Pessoa("David", 21);
        Pessoa p2 = new Pessoa("Samara", 27);

        System.out.println("==== Registro de Pessoas ==== ");
        System.out.println("Nome: " + p1.nome + ", Idade: " + p1.idade);
        System.out.println("Nome: " + p2.nome + ", Idade: " + p2.idade);
        System.out.println("=============================");
    }
}