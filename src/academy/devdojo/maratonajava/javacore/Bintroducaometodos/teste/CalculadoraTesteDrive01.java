package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTesteDrive01 {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        System.out.println("Calculo soma concluido");

        calc.subtracaoDoisNumeros();
        System.out.println("Calculo subtração com sucesso");

    }
}
