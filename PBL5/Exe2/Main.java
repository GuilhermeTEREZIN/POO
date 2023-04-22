import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cachorro animal1 = new Cachorro("Bob",5);
        Gato animal2 = new Gato("Frajola",2);

        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(animal2);
        animais.add(animal1);

        for(Animal a:animais){
            if (a instanceof Cachorro){
                ((Cachorro)a).fazerBarulho();
            }else {
                ((Gato)a).fazerBarulho();
            }
        }
    }
}
