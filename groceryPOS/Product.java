/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryPOS;

/**
 *
 * @author Ahmad
 */
public class Product {
    
    java.lang.String Name;
    int Price;
    java.lang.String Category;
    
    
    public Product(java.lang.String name, int price, java.lang.String category){
        
        /*
        Parameters:
name - the name of the product
price - the price of the product
category - the category of the product
        */
        
        Name = name;
        Price = price;
        Category = category;
        
        
    }
    
    public java.lang.String getName(){
        return Name;
        //Returns the name of this product.

    }

    public int getPrice(){
        return Price;
        //Returns the price of this product.

        
    }

    public java.lang.String getCategory(){
        return Category;
        
        //Returns the category of this product.

    }

    
    
}
