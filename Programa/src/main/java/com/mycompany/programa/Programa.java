/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa;

/**
 *
 * @author suporte
 */
public class Programa {

    public static void main(String[] args) {
        Conta minhaConta;
        
        minhaConta = new Conta();  
        minhaConta.saldo = 200;
        minhaConta.nome = "Rafael";
        
        Conta meuSonho = new Conta();
        meuSonho.saldo = 10000;
        
        /*System.out.println("1. Saldo Atual = " + minhaConta.saldo +" reais");
        
        minhaConta.deposita(300);
        System.out.println("2. Saldo Atual após depositar +300 reais = " + minhaConta.saldo +" reais");
        
        minhaConta.saca(100);
        System.out.println("3. Saldo Atual após sacar 100 reais = " + minhaConta.saldo +" reais");
        
        if(minhaConta.saca(50.00)){
            System.out.println("Conseguiu Sacar, saldo atual: " + minhaConta.saldo);
        }else{
            System.out.println("Não conseguiu sacar");
        }*/
        
        
        System.out.println("Saldo antes minhaConta: " + minhaConta.saldo);
        System.out.println("Saldo antes minhaConta: " + meuSonho.saldo);
        
        if(minhaConta.verificaSaldo(100.00)){
            minhaConta.transfere(100.00, meuSonho);
        }else{
            System.out.println("Não conseguiu TRANSFERIR");
        }
        System.out.println("Saldo DEPOIS minhaConta: " + minhaConta.saldo);
        System.out.println("Saldo DEPOIS minhaConta: " + meuSonho.saldo);
    }
}
