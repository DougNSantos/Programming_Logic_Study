import java.util.Scanner;

public class tabuada {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe até qual tabuada quer descobrir/ DEVE ser um valor Inteiro: ");
        int tabuada = scan.nextInt();

        //statement = declaração, uma linha de código que executa uma ação ou uma instrução
        for (int i=0; i<=tabuada; i++) {
            for (int count=1; count<=10; count++){

                System.out.println(count + " x " + i + " = " + count*i);

            /*System.out.println("1 x " + i + " = " + i);
            System.out.println("2 x " + i + " = " + 2*i);
            System.out.println("3 x " + i + " = " + 3*i);
            System.out.println("4 x " + i + " = " + 4*i);
            System.out.println("5 x " + i + " = " + 5*i);
            System.out.println("6 x " + i + " = " + 6*i);
            System.out.println("7 x " + i + " = " + 7*i);
            System.out.println("8 x " + i + " = " + 8*i);
            System.out.println("9 x " + i + " = " + 9*i);
            System.out.println("10 x " + i + " = " + 10*i);
            System.out.println(" ");*/

            }
            System.out.println(" ");
        }
    }
}
