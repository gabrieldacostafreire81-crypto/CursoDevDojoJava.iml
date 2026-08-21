package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.FuncionarioEx;

public class FuncionarioExTesteDrive {
    public static void main(String[] args) {
        FuncionarioEx funcionario = new FuncionarioEx();

        funcionario.setNome("Gabriel");
        funcionario.setIdade(20);
        funcionario.setSalario(new double[] {2500, 1900,1237});
        funcionario.imprimir();

    }
}
