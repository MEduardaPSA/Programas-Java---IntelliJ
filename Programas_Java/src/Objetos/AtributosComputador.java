package Objetos;

public class AtributosComputador {
    String placaMae;
    String placaVideo;
    String processador;
    int hd;
    int memoria;
    int ssd;
    boolean ligado;

    void status(){
        System.out.println("A placa mãe do computador é: " + this.placaMae);
        System.out.println("A placa de video é: " + this.placaVideo);
        System.out.println("O processador é: " + this.processador);
        System.out.println("O HD é de: " + this.hd + "TB");
        System.out.println("A memória é de: " + this.memoria + "GB");
        System.out.println("O SSD é de: " + this.ssd + "GB");
        System.out.println("O computador está ligado?\n" + this.ligado);
    }
    void usar(){
        if (this.ligado == true){
            System.out.println("Computador pronto para uso!");
        }else{
            System.out.println("Para usar o computador, ligue-o primeiro");
        }
    }
    void ligar(){
        this.ligado = true;
    }
    void desligar(){
        this.ligado = false;
    }
}
