/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this placeHolderlate file, choose Tools | Templates
 * and open the placeHolderlate in the editor.
 */
package groceryPOS;

import java.util.*;

/**
 *
 * @author Ahmad
 */
public class NameSorter extends Sorter{

    public NameSorter(){

    }

    Product placeHolder;
    //Orders the product names ascending alphabetically
    @Override
    public ArrayList<Product> sortAscendingList(ArrayList<Product> l) {
        placeHolder = new Product("", 0 , "");
        for(int i = 0; i<l.size() - 1; i++){
            for(int j=i+1; j<l.size(); j++){
            if(l.get(i).getName().compareTo(l.get(j).getName())>= 0){
                placeHolder = l.get(i);;
                l.set(i, l.get(j));
                l.set(j,placeHolder);
            }
        }
    }

        return l;
    }

    //Orders the product names descending alphabetically
    @Override
    public ArrayList<Product> sortDescendingList(ArrayList<Product> l) {
         placeHolder = new Product("", 0 , "");
        for(int i = 0; i<l.size() - 1; i++){
            for(int j=i+1; j<l.size(); j++){
            if(l.get(i).getName().compareTo(l.get(j).getName())<= 0){
                placeHolder = l.get(i);;
                l.set(i, l.get(j));
                l.set(j,placeHolder);
            }
        }
    }

        return l;
    }


}
