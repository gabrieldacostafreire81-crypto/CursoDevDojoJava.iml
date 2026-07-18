package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06Exercicio {
    static void main(String[] args) {
        // Dado os valores de 1 a 7, imprima se e dia útil ou final de semana.(switch)
        // Considerando 1 como domingo.

        byte day = 1;

        switch (day) {
            case 1:
                System.out.println("domingo, Final de semana. ");
                break;
            case 2:
                System.out.println("Segunda, Dia útil. ");
                break;
            case 3:
                System.out.println("Terça, Dia útil. ");
                break;
            case 4:
                System.out.println("Quarta, Dia útil. ");
                break;
            case 5:
                System.out.println("Quinta, Dia útil. ");
                break;
            case 6:
                System.out.println("Sexta, Dia útil. ");
                break;
            case 7:
                System.out.println("Sabado, Final de semana. ");
                break;

                default:
                    System.out.println("Invalido");
        }
    }
}
