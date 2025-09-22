
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        //ATIVIDADE 1
        Carro carro = new Carro();
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
        System.out.println("Depositando R$ 500,00");
        conta_01.deposito(500.0);
        conta_01.getSaldo();
        System.out.println("Sacando R$ 200,00");
        conta_01.sacar(200.0);
        conta_01.getSaldo();
        System.out.println("=========================");

    }
}
