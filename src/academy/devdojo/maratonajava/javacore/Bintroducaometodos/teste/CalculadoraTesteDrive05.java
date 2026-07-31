package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTesteDrive05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int [] numeros={1,2,3,4,5};
        calculadora.somaArrys(numeros);

        //calculadora.somaArrys(1,2,3,4,5,6,7);
    }
}
