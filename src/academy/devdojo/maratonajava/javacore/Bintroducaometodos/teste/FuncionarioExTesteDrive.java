package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.FuncionarioEx;

public class FuncionarioExTesteDrive {
    public static void main(String[] args) {
        FuncionarioEx funcionario = new FuncionarioEx();

        funcionario.nome = "Maria";
        funcionario.idade = 25;
        funcionario.salario1 = 5625.00;
        funcionario.salario2 = 2570.00;
        funcionario.salario3 = 3250.00;

        funcionario.imprimeDados();
        funcionario.mediaSalario();
    }
}
