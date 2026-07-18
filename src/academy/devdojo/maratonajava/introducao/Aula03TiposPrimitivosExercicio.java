package academy.devdojo.maratonajava.introducao;

/*
Pratica

Crie variaveis para os campos descritos abaixo  entre <> e imprima a seguinte mensagem:

Eu <NOME>, morando no endereço <ENDEREÇO>,
confirmo que recebi o salario de <SALARIO>, na data <DATA>.
*/
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args){

        String name = "Gabriel";
        String address = "Q45 L15";
        float wage = 1400.00F;
        String dateWage = "08/05/2026" ;

        String salaryReport = "Eu " +name+ ", morando no endereço " +address+ " confirmo que recebi o salario de " +wage+ ", na data" +dateWage ;

        System.out.println(salaryReport);
    }
}
