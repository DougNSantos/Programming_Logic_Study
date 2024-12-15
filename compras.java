import java.util.Scanner;

//algoritmo para escolha de produto e mostrar os itens e valores
public class compras {
    public static void main(String[] args){
        System.out.println("Produtos:\n" +
                "1 - TV\n" +
                "2 - RÁDIO\n" +
                "3 - FORNO\n" +
                "4 - SAIR");

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha um item do menu acima:");
        int escolha = scan.nextInt();

        //tive que inicializar as variáveis
        //isso em java pode ser chamado de coersão, pois Java é extremamente tipado e devemos garantir tudo certo!
        String item = " ";
        int valorUnitario = 0;

        switch(escolha) {
            case 1:
                System.out.println("O produto é uma TV: seu valor é de 1000");
                //apesar das variaveis estarem declaradas no escopo externo, elas são vistas aqui, neste escopo interno
                //então aqui dentro elas estão sendo manipuladas, mas ainda poderão ser acessadas posteriormente!
                item = "TV";
                valorUnitario = 1000;
                break;
            case 2:
                System.out.println("O produto é um rádio: seu valor é de 500");
                item = "RÁDIO";
                valorUnitario = 500;
                break;
            case 3:
                System.out.println("O produto é um forno: seu valor é de 700");
                item = "FORNO";
                valorUnitario = 700;
                break;
            case 4:
                System.exit(0); //sai do programa
            default:
            System.out.println("NENHUM ITEM CORRESPONDE, rode o programa de novo!");
            System.exit(0);
        }

        System.out.println("Qual a quantidade deste item?");
        int quantidade = scan.nextInt();

        int valorTotal = valorUnitario*quantidade;

        System.out.println("o item escolhido é " + item + " com o valor unitário de: " + valorUnitario + " e o valor total será de : " + valorTotal);

    }
}
