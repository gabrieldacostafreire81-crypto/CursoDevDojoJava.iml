package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas veses ele pode ser parceladp.
    // condição ValorParcela >= 1000
    static void main(String[] args) {

        double isTotalValueOfTheCar = 80000.00;
        for (int isInstallment = 1; isInstallment <= isTotalValueOfTheCar; isInstallment++) {

            double isInstallmentValue = isTotalValueOfTheCar / isInstallment;
            if(isInstallmentValue < 1000){
                break;
            }
                System.out.println(" Quantidades de Parcelas:" + isInstallment + " de R$ " + isInstallmentValue);
        }
    }
}
