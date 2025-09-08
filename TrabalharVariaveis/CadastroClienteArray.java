
public class CadastroClienteArray {
    public static void main(String[] args) {
        // Arrays para armazenar vários clientes
        String[] nomes = {"Francis Chileno", "Francis Coppola", "João da Silva"};
        int[] idades = {32, 35, 40};
        String[] cpfs = {"123.456.789-00", "987.654.321-00", "111.222.333-44"};
        double[] salarios = {3000.00, 6000.00, 4500.50};
        boolean[] ativos = {true, false, true};

        // Mostrar todos os clientes
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("===== Cadastro de Cliente " + (i+1) + " =====");
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Idade: " + idades[i] + " anos");
            System.out.println("CPF: " + cpfs[i]);
            System.out.println("Salário: R$ " + salarios[i]);
            System.out.println("Cliente ativo? " + ativos[i]);
            System.out.println();
        }
    }
}
