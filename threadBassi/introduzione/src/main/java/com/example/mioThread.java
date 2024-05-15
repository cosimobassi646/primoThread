package com.example;

public class mioThread extends Thread {
    private int conta = 0;
    public mioThread(int conta){
        this.conta = conta;
    }

    public mioThread(){}

    @Override
    public void run() {         
        System.out.println("Stampa dal Thread");
            while(conta < 10){
                System.out.println(conta);
                conta++;
            }

        }
}
