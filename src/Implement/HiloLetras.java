package Implement;

public class HiloLetras implements Runnable{
    private int tipo;

    public HiloLetras(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
     boolean bandera=true;
     while (bandera){
         switch (tipo){
             case 1:
                 for (int i=0;i<30;i++){
                     System.out.println(i);
                 }
                 break;
             case 2:
                 for (char c='a';c<'z';c++){
                     System.out.println(c);
                 }
                 break;

         }
     }
    }
}
