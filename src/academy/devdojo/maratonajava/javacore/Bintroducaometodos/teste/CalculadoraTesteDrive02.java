package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTesteDrive02 {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        calc.multiplicacaoDoisNumeros(2,25f);
        System.out.println("finalizado multiplicação");
    }
}
