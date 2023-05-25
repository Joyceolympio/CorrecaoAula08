import java.util.Scanner;

public class Ex4 {

    /* Faça um Programa que recebe o quanto você ganha por hora e o número de horas trabalhadas no mês.
    Calcule e mostre o total do seu salário no referido mês. */

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        double ganhaPorHora = entrada.nextDouble();

        System.out.println("Qual número de horas trabalhadas no mês?");
        double numeroHorasMes = entrada.nextDouble();

        double salarioTotal = ganhaPorHora * numeroHorasMes;

        System.out.printf("O seu salário %,.2f esse mês é: ", salarioTotal);




    }

}
