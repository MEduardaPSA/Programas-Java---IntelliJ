package Objetos;

public class Aula {
    public static void main(String[] args) {
        AtributoAula aula = new AtributoAula();
        aula.nomeAula = "Programação Orientada a Objetos em Java";
        aula.professor = "Gustavo Guanabara";
        aula.duracao = 10.5f;
        aula.curtidas = 1200;
        aula.comentarios = 300;
        aula.assistir = false;
        aula.status();
        aula.aprender();
    }
}
