package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    static void main(String[] args) {
        // +  - / *  operadores basicos

        int number1 = 10;
        int number2 = 20;
        int result = number2 / number1;

        System.out.println(result);

        // %
        int rest = 20 % 2 ;
        System.out.println(rest);

        // operadores logicos <> <= >= == !=

        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 < 20;

        boolean isTenEqualsTwenty = 10 == 20;
        boolean isTenEqualsTen = 10 == 10;

        boolean isTenDifferentFromTen = 10 != 10;
        boolean isTwentyDifferentFromTen = 20 != 10;

        System.out.println("isTenGreaterThanTwenty: " +isTenGreaterThanTwenty); // MAIOR
        System.out.println("isTenLessThanTwenty: " +isTenLessThanTwenty); // MENOR

        System.out.println("isTenEqualsTwenty: " + isTenEqualsTwenty); // IQUAL
        System.out.println("isTenEqualsTen: " + isTenEqualsTen); // IQUAL

        System.out.println("isTenDifferentFromTen: " +isTenDifferentFromTen); // DIFERENTE
        System.out.println("isTwentyDifferentFromTen: " +isTwentyDifferentFromTen); // DIFERENTE

        // operadores logicos02  && (AND) // (or) !

        byte age = 29;
        float wage = 3500F ;
        boolean isWithinTheGraterThanThirty = age >= 30 && wage >= 4612;
        boolean isWithinTheLawLessThanThirty = age < 30 && wage >= 3381; // todas as condiçoes verdadeiras

        System.out.println("isWithinTheGraterThanThirty: " +isWithinTheGraterThanThirty);
        System.out.println("isWithinTheLawLessThanThirty: " +isWithinTheLawLessThanThirty);

        double TotalCurrentAccountBalance = 200; // Conta corrente
        double TotalValueOfSavingsAccount = 10000; // Conta poupança
        float PlayStationValue = 5000F;

        boolean isPlaystationFiveBuyable = TotalCurrentAccountBalance > PlayStationValue || TotalValueOfSavingsAccount > PlayStationValue;
        System.out.println("isPlaystationFiveBuyable: " +isPlaystationFiveBuyable);

        // operadores de atribuição  =  += -= *= /= %=

        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println(bonus);

        //++ --

        int counter = 0;
        counter += 1; // contador = contador +1
        counter++;
        --counter;
        ++counter;

        int counter2 = 0;
        System.out.println(++counter2);

    }
}
