/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oradelgiorno;

/**
 *
 * @author Federica
 */
public class OraDelGiorno {

    private int ore;
    private int minuti;
    
    
public OraDelGiorno(int h,int m){
    super();
    ore = h;
    minuti = m;
}    

public OraDelGiorno(int h){
    this(h,0);
}
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
