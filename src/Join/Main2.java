package Join;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        Contador c1=new Contador("Contador 1",5);
        Contador c2=new Contador("Contador 2",6);
        Contador c3=new Contador("Contador 3",3);
        Contador c4=new Contador("Contador 4",3);

        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        Thread t3=new Thread(c3);
        Thread t4=new Thread(c4);

        t1.start();//inicia
        t2.start();
        t3.start();
        t4.start();

        t1.join();//significa que se espera a que se acabe
        t2.join();
        t3.join();
        t4.join();
    }
}
