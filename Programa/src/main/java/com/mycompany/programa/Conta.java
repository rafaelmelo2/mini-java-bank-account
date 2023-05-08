/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa;

/**
 *
 * @author suporte
 */
public class Conta {
    // ATRIBUTOS
    int numero;
    String nome;
    String tipo;
    double saldo;
    double limite;
    
    
    // MÉTODOS
    boolean verificaSaldo(double valor){
        if(this.saldo < valor){
            
            return false;
        }else{
            return true;
        } 
    }
    
    boolean saca(double valor){
        if(this.saldo < valor){
            
            return false;
        }else{
            this.saldo = this.saldo - valor;
            return true;
        }      
    }  
    void deposita(double valor){
        saldo = saldo + valor;
    }   
    void transfere(double valor, Conta c2){
        this.saldo = this.saldo - valor;
        c2.saldo = c2.saldo + valor ;
    }
    
}
