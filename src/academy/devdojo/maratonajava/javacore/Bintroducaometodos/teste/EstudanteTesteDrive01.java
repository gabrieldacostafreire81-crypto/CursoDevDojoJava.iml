package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;


import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTesteDrive01 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante.nome = "Gabriel";
        estudante.idade = 20;
        estudante.sexo = 'M';

        estudante2.nome = "Maria";
        estudante2.idade = 21;
        estudante2.sexo = 'F';

        impressoraEstudante.imprime(estudante);

        impressoraEstudante.imprime(estudante2);
        System.out.println("-------- novamente ----------");
        impressoraEstudante.imprime(estudante);
        impressoraEstudante.imprime(estudante2);
    }
}
