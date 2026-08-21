package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class FuncionarioEx {
   private String nome;
   private int idade;
   private double [] salario;
   private double media;

   public void imprimir(){
       System.out.println("Nome: "+this.nome);
       System.out.println("Idade: "+this.idade);

       if (this.salario == null){
           return;
       }for (double salario : this.salario){
           System.out.println(salario + "  ");
       }
       imprimirMediaSalario();
   }
   public void imprimirMediaSalario(){
       if (this.salario == null){
           return;
       }
       for (double salario : this.salario){
           this.media += salario;
       }
       this.media /= this.salario.length;

       System.out.println("Media: "+this.media);
   }
  // GETTERS E SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }

}
      /*Não e necessario SetMedia pois, a media deve ser calculada apenas na hora da impreção {Regra de negocio} */
