public class Funcionario {

    private String nome;
    private String cpf;
    private String filial;

    public Funcionario(String nome, String cpf, String filial)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.filial = filial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    
}
