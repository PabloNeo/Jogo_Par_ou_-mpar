package domain2;

import com.sun.source.tree.BreakTree;

import java.util.Random;
import java.util.Scanner;

public class ParouImpar {
    public static void main(String[] args) {


        int num;
        int numPC;
        int soma;
        int resto;
        String parImpar;

        System.out.println("Este é um jogo de Par ou Ímpar contra o PC");
        System.out.println("Se você desejar ímpar, digite (I). Se desejar par, digite (P)");

        Random gerador = new Random();

        Scanner input = new Scanner(System.in);
        parImpar = input.next();


        switch (parImpar) {
            case "I":
                System.out.println("Boa sorte! Você digitou um número ímpar!");
                break;
            case "P":
                System.out.println("Boa sorte! Você digitou um número Par!");
                break;
            default:
                System.out.println("Você digitou uma opção inválida! Verifique se digitou letras maiúsculas.");
                return;
        }


        System.out.println("Escolha um valor de 1 a 100!");

        num = input.nextInt();

        if (num <= 100) {
            numPC = gerador.nextInt(100);
            System.out.println("O PC jogou: " + numPC);
            soma = num + numPC;
            resto = soma % 2;
            if ((resto == 0) && (parImpar.equals("P"))) {
                System.out.println("Você jogou par, com o valor: " + num + " o PC jogou com o valor: " + numPC + " Você venceu, a soma foi " + soma);
            } else if ((resto == 1) && (parImpar.equals("I"))) {
                System.out.println("Você jogou ímpar, com o valor: " + num + " o PC jogou com o valor: " + numPC + " Você venceu! A soma foi " + soma);
            } else {
                System.out.println("Você perdeu!");
            }

        }

    }
}
