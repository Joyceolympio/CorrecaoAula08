import java.util.Scanner;

public class Ex6 {


    //Faça um programa que leia um número inteiro e imprima o seu antecessor e seu sucessor.

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        int numAntecessor = numero - 1;
        int numSucessor = numero + 1;

        System.out.println("O número digita foi: " + numero);
        System.out.println("O número antecessor é: " + numAntecessor + " e o número sucessor é: " + numSucessor);


        System.out.println("O numero ant" + (numero - 1) + "e o numero suc" + (numero + 1)) ;
    }

}
