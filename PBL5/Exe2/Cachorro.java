public class Cachorro extends Animal {

    public Cachorro(String nome, int idade){
        super(nome, idade);
    }
    @Override
    public void fazerBarulho() {
        System.out.println("O cachorro "+getNome()+" está latindo");
    }
}
