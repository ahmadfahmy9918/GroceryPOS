/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryPOS;

import java.util.*;

/**
 *
 * @author Ahmad
 */
public class POSfoolmart extends POSgrocery{
 
    public POSfoolmart(){
        //The default constructor. Note: This constructor MUST not initialize any variable.

    }

    @Override
    //Reorders the list in a Descending order and prints it
    protected void show(ArrayList<Product> l) {
        /*
        Displays the specified list of products.
The display for a product MUST follow the following format:
[name], [price], [category]
        */
        
        
      this.sortDescendingList(l);
       for(Product p: l){
            System.out.println(p.getName() + " " + p.getPrice() + " " + p.getCategory());
        }
        
    }

    
    
    
}
