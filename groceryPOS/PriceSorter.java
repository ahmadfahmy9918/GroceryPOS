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
public class PriceSorter extends Sorter {

   int s;
   int k = 0;



  
    @Override
    public ArrayList<Product> sortAscendingList(ArrayList<Product> l) {

        for(s = 1; s < l.size(); s++){
            Product temp = new Product(l.get(s).getName(), l.get(s).getPrice(), l.get(s).getCategory());
            k = s;
            while((k > 0) && (l.get(k-1).getPrice() > temp.getPrice())){
                l.set(k, l.get(k-1));
                k--;
            }
            l.set(k, temp);
        }
        return l;
    }




    @Override
    public ArrayList<Product> sortDescendingList(ArrayList<Product> l) {

        for(s = 1; s < l.size(); s++){
             Product temp = new Product(l.get(s).getName(), l.get(s).getPrice(), l.get(s).getCategory());
            k = s;
            while((k > 0) && (l.get(k-1).getPrice() < temp.getPrice())){
                l.set(k, l.get(k-1));
                k--;
            }
            l.set(k, temp);
        }
        return l;
    }

}
