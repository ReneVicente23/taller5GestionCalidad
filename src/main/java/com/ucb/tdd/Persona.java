package com.ucb.tdd;

public class Persona {
    private int piso;
    private int destino;

    public Persona(int piso,int destino) {
        this.piso = piso;
        this.destino=destino;
    }
    public Persona() {
        this.piso = 0;
        this.destino=0;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void crearPersona(){
        int num=(int)(1+3*Math.random());
        setPiso(num);
        int flg=1;
        while(flg==1){
            int num2=(int)(1+3*Math.random());
            if(num2!=num){
                setDestino(num2);
                flg=2;
            }
        }
    }

}
