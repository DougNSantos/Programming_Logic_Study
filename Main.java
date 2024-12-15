import java.util.Scanner;

//algoritmo para somas 4 numeros
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int v1,v2,v3,v4,resultado;

        System.out.println("informe 4 numeros:");
        v1=scan.nextInt();
        v2=scan.nextInt();
        v3=scan.nextInt();
        v4=scan.nextInt();

        resultado = v1+v2+v3+v4;

        System.out.println("a soma destes 4 numeros é:" + resultado);

    }
}