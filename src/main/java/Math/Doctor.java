package Math;
public class Doctor {
    
    protected int sumar ;
    protected int restar;
    protected int multiplicar;
    protected int dividir;
    
    public int sumar(int sumando1, int sumando2){
        return sumando1 + sumando2;
    }
    public static float sumar(float sumando1, float sumando2){
        return sumando1 + sumando2;
    }
    
    public int restar(int restando1, int restando2){
        return restando1 - restando2;
    }
    
    public int multiplicar(int multiplicar1, int multiplicar2) {
        int resultado = 0;
        int veces = Math.abs(multiplicar2);

        for (int i = 0; i < veces; i++) {
            resultado += multiplicar1;
        }
        if (multiplicar2 < 0) {
            resultado = -resultado;
        }
        return resultado;
    }
    
    public int dividir(int dividir1, int dividir2) {
        int contador = 0;
        while (dividir1 >= dividir2) {
            dividir1 -= dividir2;
            contador++;
        }
        return contador;
    }
}