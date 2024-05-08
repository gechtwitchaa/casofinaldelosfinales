public class SumaDigitosRecursiva {


    public static int sumaDigitos(int numero) {

        if (numero < 10) {
            return numero;
        } else {

            int ultimoDigito = numero % 10;

            return ultimoDigito + sumaDigitos(numero / 10);
        }
    }

    public static void main(String[] args) {
        int numero = 102;
        System.out.println("La suma de los dígitos de " + numero + " es: " + sumaDigitos(numero));
    }
}
