public class Programador extends Funcionario {
    
    private float salario;
    private Linguagem linguagem_1;
    private Linguagem linguagem_2;
    private Linguagem linguagem_3;
    private int i;
    
    public Programador(String nome, String cpf, String filial)
    {
        super(nome, cpf, filial);
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Linguagem getLinguagem_1() {
        return linguagem_1;
    }

    public void setLinguagem_1(Linguagem linguagem_1) {
        this.linguagem_1 = linguagem_1;
    }

    public Linguagem getLinguagem_2() {
        return linguagem_2;
    }

    public void setLinguagem_2(Linguagem linguagem_2) {
        this.linguagem_2 = linguagem_2;
    }

    public Linguagem getLinguagem_3() {
        return linguagem_3;
    }

    public void setLinguagem_3(Linguagem linguagem_3) {
        this.linguagem_3 = linguagem_3;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void exibeRanking()
    {
        System.out.println("1° - " + linguagem_1.getNome());
        System.out.println("2° - " + linguagem_2.getNome());
        System.out.println("3° - " + linguagem_3.getNome());
    }
    
    
}
