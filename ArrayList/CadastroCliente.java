import java.util.ArrayList;
import java.util.Scanner;

public class CadastroCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();

        int opcao;
        do {
            System.out.println("===== MENU =====");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    Cliente c = new Cliente();
                    System.out.print("Nome: ");
                    c.nome = sc.nextLine();
                    System.out.print("Idade: ");
                    c.idade = sc.nextInt();
                    sc.nextLine(); // consumir quebra de linha
                    System.out.print("CPF: ");
                    c.cpf = sc.nextLine();
                    System.out.print("Salário: ");
                    c.salario = sc.nextDouble();
                    System.out.print("Ativo (true/false): ");
                    c.ativo = sc.nextBoolean();
                    clientes.add(c);
                    System.out.println("✅ Cliente cadastrado com sucesso!\n");
                    break;

                case 2:
                    System.out.println("===== Lista de Clientes =====");
                    if (clientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado.\n");
                    } else {
                        for (int i = 0; i < clientes.size(); i++) {
                            Cliente cli = clientes.get(i);
                            System.out.println("Cliente " + (i + 1));
                            System.out.println("Nome: " + cli.nome);
                            System.out.println("Idade: " + cli.idade + " anos");
                            System.out.println("CPF: " + cli.cpf);
                            System.out.println("Salário: R$ " + cli.salario);
                            System.out.println("Ativo? " + cli.ativo);
                            System.out.println("-------------------------");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("❌ Opção inválida!\n");
            }
        } while (opcao != 0);

        sc.close();
    }
}
