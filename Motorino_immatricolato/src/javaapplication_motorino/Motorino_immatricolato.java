/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication_motorino;

/**
 *
 * @author Federica
 */
public class Motorino_immatricolato
{
   
    private double max_vel;
    private String targa;
    
    
    public Motorino_immatricolato(double max_v, String t)
    {
       max_vel = max_v;
       targa = t;
    }
    
    public double getMax(){
        return max_vel;
    }
    
    public void accelera(double par, double s)
     { 
         s = par + velocita;
         
         if (s < max_vel)
                 s = velocita;
         else 
             s = max_vel;
            
   
     }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
