public class Main {
    public static void main(String[] args) {
        int[] listaNumeros = {5,1,4,2};
        System.out.println("Soma: "+Calculadora.somar(25,92));
        System.out.println("Soma lista: "+Calculadora.somar(listaNumeros));
        System.out.println("Subtração: "+Calculadora.subtrair(17,54));
        System.out.println("Subtração lista: "+Calculadora.subtrair(listaNumeros));
        System.out.println("Multiplicação: "+Calculadora.multiplicar(9,8));
        System.out.print("Multiplicação lista: ");

        for(int numero:Calculadora.multiplicar(listaNumeros,3)){
            System.out.print(numero+" ");
        }
        System.out.println("\nDivisão: "+Calculadora.dividir(1000,225));
        System.out.println("Divisão lista: "+Calculadora.dividir(listaNumeros));


    }
}