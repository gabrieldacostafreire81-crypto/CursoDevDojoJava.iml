package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtracaoDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicacaoDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double divisaoDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divisaoDoisNumeros02(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
            return 0;
    }

    public void imprimeDivisaoDoisNumeros(double num1, double num2) {
       if (num2 == 0) {
           System.out.println("Não existe divisão por 0 ");
           return;
       }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int numero1, int numero2) {

        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("numero1: " + numero1);
        System.out.println("numero2: " + numero2);
    }

    public void somaArrys (int [] numeros ) {
        int soma = 0;
        for (int temp : numeros) {
            soma += temp;
        }
        System.out.println("Soma: " + soma);
    }

    public void somaVarArgs (int... numeros){
        int soma = 0;
        for (int temp : numeros) {
            soma += temp;
        }
        System.out.println("Soma: " + soma);
    }
    
}