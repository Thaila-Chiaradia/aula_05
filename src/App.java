public class App {
    public static void main(String[] args) throws Exception 
    {

        Funcionario funcionario1 = new Funcionario( "Thaila", "601.275.560-01", "São Leopoldo");

        System.out.println("O funcionario " + funcionario1.getNome() + " com CPF " + funcionario1.getCpf() + " é da Filial de " + funcionario1.getFilial());

        Programador programador1 = new Programador("fulano", "256.234.234-04", "São Paulo", 10000, "java");

        System.out.println("\n\nO programador " + programador1.getNome() + " com CPF " + programador1.getCpf() + " é da Filial de " + programador1.getFilial() + " utiliza a linguagem " + programador1.getlinguagem() + " e ganha R$"+ programador1.getSalario());
    }
}
