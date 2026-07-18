package academy.devdojo.maratonajava.introducao;
// Operador ternario
public class Aula05EstruturasCondicionais03 {
    static void main(String[] args) {

        // Doar se salario > 5000

        double wage = 6000;
        // String donationMessage = "Eu vou doar 500 para o DevDojo ";
        // String messageNotDonation = "Eu ainda não tenho condiçoes, mas vou ter! ";

        // (Condição) ? verdadeiro : falso;

        // String messageResult = wage > 5000 ? donationMessage : messageNotDonation;
         String messageResult = wage > 5000 ? "Eu vou doar 500 para o DevDojo " : "Eu ainda não tenho condiçoes, mas vou ter! ";

        System.out.println(messageResult);
    }
}


