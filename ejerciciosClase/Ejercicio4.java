public class Ejercicio4{

    //Encontrar el mín de 3 numeros
    //Declarar esos 3 números y hacer comparaciones entre ellos
    public static void main(String[] args) {
       int num1 = 10;
       int num2 = 20;
       int num3 = 5;

       //FOrma num1 - Usando Math.min
       int minimo = Math.min(num1, Math.min(num2, num3));
       System.out.println ("El minimo de estos 3 valores es: " + minimo);

       //Forma 2 - Usando Lógica
       int minimoLogica;

       if (num1<= num2 && num1<=num3){
            minimoLogica =num1;
       } else if (num2<=num1 && num2<=num3){
        minimoLogica = num2;
       } else {
        minimoLogica = num3;
    }
    System.out.println("El minimo por logica es el: "+ minimoLogica);
}
}