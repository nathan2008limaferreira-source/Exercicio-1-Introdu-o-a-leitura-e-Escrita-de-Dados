/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste;

 import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = in.nextLine();
        
        System.out.println("Digite o seu EMAIL: ");
        String email = in.nextLine();
        
        System.out.println("Digite sua idade: ");
        int idade = in.nextInt();
                
       
        
        System.out.println("===============================================================================================");
        
        System.out.print("Nome: "+nome+"\nIdade: "+idade+"\nEmail: "+email);
    }
    
}
