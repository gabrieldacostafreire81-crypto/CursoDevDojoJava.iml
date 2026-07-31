package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;


public class EatudanteTesteDrive02 {
    static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.nome = "sandj";
        System.out.println("Nome: "+estudante.nome);
        System.out.println("Idade: "+estudante.idade);
        System.out.println("Sexo: "+estudante.sexo);

        System.out.println("---------");

        Estudante estudante2 = new Estudante();
        System.out.println("Nome: "+estudante2.nome);
        System.out.println("Idade: "+estudante2.idade);
        System.out.println("Sexo: "+estudante2.sexo);

        // Não indicado inicializar antes tomar cuidado com o objeto a ser referenciado


    }
}
