public class Potencia {

    int resultado = Potencia (5,2);

 public int Potencia(int base, int exponente) {
    if (exponente == 1) {
        return base;
    } else {
        return base * Potencia(base, exponente - 1);
    }
}

public void imprimirnumero(){

    System.out.println(resultado);
}


}