public class Veiculo {
    private String modelo;
    private String fabricante;
    private int ano;

    public Veiculo(String modelo,String fabricante,int ano){
        this.ano = ano;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void acelerar() {
        System.out.println("O veículo está acelerando.");
    }
}
