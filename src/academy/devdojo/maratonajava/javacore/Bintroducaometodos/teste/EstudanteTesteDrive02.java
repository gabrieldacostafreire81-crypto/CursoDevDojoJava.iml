package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTesteDrive02 {
    static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Pedro";
        estudante.idade = 12;
        estudante.sexo = 'M';
        estudante.imprime();

        estudante2.nome = "Joao";
        estudante2.idade = 13;
        estudante2.sexo = 'M';
        estudante2.imprime();


    }

}
