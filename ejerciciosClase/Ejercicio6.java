import java.util.*;

public class Ejercicio6{

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa el numero de terminos fibonacci");
        int numero = scan.nextInt();

        if (numero<=0){
            System.out.println("Por favor, ingresa un numero positivo");
        } else if (numero==1){
            System.out.println("Serie de Fibonacci es 0");
        } else{
            int primer=0;
            int segundo=1;
            System.out.println("Serie de fibonacci: "+ primer+"" + segundo);

            for (int i=2; i<numero; i++){
                int siguiente = primer+segundo;
                System.out.println(""+ siguiente);
                primer= segundo;
                segundo=siguiente;
            }
        }
    }
}
