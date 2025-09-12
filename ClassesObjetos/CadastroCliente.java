public class CadastroCliente {
    public static void main(String[] args) {
        // Criando objetos do tipo Cliente
        Cliente c1 = new Cliente();
        c1.nome = "Francis Chileno";
        c1.idade = 32;
        c1.cpf = "123.456.789-00";
        c1.salario = 3000.00;
        c1.ativo = true;

        Cliente c2 = new Cliente();
        c2.nome = "Francis Coppola";
        c2.idade = 35;
        c2.cpf = "987.654.321-00";
        c2.salario = 6000.00;
        c2.ativo = false;

        // Exibindo os clientes
        exibirCliente(c1);
        exibirCliente(c2);
    }

    // Método para exibir um cliente
    public static void exibirCliente(Cliente c) {
        System.out.println("===== Cadastro de Cliente =====");
        System.out.println("Nome: " + c.nome);
        System.out.println("Idade: " + c.idade + " anos");
        System.out.println("CPF: " + c.cpf);
        System.out.println("Salário: R$ " + c.salario);
        System.out.println("Cliente ativo? " + c.ativo);
        System.out.println();
    }
}
