package Implement;

public class Main {
    public static void main(String[] args) {
        //dos hilos
            HiloLetras hiloLetras=new HiloLetras(1);
            HiloLetras hiloLetras2=new HiloLetras(2);
            Thread t1=new Thread(hiloLetras);
            Thread t2=new Thread(hiloLetras2);

            t1.start();
            t2.start();
    }
}