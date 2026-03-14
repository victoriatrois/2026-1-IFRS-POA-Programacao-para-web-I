package aula02;

import java.util.ArrayList;

public class Funcionario extends Pessoa {
    private double salario;
    private String cargo;
    private ArrayList<Telefone> telefones;

    public Funcionario() { }

    public Funcionario(String nome, int idade, double salario, String cargo, ArrayList<Telefone> telefones) {
        super(nome, idade);
        this.salario = salario;
        this.cargo = cargo;
        this.telefones = telefones;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(ArrayList<Telefone> telefones) {
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        String auxiliar = "";

        if (telefones != null) {
            for (Telefone telefone : telefones) {
                if (telefone != null) {
                    auxiliar += telefone.toString() + "\n";
                }
            }
        }

        return super.toString() + '\n' +
                "Funcionario {" +
                "salario=" + salario +
                ", cargo='" + cargo + '\'' +
                ", telefones='" + auxiliar + '\'' +
                '}';
    }
}
