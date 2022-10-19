package Objetos;

public class AtributoAula {
    String nomeAula;
    String professor;
    float duracao;
    int curtidas;
    int comentarios;
    boolean assistir;

    void status(){
        System.out.println("O nome da aula que estou assistindo é: " + this.nomeAula);
        System.out.println("O nome do(a) professor(a) é: " + this.professor);
        System.out.println("A aula tem " + this.duracao + " minutos de duração");
        System.out.println("A aula tem " + this.curtidas + " curtidas");
        System.out.println("A aula tem " + this.comentarios + " comentários");
        System.out.println("Estou assistindo a aula neste momento?\n" + this.assistir);
    }
    void aprender(){
        if (this.assistir == true){
            System.out.println("Estou dominando o conteúdo. :)");
        }else{
            System.out.println("Preciso assistir a aula para entender o conteúdo");
        }
    }


}
