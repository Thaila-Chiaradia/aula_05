public class Programador extends Funcionario {
    
    private float salario;
    private String linguagem;

    public Programador(String nome, String cpf, String filial, float salario, String linguagem)
    {
        super(nome, cpf, filial);
        this.salario = salario;
        this.linguagem = linguagem;

    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getlinguagem() {
        return linguagem;
    }

    public void setlinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    
}
