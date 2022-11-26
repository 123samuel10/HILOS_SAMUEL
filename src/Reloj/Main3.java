package Reloj;

public class Main3 {
    public static void main(String[] args) {
        //RELOJ Digital CON HILOS
        RelojD relojD=new RelojD(1,0,0);

        Thread t1=new Thread(relojD);
        t1.start();

    }
}
