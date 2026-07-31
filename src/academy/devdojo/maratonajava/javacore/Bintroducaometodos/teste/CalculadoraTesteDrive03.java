package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTesteDrive03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.divisaoDoisNumeros(20, 0);
        System.out.println(resultado);

        System.out.println(calculadora.divisaoDoisNumeros02(50,0));

        System.out.println("*********************");

       calculadora.imprimeDivisaoDoisNumeros(86,2);
    }

}
