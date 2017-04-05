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
public class Motorino_immatricolato extends Motorino
{
    private double max_vel;
    private String targa;
    
    
    public Motorino_immatricolato(String c, double v, String t, boolean a, double max_v, String t2)
    {
       super(c,v,t,a); 
       max_vel = max_v;
       targa = t2;
    }
    
    public double getMax(){
        return max_vel;
    }
    
    public double accelera(double par)
     { 
        double s =  par + velocita ;
         
         if (s < max_vel)
                 s = velocita ;
         else 
             s = max_vel;
            
         return s;
     }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    Motorino_immatricolato a_moto = new Motorino_immatricolato("Rosso", 30.5, "Aprilia scarabeo",false,60,"CV134");
    a_moto.getMax();
    a_moto.accelera(30.7);
    System.out.println(a_moto.getVel()); //stampa valore di getVel
    
    
    }
    
}

