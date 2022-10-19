package Objetos;

public class AtributosCaneta {
    String modelo;
    String cor;
    int carga;
    float ponta;
    boolean tampada;

    void status(){
        System.out.println("O modelo da caneta é: " + this.modelo);
        System.out.println("A cor da caneta é: " + this.cor);
        System.out.println("A sua carga é de: " + this.carga);
        System.out.println("A sua ponta é: " + this.ponta);
        System.out.println("A caneta está tampada?\n" + this.tampada);
    }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Não é possível usar uma caneta tampada. Destampe-a");
        }else{
            System.out.println("A caneta está sendo usada com sucesso!");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }


}
