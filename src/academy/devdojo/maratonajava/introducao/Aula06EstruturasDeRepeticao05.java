package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    // Dado o valor de um carro, descubra em quantas veses ele pode ser parceladp.
    // condição ValorParcela >= 1000
    static void main(String[] args) {

        double isTotalValueOfTheCar = 30000.00;
        for (int isInstallment = (int) isTotalValueOfTheCar; isInstallment >= 1; isInstallment--) {

            double isInstallmentValue = isTotalValueOfTheCar / isInstallment;
            if(isInstallmentValue < 1000){
                continue;
            }
            System.out.println("Parcela " + isInstallment + " de R$ " + isInstallmentValue);

        }
    }
}
