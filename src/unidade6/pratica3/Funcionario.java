package unidade6.pratica3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionario extends Pessoa {

    private String segurancaSocial;
    private double salario;
    private String turno;

    public void salario (double salario){
        if (turno.equalsIgnoreCase("noite")){
            this.salario = salario + 150.0;
        }else {
            this.salario = salario;
        }
    }

    public String getSegurancaSocial() {
        return segurancaSocial;
    }

    public void setSegurancaSocial(String segurancaSocial) {
        this.segurancaSocial = segurancaSocial;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "\n nome='" + getNome() + '\'' +
                "\n apelido='" + getApelido() + '\'' +
                "\n numIdentificacao='" + getNumIdentificacao() + '\'' +
                "\n morada='" + getMorada() + '\'' +
                "\n telefone='" + getTelefone() + '\'' +
                "\n segurancaSocial='" + segurancaSocial + '\'' +
                "\n salario=" + salario +
                "\n turno='" + turno + '\'' +
                '}';
    }
}
