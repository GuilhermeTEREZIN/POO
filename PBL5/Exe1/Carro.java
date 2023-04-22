public class Carro extends Veiculo {

    public Carro(String modelo,String fabricante,int ano){
        super(modelo, fabricante, ano);
    }
    @Override
    public void acelerar() {
        System.out.println("O carro "+getModelo()+" está acelerando.");
    }
}