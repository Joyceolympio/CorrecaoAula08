import java.util.Scanner;

public class Ex2 {


    //Faça um programa que receba 4 notas bimestrais e mostre a média aritmética.

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        double nota3 = entrada.nextDouble();

        System.out.println("Digite sua quarta nota: ");
        double nota4 = entrada.nextDouble();

        double mediaAritmetica = (nota1 + nota2 + nota3 + nota4) / 4;


        System.out.println("A sua média aritmética é: " + mediaAritmetica);

    }

}
