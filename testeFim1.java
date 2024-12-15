import java.util.Scanner;

//Programa que le 20 notas e nos mostra a média usando a estrutura de repetição com teste no fim.
public class testeFim1 {
    public static void main(String[] args){

        //o atalho do Systemm.out no Intellij é: sout + Tab
        //identação automatica tem que configurar: atalho é: Ctrl + Alt + L
        Scanner scan = new Scanner(System.in);

        float valor, media;
        float soma = 0f;
        int count = 0;

        //laço de repetição com teste no fim
        do {
            System.out.println("Informe um valor numérico da nota Nº " + (count+1) + " : ");
            valor = scan.nextFloat();

            //soma recebera ela mesma + valor
            soma = soma + valor;
            //incrementamos o contador da estrutura
            count++;

            //como é teste no fim, devemos cuidar o numero de iterações da estrutura!
        } while(count <= 19);

        System.out.println("A soma das nota é: " + soma);

        //como são 20 inputs, a méda é / por 20
        media = soma/20;
        System.out.println("A média de seus inputs será: " + media);
    }
}
