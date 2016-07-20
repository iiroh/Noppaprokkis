/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuutio;

import java.util.Random;



/**
 *
 * @author iheinala
 */
public class Noppa {
    
private int side;
private int number;

    
    public Noppa()
    {
        System.out.println("Hello World! Olet luonut kuusi sivuisen nopan!");
        side=6;
        
           

    }

    public Noppa(int sides)
    {
        System.out.println("Hello World! Olet luonut " + sides + " sivuisen nopan!");
        side=sides;
    

    }
    /*    private int getRandomNumber(int num)
    {
    
    Random rnd = new Random(side);
    num =rnd.nextInt(side)+1;
    return num;
    }*/
    public int getSides()
    {
        return side;
    
    }
    
    public int throwNoppa()
    {
        Random rnd = new Random(side);
        int number =rnd.nextInt(side)+1;
        return number;
    }
            
    
}
