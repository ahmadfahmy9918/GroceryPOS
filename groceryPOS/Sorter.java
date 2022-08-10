/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryPOS;
import java.util.ArrayList;


/**
 *
 * @author Ahmad
 */
public abstract class Sorter {
    
    public Sorter(){
        
    }

    public abstract java.util.ArrayList<Product> sortAscendingList(java.util.ArrayList<Product> l);
    
    
    public abstract java.util.ArrayList<Product> sortDescendingList(java.util.ArrayList<Product> l);
    
    
    
}
