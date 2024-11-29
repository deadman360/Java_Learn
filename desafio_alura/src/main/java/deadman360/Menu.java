package deadman360;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Cliente clienteCarlos = new Cliente("Carlos", "Corrente", 2543.78);
        int opt = 0;
        Scanner opcao = new Scanner(System.in);
        while (opt != 4) {
            System.out.println("""
                **********************
                    Cliente: %s
                    Tipo de Conta: %s
                    Salario: %.2f
                **********************

                ****
                Menu
                ****
                1 - Exibir Salario
                2 - Transferir
                3 - Depositar
                4 - Sair
                """.formatted(clienteCarlos.getNome(), clienteCarlos.getConta(), clienteCarlos.getSalario()));
                
            opt = opcao.nextInt();
            opcao.reset();
            switch (opt) {
                case 1:
                    exibeSalario(clienteCarlos);
                    break;
                case 2:
                    transfereSalario(clienteCarlos);
                    break;
                case 3:
                    depositar(clienteCarlos);
                    break;
                case 4:
                    System.out.println("Saindo..");
                    break;
            }
        }
    }
    public static void exibeSalario(Cliente client){
        System.out.println("Saldo em conta: %.2f".formatted(client.getSalario()));
    }
    public static void transfereSalario(Cliente client){
        Scanner s = new Scanner(System.in);
        System.out.println("Quanto gostaria de transferir ?");
        double transfer = s.nextFloat();
        if (transfer > client.getSalario()){
            System.out.println("Saldo insuficiente!");
        }else{
            client.setSalario(client.getSalario() - transfer);
            System.out.println("Novo saldo: %.2f".formatted(client.getSalario()));
        }
    }
    public static void depositar(Cliente client){
        Scanner s = new Scanner(System.in);
        System.out.println("Quanto gostaria de depositar: ");
        double deposito = s.nextFloat();
        client.setSalario(client.getSalario() + deposito);
        System.out.println("Novo saldo: %.2f".formatted(client.getSalario()));
    }
}