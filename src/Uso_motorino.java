/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Federica
 */
public class Uso_motorino
{
    private String colore;
    public double velocita; 
    private String tipo; 
    private boolean antifurto = false;
    
  //costruttore  
  public Uso_motorino(String c, double v, String t, boolean a)
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
  
  
  public static void main(String[] args) {
        // TODO code application logic here
    Uso_motorino a_mto = new Uso_motorino("Grigio metallizzato", 40.5, "Piaggio liberty",false);
    
    double vel_moto = a_mto.getVel();
    System.out.println(a_mto.getVel()); //stampa valore di getVel
   
}
  
}
