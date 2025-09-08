public class CadastroCliente {
    public static void main(String[] args) {
        // Variáveis para armazenar os dados de um cliente
        String nome = "Francis Chileno";
        int idade = 32;
        String cpf = "123.456.789-00";
        double salario = 3000.00;
        boolean ativo = true;

        // Exibindo os dados
        System.out.println("===== Cadastro de Cliente =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("CPF: " + cpf);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Cliente ativo? " + ativo);

        nome = "Francis Coppola";
        idade = 35;
        cpf = "123.456.789-00";
        salario = 6000.00;
        ativo = false;
        System.out.println("===== Cadastro de Cliente =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("CPF: " + cpf);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Cliente ativo? " + ativo);
    }
}
