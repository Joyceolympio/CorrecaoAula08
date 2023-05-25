import java.util.Scanner;

public class Ex5 {


    // Faça um programa que peça a temperatura em graus Fahrenheit,
    // transforme e mostre a temperatura em graus Celsius.
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double f = entrada.nextDouble();

        double temperaturaCelsius = (f - 32) / 1.8;

        System.out.printf("O resultado da conversão é: %.3f", temperaturaCelsius);

    }

}
