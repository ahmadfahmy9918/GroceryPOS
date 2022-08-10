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
public class POSbongos extends POSgrocery{

    public POSbongos(){
        //The default constructor. Note: This constructor MUST not initialize any variable.



    }

    @Override
    protected void show(ArrayList<Product> l) {

        this.sortAscendingList(l);
        for(Product p: l){
            System.out.println(p.getName() + " " + p.getPrice() + " " + p.getCategory());
        }
    }



}
