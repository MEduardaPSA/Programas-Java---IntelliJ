package Objetos;

public class Computador {
    public static void main(String[] args) {
        AtributosComputador computador = new AtributosComputador();

        computador.placaMae = "H510M";
        computador.placaVideo = "RTX 3060";
        computador.processador = "I-9";
        computador.memoria = 16;
        computador.hd = 1;
        computador.ssd = 500;
        computador.ligado = true;
        computador.status();
        computador.usar();

    }
}
