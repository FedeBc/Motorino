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
public class Motorino{

    private String colore;
    public double velocita; 
    private String tipo; 
    private boolean antifurto = false;
    
  //costruttore  
  public Motorino(String c, double v, String t, boolean a)
    {
        colore = c;
        velocita = v;
        tipo = t;
        antifurto = a;
    } 
         
  
  public double getVel()
    {
        return velocita;
    }
  
  public double accelera(double num)
     { 
       if (antifurto == false ){
         velocita= velocita + num ;   
       }
          
    return velocita; 
     } 

public void inserisciAntifurto()
{ 
    antifurto = true;
}
    
       
       
          

            
          
    
}
