package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    // imprima os primeiros 25 numeros de um dado valor. ex 50
    static void main(String[] args) {

        byte isMaximumValue = 50;

        for (int i = 1; i <= isMaximumValue; i++) {
            if(i > 25){
                break;

            }
            System.out.println(i);
        }

    }
}
