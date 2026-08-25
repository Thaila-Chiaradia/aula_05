public class App {
    public static void main(String[] args) throws Exception 
    {

        Funcionario funcionario1 = new Funcionario( "Thaila", "601.275.560-01", "São Leopoldo");

        System.out.println("O funcionario " + funcionario1.getNome() + " com CPF " + funcionario1.getCpf() + " é da Filial de " + funcionario1.getFilial());

        Programador programador1 = new Programador("Fulano", "504.403.432.222-00", "São Paulo");
        Linguagem preferencia1 = new Linguagem("python", 2);
        programador1.setLinguagem_1(preferencia1);
        Linguagem preferencia2 = new Linguagem("javascript", 1);
        programador1.setLinguagem_2(preferencia2);
        Linguagem preferencia3 = new Linguagem("C", 1);
        programador1.setLinguagem_3(preferencia3);



    }
}
