import java.util.Scanner;

public class descontoProduto {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int valorProduto = 0;

        System.out.println("Escolha um produto indicando seu código:");
        System.out.println("1 - TV\n" +
                        "2 - RÁDIO");

        int codigo = scan.nextInt();
        switch (codigo){
            case 1:
                valorProduto = 1000;
                break;
            case 2:
                valorProduto = 2500;
                break;
            default:
                System.out.println("Código não encontrado!");
        }
        double desconto= valorProduto * 0.1; //por que quer dizer 10%
        double valorDesconto = valorProduto - desconto;

        System.out.println("O valor normal do produto é: " + valorProduto + " e o valor com o desconto de 10% fica: " + valorDesconto);
    }
}
