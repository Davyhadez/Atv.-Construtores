
public class Main {
    public static void main(String [] args) {
        //ATIVIDADE 1
        Pessoa p1 = new Pessoa("David", 21);
        Pessoa p2 = new Pessoa("Samara", 27);

        System.out.println("==== Registro de Pessoas ==== ");
        System.out.println("Nome: " + p1.nome + ", Idade: " + p1.idade);
        System.out.println("Nome: " + p2.nome + ", Idade: " + p2.idade);
        System.out.println("=============================");
        
        //ATIVIDADE 2
        Carro newCar = new Carro();
        newCar.setMarca("Fiat");
        newCar.setAno(2021);
        System.out.println("==== Informações do Carro ====");
        System.out.println("Marca do carro: " + newCar.getMarca());
        System.out.println("Ano do veículo: " + newCar.getAno());

        //ATIVIDADE 3
        ContaBancaria conta_01 = new ContaBancaria(123456, 1000.0);
        System.out.println("==== Dados Bancários ====");
        conta_01.getSaldo();
        System.out.println("Depositando saldo de R$ 500,00");
        conta_01.deposito(500.0);
        conta_01.getSaldo();
        System.out.println("Sacando R$ 200,00");
        conta_01.sacar(200.0);
        conta_01.getSaldo();
        System.out.println("=========================");

        //ATIVIDADE 4
        Produto product01 = new Produto("Tablet", 100.0);
        product01.setNome("Tablet");
        product01.setPreco(-100.0);
        
        //ATIVIDADE 4
        System.out.println("==== Informações pessoais da pessoa 01 ====");
        Endereco endereco01 = new Endereco();
        endereco01.setRua("Alameda Canaã");
        endereco01.setNumero(14);

        Pessoa01 pessoa01 = new Pessoa01();
        pessoa01.setPessoa01("David Lago");
        pessoa01.setPessoa01(21);
        pessoa01.setEndereco(endereco01);
        pessoa01.mostrarDados();

        System.out.println("==== Informações pessoais da pessoa 02 ====");
        Endereco endereco02 = new Endereco();
        endereco02.setRua("Av. Nazaré");
        endereco02.setNumero(17);

        Pessoa01 pessoa02 = new Pessoa01();
        pessoa02.setPessoa01("Fulano de Tal");
        pessoa02.setPessoa01(25);
        pessoa02.setEndereco(endereco02);
        pessoa02.mostrarDados();

        //ATIVIDADE 4
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("O cavaleiro preso na armadura", "Robert Fisher");
        Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro3 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry");
        biblioteca.adicionarLivros(livro1);
        biblioteca.adicionarLivros(livro2);
        biblioteca.adicionarLivros(livro3);
        biblioteca.mostrarLivros();
        biblioteca.empestarLivro("O cavaleiro preso na armadura");
        biblioteca.devolverLivro("O cavaleiro preso na armadura");
        biblioteca.mostrarLivros();
        //osb: não consegui desenvolver a quarta questão ;-;
    }
}
