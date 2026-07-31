package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTesteDrive01 {
    static void main(String[] args) {

        Estudante estudante1 = new Estudante();

        estudante1.nome = "Gabriel";
        estudante1.idade = 20;
        estudante1.sexo = 'M';

        System.out.println("Nome: " +estudante1.nome);
        System.out.println("Idade: " +estudante1.idade);
        System.out.println("Sexo: "+estudante1.sexo);

    }
}
