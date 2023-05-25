import java.util.Scanner;

public class Ex7 {

    //Faça um Programa que receba o quanto você ganha por hora e o número de horas trabalhadas no mês.
    // Calcule e mostre o total do seu salário no referido mês,
    // sabendo-se que são descontados 11% para o Imposto de Renda,
    // 8% para o INSS e 5% para o sindicato, faça um programa que nos dê respectivamente:
    //Salário bruto.
    //Quanto pagou ao INSS.
    //Quanto pagou ao sindicato.
    //Qual o salário líquido do funcionário.
    public static void main(String[] args){


        Scanner entrada = new Scanner(System.in);

        double taxaInss = 0.08;
        double taxaIr = 0.11;
        double taxaSindicato = 0.05;

        System.out.println("Quanto você ganha por hora? ");
        double ganhaPorHora = entrada.nextDouble();

        System.out.println("Qual o número de horas trabalhadas no mês? ");
        double horasPorMes = entrada.nextDouble();

        double salarioBruto = ganhaPorHora * horasPorMes;

        System.out.printf("O seu salario no mes é: %,.2f %n", salarioBruto);


        double pagamentoInss = salarioBruto * taxaInss;
        System.out.printf("O desconto do INSS foi: %,.2f %n", pagamentoInss);

        double pagamentoSindicato = salarioBruto * taxaSindicato;
        System.out.printf("O desconto do sindicato é: %,.2f %n", pagamentoSindicato);

        double pagamentoIr = salarioBruto * taxaIr;
        System.out.printf("O desconto do IR é: %,.2f %n", pagamentoIr);

        double salarioLiquido = salarioBruto - pagamentoInss - pagamentoSindicato - pagamentoIr;
        System.out.printf("O seu salário líquido é: %,.2f %n", salarioLiquido);
    }

}
