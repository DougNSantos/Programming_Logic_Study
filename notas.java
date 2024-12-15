import java.util.Scanner;

//algoritmo para calcular a média de 3 numeors inteiros
public class notas {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe 3 notas inteiras:");
        int v1 = scan.nextInt(); //quer dizer que o p´roximo inteiro que digitarmos no teclado ele via gravar nesta variavel
        int v2 = scan.nextInt();
        int v3 = scan.nextInt();

        int resultado = (v1+v2+v3)/3;

        System.out.println("A média é de: " + resultado);
        System.out.println("aqui cuidemos com os tipos e operações pois o valor vai ser processado" +
                "mas dependendo do tipo de variavel ele vai cortar os valores decimais, depois da vírgula!");

    }
}
