package academy.devdojo.maratonajava.introducao; // video 20

public class Aula05EstruturasCondicionais01 {
    static void main(String[] args) {

        byte age = 15;
        boolean isAuthorizedToBuyDrinks = age >= 18;
        // !

        if (isAuthorizedToBuyDrinks != false ) {
            System.out.println("Autorisado a comprar bebida alcolica ");
        }else{
            System.out.println("Não altorizado a comprar bebida alcolica ");
        }

        if (! isAuthorizedToBuyDrinks ){
            System.out.println("Não autorisado a comprar bebida alcolica ");
        }
        boolean c = false;
        if(c = true){
            System.out.println("Dentro de algo que nunca deve ser feito ");
        }
    }
}
