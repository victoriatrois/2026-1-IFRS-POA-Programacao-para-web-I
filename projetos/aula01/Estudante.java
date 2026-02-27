public class Estudante extends Pessoa {
    private long matricula;
    private String curso;
    private int situacao;
    private Cpf cpf;

    public Estudante() {

    }

    public Estudante(String nome, String telefone, String endereco, long matricula, String curso, int situacao, Cpf cpf) {
        super(nome, telefone, endereco);
        this.matricula = matricula;
        this.curso = curso;
        this.situacao = situacao;
        this.cpf = cpf;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public void setCpf(Cpf cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "Estudante{" +
                "matricula=" + matricula +
                ", curso='" + curso + '\'' +
                ", situacao=" + situacao +
                "," + (cpf != null ? cpf.toString() : "CPF inválido") +
                '}';
    }
}
