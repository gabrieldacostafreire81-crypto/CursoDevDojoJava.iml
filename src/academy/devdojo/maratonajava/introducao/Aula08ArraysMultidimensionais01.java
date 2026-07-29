package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    static void main(String[] args) {

        int [][] dias = new int [3][3];
        dias[0][0] = 1;  // i = 0   j = 0
        dias[0][1] = 2;  // i = 0    j = 1
        dias[0][2] = 3;  // i = 0    j = 2
        
        dias[1][0] = 4; // i = 1 j = 0
        dias[1][1] = 5; // 1 = 1 j = 1
        dias[1][2] = 6; // i = 1 j = 2
        
        dias[2][0] = 7; // i = 2  j = 0
        dias[2][1] = 8; // i = 2  j = 1
        dias[2][2] = 9; // i = 2  j = 2

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.print(dias[i][j] + " ");

                // i = posição do array (represente QUAL esta sendo percorrido)
                // j = valor armazenado no array (Percorre o arryas)
            }
            
        }
        System.out.println("----------------------");

        for(int[] arryBase: dias ) {
            for (int num: arryBase) {
                System.out.println(num);
            }
        }

    }

}
