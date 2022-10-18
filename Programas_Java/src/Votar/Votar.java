package Votar;

import java.util.Scanner;

public class Votar {
    public static void main(String[] args) {

        int idade = 18;

        Scanner leitor = new Scanner(System.in);

        System.out.println("==== Confira se você tem permissão para votar! ====");

        System.out.print("Primeiramente, digite a sua idade: ");
        idade = leitor.nextInt();

        if(idade <= 15){
            System.out.println("Você ainda não pode votar!");
        }else if(idade <= 17){
            System.out.println("Voto opcional");
        }else if(idade <= 64){
            System.out.println("Voto obrigatório!");
        }else{
            System.out.println("Voto opcional");
        }

    }
}
