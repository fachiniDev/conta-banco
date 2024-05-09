import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner dadosCliente = new Scanner(System.in);
        

        int agencia;
        int conta;
        int saldo = 25;

        System.out.println("dica: agencia = 1021 e conta = 2001");

        System.out.println("Digite o numero de conta desejada: ");
        conta = dadosCliente.nextInt();

        System.out.println("Digite o numero de agencia desejada: ");
        agencia = dadosCliente.nextInt();

        if (agencia == 1021 && conta == 2001){
            System.out.println("olá Maria, obrigado por criar uma conta em nosso banco! sua agencia é nº " + agencia + " sua conta é nº " + conta + " e você tem disponivel para saque R$ " + saldo );
            
         
        }else{
            System.out.println("cliente não encontrado! Tente novamente mais tarde.");
        }

        



        
        

        

        



    }
}
