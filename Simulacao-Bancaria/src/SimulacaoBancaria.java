
import java.util.Scanner;

public class SimulacaoBancaria {

    
    @SuppressWarnings("unused")
    
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in);

        double saldo = 0;
        double saldoAtual = 0;
        boolean continuar = true;

        while (true) {

        int opcao = scanner.nextInt();
          
            switch (opcao) {
                case 1: //Depósito
                    double valorDeposito = scanner.nextDouble();
                    saldo = saldoAtual;
                    saldoAtual += valorDeposito;
                    System.out.println("Saldo Atual " + saldoAtual);

                    break;

                case 2: //Saque

                double valorSaque = scanner.nextDouble();
                if (valorSaque <= saldoAtual) {
                    saldoAtual = saldoAtual - valorSaque;
                    System.out.println("Saldo Atual " + saldoAtual);
                } 
                else {
                    System.out.println("Saldo insuficiente!");
                }
                    break;

                case 3: //Consultar Saldo
                   System.out.println("Saldo atual: " + saldoAtual);

                    break; 
                          
                    case 0:
                    scanner.close();
                    System.out.println("Programa encerrado! ");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente! ");
                }
                catch (java.util.IllegalStateExcpetion e){
                        System.out.println("Programa encerrado! ");
                    }
                }
            }
        }
}