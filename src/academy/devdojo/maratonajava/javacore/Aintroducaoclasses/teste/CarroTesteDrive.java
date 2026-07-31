package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTesteDrive {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.nome = "Bugate shiron";
        carro1.modelo = "Bugati GT";
        carro1.anoDeFabricacao = 2021;


        System.out.println("Nome do carro01: "+ carro1.nome+ " /Modelo do carro: " +carro1.modelo+ " /Ano de fabricação: " +carro1.anoDeFabricacao );

        System.out.println("----------------------------------------------------------------------------------------------");

        Carro carro2 = new Carro();

        carro2.nome = "Fiat mob";
        carro2.modelo = "Fiat Italy";
        carro2.anoDeFabricacao = 2015;



        System.out.println("Nome do carro2: "+ carro2.nome+ " /Modelo do carro: " +carro2.modelo+ " /Ano de fabricação " +carro2.anoDeFabricacao);

        // carro1 = carro2; variaveis de referencia
    }
}
