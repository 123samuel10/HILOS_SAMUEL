package Reloj;

import java.util.Observable;

public class RelojD implements Runnable{
    private int horas,minutos,segundos;
    public RelojD(int horas,int minutos,int segundos){
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
    }

    @Override
    public void run() {
        boolean bandera=true;
        String tiempo;
        while (bandera){
            tiempo="";
            if (horas<10){
                tiempo+=" 0"+horas;
            }else {
                tiempo+=horas;
            }
            tiempo+=":";
            if (minutos<10){
                tiempo+=" 0"+minutos;
            }else {
                tiempo+=minutos;
            }
            tiempo+=":";
            if (segundos<10){
                tiempo+=" 0"+segundos;
            }else {
                tiempo+=segundos;
            }

            segundos++;
            if (segundos==60){
                minutos++;
                segundos=0;
                if (minutos==60){
                    minutos=0;
                    horas++;
                    if (horas==24){
                        horas=0;
                    }
                }
            }
            System.out.println("HORAS"+" "+horas+" "+"MINUTOS: "+" "+minutos+" "+"SEGUNDOS: "+" "+segundos);
            if (horas==2){
                break;
            }
        }
    }
}
