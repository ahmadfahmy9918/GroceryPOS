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
public abstract class POSgrocery {
protected Sorter sort;
private ArrayList<Product> nProduct = new ArrayList<Product>();


    public POSgrocery(){

    }



    public void setSorter(Sorter s){
        sort = s;
    }

    protected abstract void show(java.util.ArrayList<Product> l);

    protected java.util.ArrayList<Product> sortAscendingList(java.util.ArrayList<Product> l){
       return sort.sortAscendingList(l);
    }

    protected java.util.ArrayList<Product> sortDescendingList(java.util.ArrayList<Product> l){
        return sort.sortDescendingList(l);
    }

    public void showAllProducts(){
      this.show(nProduct);
    }


    public void showProductsInCategory(java.lang.String cat){
      ArrayList<Product> prodInCat = new ArrayList<Product>();
        for(Product t: nProduct){
            if(t.getCategory().equals(cat)){
               prodInCat.add(t);

            }
        }
        this.show(prodInCat);
    }



    public void showProductsInPriceRange(int lower, int upper){
      ArrayList<Product> prodInPR = new ArrayList<Product>();
             for(Product t: nProduct){

                  if(t.getPrice() >= lower && t.getPrice() <= upper){
                      prodInPR.add(t);
                  }
             }

             this.show(prodInPR);
    }



    public void addProduct(Product p){
      nProduct.add(p);
    }


}
