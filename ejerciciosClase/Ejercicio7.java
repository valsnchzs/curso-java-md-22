public class Ejercicio7{
    public static void main(String[] args) {
        //para que un año sea bisiesto debe cumplic con los iguiente
        //divisible entre 4
        //no es divisible por 100, excepto que sea divisible por 100
        int bisiesto = 1900;
        if ((bisiesto%4 == 0 && bisiesto % 100 !=0) || (bisiesto%400 ==0)){
            System.out.println("El años "+ bisiesto + " si es bisiesto");
        } else {
            System.out.println("El año "+ bisiesto+ " no es bisiesto");
        }

    }
}