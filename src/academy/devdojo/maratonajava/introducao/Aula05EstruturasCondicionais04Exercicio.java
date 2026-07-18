package academy.devdojo.maratonajava.introducao; // Dado um determinado salario ANUAL quero saber o valor que terei que pagar video 23

// salario entre 0 e 34.712 taxa = 9,70%  //  salario entre 34.713 e 68.507 taxa = 37,35% // salario 68.508 + taxa = 49,50%

public class Aula05EstruturasCondicionais04Exercicio {
    public static void main(String[] args) {

        float isMonthlySalary = 6000.00F;
        float isAnnualSalary = isMonthlySalary * 12;

        float taxRate;
        float taxValue;

        System.out.println("Seu salário anual é de: R$ " + isAnnualSalary);

        if (isAnnualSalary <= 34712.00F) {

            taxRate = 9.70F;

        } else if ( isAnnualSalary >=34713  && isAnnualSalary <= 68507.00F) {

            taxRate = 37.35F;

        } else {

            taxRate = 49.50F;
        }

        taxValue = isAnnualSalary * (taxRate / 100);

        System.out.println("Taxa aplicada: " + taxRate + "%");
        System.out.println("Valor da taxa a ser paga: R$ " + taxValue );

    }
}
