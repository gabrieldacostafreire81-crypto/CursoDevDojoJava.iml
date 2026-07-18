package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoriq juvenil
        // idade >= 18 categoria adulto

        byte age = 17;
        String  category ;

        if (age < 15){
            category = "Categoria INFANTIL ";

        } else if (age >= 15 && age < 18 ) {
            category = "Categoria JUVENIL ";

        } else {
            category = "Categoria ADULTO";
        }
        System.out.println(category);
    }
}
