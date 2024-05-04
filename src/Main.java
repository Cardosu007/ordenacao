public class Main {
    public static void main(String[] args) {

        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();


        ordenacaoPessoas.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Nome 2", 30, 1.26);
        ordenacaoPessoas.adicionarPessoa("Nome 3", 40, 1.46);
        ordenacaoPessoas.adicionarPessoa("Nome 4", 50, 1.76);
        ordenacaoPessoas.adicionarPessoa("Nome 5", 60, 1.86);
        ordenacaoPessoas.adicionarPessoa("Nome 6", 70, 1.96);
        ordenacaoPessoas.adicionarPessoa("Nome 7", 80, 1.16);


        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}