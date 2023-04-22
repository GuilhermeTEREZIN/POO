public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade){
        this.nome=nome;
        this.idade = idade;
    }
    public void fazerBarulho() {
        System.out.println("O animal "+getNome()+" está fazendo barulho.");
    }

    public String getNome() {
        return nome;
    }
}



