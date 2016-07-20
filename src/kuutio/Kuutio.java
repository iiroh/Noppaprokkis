/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuutio;

import java.util.Scanner;

/**
 *
 * @author iheinala
 */
public class Kuutio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        //luo ensin pelikenttä
        
        int widht;
        int length;
        System.out.println("Kuinka monta sivua haluat noppaan?");
          Noppa noppis= new Noppa(scan.nextInt());
          Noppa noppis2= new Noppa();
          
       noppis.getSides();
               
       
               
        
          
            
        


   /* for (int i=0;i<neliö.length; i++)
    {
        for (int j=0; j<neliö[i].length; j++)
        {
        neliö[i][j]= i+1;
        System.out.println(neliö[i][j]);
        }

    }
    */   
        
        
        
        
        
    }
    
}
