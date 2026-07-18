package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    static void main(String[] args) {
        // imprima todos os numeros pares de 0 até 1000

        int count = 0;
        while (count <= 1000) {
            count++ ;

            if(count % 2 == 0){
                System.out.println("numero " + count);
            }

        }
    }
}
