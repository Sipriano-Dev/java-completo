import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("Escolha sua opção: ");
            System.out.println("1. Sanduiche");
            System.out.println("2. Pizza");
            System.out.println("3. Batata frita");
            System.out.println("4. Sair");

            System.out.print("Digite sua opção: ");
            opcao = scan.nextInt();
            
            if (opcao == 1) {
                System.out.println("Você pegou um sanduiche");
            } else if (opcao == 2) {
                System.out.println("Você pegou uma pizza");
            } else if (opcao == 3) {
                System.out.println("Você pegou batatas fritas");
            } else if (opcao == 0){
                System.out.println("Saindo do sistema");
            } else {
                System.out.println("Digite um número valido");
            }

        } while (opcao != 0);


        scan.close();
    }
}
