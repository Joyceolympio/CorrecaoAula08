import java.util.Scanner;

public class Ex3 {

    //Faça um programa que converta metros para centímetros.

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite os metros para conversão: ");
        double metros = entrada.nextDouble();

        double resultado = metros * 100;

        System.out.println("O resultado da conversão é: " + resultado + "c");

//        double metros = 5;
//
//        double resultado = metros * 100;
//
//        System.out.println("A conversão de " + metros + " metros em centímetros é: " + resultado + " cent.");

    }


}
