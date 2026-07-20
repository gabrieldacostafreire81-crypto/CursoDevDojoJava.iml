package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    static void main(String[] args) {

        String [] nomes = new String[4];
        
        nomes[0] = "Gabriel";
        nomes[1] = "Maria";
        nomes[2] = "Joaquim";
        nomes[3] = "Raiane";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println( "Nomes: "+ nomes[i]);
        }

    }
}
