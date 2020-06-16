/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício.pkg5;

import java.util.Scanner;

/**
 *
 * @author Kayke
 */
public class Exercício5 {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        double n1, n2, media, exame, media2=0;
        
        Scanner enter = new Scanner (System.in);
        System.out.println("Digite a primeira nota: ");
        n1= enter.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2= enter.nextDouble();
        media= (n1+n2)/2;
        
        
        if (media >=7)
            System.out.println("Aprovado com: "+media+ "de mota");
        else{
                System.out.println("Digite a nota do exame: ");
                exame= enter.nextDouble();
                media2= media+exame;
                if (media2>=5){
                    System.out.println("Aprovado pelo exame com: "+media2+" de mota");
                }else
                    System.out.println("Reprovado com: "+media2+" de nota");
                     
                        
        }
        
        
        
        
        
    }
    
}
