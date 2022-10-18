package mediaAlunos;

import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        // Faça um programa que leia a a soma de duas notas e mostre na tela a média entre elas.

        float notaUm, notaDois, soma, media;

        Scanner leitor = new Scanner(System.in);

        System.out.println(" ==== Calcule aqui a sua média! ====");

        System.out.println("Digite a primeira nota: ");
        notaUm = leitor.nextFloat();

        System.out.println("Digite a segunda nota: ");
        notaDois = leitor.nextFloat();

        soma = notaUm + notaDois;
        media = soma / 2;

        System.out.println("A soma das duas notas foi: " + soma);
        System.out.println("A media das duas notas foi de: " + media);

        if(media >= 7){
            System.out.println("Você está aprovado (a). Parabéns!");
        }else{
            System.out.println("Infelizmente você reprovou. Não desanime!");
        }

    }
}
