package Objetos;

public class Caneta {
    public static void main(String[] args) {

        System.out.println("Caneta 01");

        AtributosCaneta c1 = new AtributosCaneta();
            c1.modelo = "Bic";
            c1.cor = "Azul";
            c1.carga = 50;
            c1.ponta = 0.7f;
            c1.tampada = true;
            c1.status();
            c1.rabiscar();

        System.out.println("===========================");

            System.out.println("Caneta 02");

            AtributosCaneta c2 = new AtributosCaneta();
            c2.modelo = "FaberCastel";
            c2.cor = "Vermelha";
            c2.carga = 90;
            c2.ponta = 0.5f;
            c2.tampada = false;
            c2.status();
            c2.rabiscar();

        System.out.println("===========================");

            System.out.println("Caneta 03");

            AtributosCaneta c3 = new AtributosCaneta();
            c3.modelo = "Stabilo";
            c3.cor = "Preta";
            c3.carga = 100;
            c3.ponta = 0.9f;
            c3.tampada = true;
            c3.status();
            c3.rabiscar();



    }
}
