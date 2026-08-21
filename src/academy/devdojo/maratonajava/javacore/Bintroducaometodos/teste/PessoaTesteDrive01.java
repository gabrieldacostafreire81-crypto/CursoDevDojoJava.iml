package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTesteDrive01 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Maria");
        pessoa.setIdade(20);

        pessoa.imprime();

       // System.out.println(pessoa.getNome());
       // System.out.println(pessoa.getIdade());
    }
}
