public class Ejercicio5{

    public static void main(String[] args){
        //Estructura de numeros 1,2,3,4,5,6
        int num = 123456;
        int suma = 0;

        while (num>0){
            suma += num % 10;
            num /= 10;
        }
        System.out.println("La suma d elos digitos de 1,2,3,4,5,6 equivale a:"+ suma);

    }
}