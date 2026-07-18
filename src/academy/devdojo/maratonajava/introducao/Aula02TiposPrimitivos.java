package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        // int, double, float, char, byte, short, long e boolean;

        int age = 20;
        long largeNumber = 10000L;  // numero grande
        double wage = 1650;
        float wage2 = 2000F;                                     // O casting é uma transformação aplicada em valores numéricos para modificar seu tipo de dado.
        byte age2 = 127;
        short age3 = 30;
        boolean verdadeiro = true;
        boolean falso = false;
        char character = 'M';


        String name = ("Gabriel");

        System.out.println("A sua idade é: " + age + " anos");
        System.out.println(verdadeiro);
        System.out.println("char" +character);
        System.out.println(largeNumber);

        System.out.println("Oi meu nome e: " +name);


    }
}
