public class Moto extends Veiculo {
    public Moto(String modelo,String fabricante,int ano){
        super(modelo, fabricante, ano);
    }
    @Override
    public void acelerar() {
        System.out.println("A moto "+getModelo()+" está acelerando.RADANDAN");
    }
}