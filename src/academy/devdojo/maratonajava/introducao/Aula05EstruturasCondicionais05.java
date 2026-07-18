package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    static void main(String[] args) {
       // imprima o dia da semana, considerando 1 como domingo.

        byte day = 7;

        switch (day){
            case 1:
            System.out.println(" Domingo ");
            break;
            case 2:
                System.out.println(" Segunda-Feira ");
                break;
            case 3:
                System.out.println(" Terça-Feira ");
                break;
            case 4:
                System.out.println(" Quarta-Feira ");
                break;
            case 5:
                System.out.println(" Quinta-Feira ");
                break;
            case 6:
                System.out.println(" Sexta-Feira ");
                break;
            case 7:
                System.out.println(" Sabado ");
                break;
                default:
                    System.out.println("Opção Invalida");
        }

        char sex = 'M';

        switch(sex){

            case 'M':
                System.out.println("Masculino");
                break;

            case 'F':
                System.out.println("Feminino");
                break;

                default:
                    System.out.println("Invalido");
        }


    }

}

