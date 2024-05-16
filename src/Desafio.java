import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        // Scanner para receber entradas do usuário
        Scanner leitura = new Scanner(System.in);

        // Mensagem inicial mostrando os dados do cliente
        String mensagem = """
                ---------------------------------------
                Dados iniciais do cliente:
                
                Nome:           Kevem Galdino
                Tipo conta:     Corrente
                Saldo inicial:  R$ 2500,00
                ---------------------------------------
                """;
        System.out.println(mensagem);

        // Menu de opções para o cliente realizar as operações
        String menuOpcoes = """
                
                
                Operações
                
                1- Consultar saldo
                2- Depositar valor
                3- Sacar valor
                4- Encerrar o sistema
                
                """;


        double saldo = 2500.00;


        while (true) {
            System.out.println(menuOpcoes);
            System.out.println("Digite a opção desejada:");
            int opcaoDesejada = leitura.nextInt();

            if (opcaoDesejada == 1) {
                System.out.println("Seu saldo atual é de " + saldo);
            } else if (opcaoDesejada == 2) {
                System.out.println("Digite o valor a receber: ");
                double valorRecebido = leitura.nextDouble();
                saldo += valorRecebido;
                System.out.println("Saldo atualizado: " + saldo);
            } else if (opcaoDesejada == 3) {
                System.out.println("Digite o valor a retirar: ");
                double valorRetirado = leitura.nextDouble();
                if (valorRetirado > saldo) {
                    System.out.println("Não há saldo suficiente para retirar esse valor");
                    System.out.println("Saldo atual: " + saldo);
                } else {
                    saldo -= valorRetirado;
                    System.out.println("Saldo atualizado: " + saldo);
                }
            } else if (opcaoDesejada == 4) {
                System.out.println("Encerrando o sistema...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
