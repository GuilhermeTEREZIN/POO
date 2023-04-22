public class Calculadora {
    public static int somar(int a,int b){
        int result = a+b;
        return result;
    }
    public static int subtrair(int a,int b){

        int result = a-b;
        return result;
    }
    public static int multiplicar(int a,int b){
        int result = a*b;
        return result;
    }
    public static float dividir(int a,int b){
        float result = a/b;
        return result;
    }

    public static int somar(int[] numeros) {
        int resultado = 0;
        for (int i:numeros){
            resultado+=i;
        }
        return resultado;

    }

    public static int subtrair(int[] numeros) {
        int resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado -= numeros[i];
        }
        return resultado;
    }

    public static int[] multiplicar(int[] numeros, int multiplicador) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultado[i] = numeros[i] * multiplicador;
        }
        return resultado;
    }

    public static float dividir(int[] numeros) {
        int somaPar = 0;
        int somaImpar = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) {
                somaPar += numeros[i];
            } else {
                somaImpar += numeros[i];
            }
        }
        float resultado = somaPar / somaImpar;
        return resultado ;
    }
}
