package company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce el número para la criba de Erastótenes:");
        int dato=teclado.nextInt();
        int vector[]=new int[dato];
        Primos primos = new Primos();
        System.out.println("\nVector inicial hasta :"+dato);

        muestraVectores(vector);
        vector=primos.generarPrimos(dato);
        System.out.println("\nVector de primos hasta:"+dato);
        muestraPrimos(vector);

    }
    private static void muestraVectores(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            if (i%10==0) {
                System.out.println();
            }
            System.out.print(i+1+"\t");
        }
    }

    private static void muestraPrimos(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            if (i%10==0) {
                System.out.println();
            }
            System.out.print(vector[i] + "\t");
        }
    }

    }
