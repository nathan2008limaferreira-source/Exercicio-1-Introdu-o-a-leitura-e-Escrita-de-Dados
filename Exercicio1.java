/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            
        System.out.println("Digite o nome do aluno: ");
        String nome = in.nextLine();
        
        System.out.println("Digite a nota do 1º bimestre: ");
        double nota = in.nextDouble();
                
        System.out.println("Digite a nota do 2º bimestre ");
        double nota2 = in.nextDouble();
       
        double media = (nota * 2 + nota2 * 3) / 5.0;
        
        System.out.println("=======================================================================================================");
        System.out.printf("Nome: %s\nMédia do Aluno: %.2f\n", nome, media);
    
    }
}
