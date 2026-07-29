package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    static void main(String[] args) {
        int [][] arryInt = new int [3][];

        arryInt[0] = new int[] {10,20};
        arryInt[1] = new int[] {1,2,3};
        arryInt[2] = new int[] {2,4,6,8,10,12};

        int [][] arryInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6}};

        for(int[]arrBase: arryInt2){
            System.out.println("\n------");
            for(int num: arrBase){
                System.out.print(num + "  ");
            }

        }

    }
}
