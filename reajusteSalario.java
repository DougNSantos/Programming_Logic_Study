import java.util.Scanner;

//algoritmo para calcular um reajuste salarial
public class reajusteSalario {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        final double reajustePorcentagem = 0.0875;

        System.out.println("Informe seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Infomre seu salário atual: ");
        double salario = scan.nextDouble();

        double reajuste = salario * reajustePorcentagem;
        double novoSalario = salario + reajuste;

        System.out.println(nome + ", seu novo salário será de: " + novoSalario);
    }
}
