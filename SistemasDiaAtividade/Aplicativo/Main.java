package SistemasDiaAtividade.Aplicativo;
import java.util.Scanner;
import java.util.Random;

 class CompraOnline {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Variáveis
        String nome, cpf, endereco, formaPagamento;
        double valorCompra, frete, valorFinal;
        int aprovacao;


        System.out.print("Digite o nome do cliente: ");
        nome = sc.nextLine();

        System.out.print("Digite o CPF: ");
        cpf = sc.nextLine();

        System.out.print("Digite o endereço: ");
        endereco = sc.nextLine();

        System.out.print("Digite o valor da compra: R$ ");
        valorCompra = sc.nextDouble();

        sc.nextLine();

        System.out.print("Forma de pagamento: ");
        formaPagamento = sc.nextLine();

        if (valorCompra > 500) {
            frete = 0;
            System.out.println("Frete grátis!");
        } else {
            frete = 25;
            System.out.println("Frete de R$ 25,00 adicionado.");
        }
        }
    }