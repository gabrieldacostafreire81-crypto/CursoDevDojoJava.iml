package academy.devdojo.maratonajava.introducao; // video 27

public class Aula06EstruturasDeRepeticao01 {
    static void main(String[] args) {
        // while, do while , for

        int count = 0;
        while (count < 10) {
            System.out.println(++count);


        }
        count++;
        do {
            System.out.println ( "Dentro do while. " + ++count);
        } while (count < 10);


        for(int i=0; i <10; i++) {
            System.out.println("for " +i);


        }

    }
}
