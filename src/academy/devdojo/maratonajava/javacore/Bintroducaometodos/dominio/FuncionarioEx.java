package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class FuncionarioEx {
    public String nome;
    public int idade;
    public double salario1, salario2, salario3;

    public void imprimeDados (){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salario mes 1: " + this.salario1);
        System.out.println("Salario mes 2: " + this.salario2);
        System.out.println("Salario mes 3: " + this.salario3);
    }
    public void mediaSalario(){
        double mediaSalario = 0;
        double somaSalario = 0;
        somaSalario = this.salario1 + this.salario2 + this.salario3;
        mediaSalario = somaSalario / 3;

        System.out.println("Media salarial de: " + mediaSalario);


        /*  Siatema SImples de calcular media salarial [Sem observar ecessoes] */
    }
}