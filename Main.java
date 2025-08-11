import entities.elementos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        elementos x, y;
        x = new elementos();
        y = new elementos();

        System.out.println("------Bem-vindo a calculadora------");
        System.out.println("Digite um numero inteiro: ");
        x.a = scanner.nextInt();
        System.out.println("Digite outro numero inteiro:");
        y.b = scanner.nextInt();

        int soma = x.a + y.b;
        int subtracao = x.a - y.b;
        int multipli = x.a * y.b;
        int divisao = x.a / y.b;

        System.out.printf("A soma entre " + x.a +"+" + y.b + " = " + soma +"%n");
        System.out.printf("A subtração entre " + x.a +"-" + y.b + " = "+ subtracao+ "%n");
        System.out.printf("A multiplicação entre " + x.a +"x" + y.b + " = "+ multipli + "%n");
        System.out.printf("A divisão entre " + x.a +"/" + y.b + " = "+ divisao + "%n");

    }
}