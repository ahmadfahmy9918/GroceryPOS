package groceryPOS;


public class Driver { 
    public static void main(String args[]) {
        Product p1 = new Product("apricot", 5, "produce");
        Product p2 = new Product("spinach", 2, "produce");
        Product p3 = new Product("milk", 3, "dairy");
        Product p4 = new Product("cheese", 8, "dairy");
        Product p5 = new Product("octopus", 10, "meat");
        Product p6 = new Product("chicken", 7, "meat");
        Product p7 = new Product("beef", 6, "meat");
        

        POSbongos bongos = new POSbongos();
        bongos.addProduct(p1);
        bongos.addProduct(p2);
        bongos.addProduct(p3);
        bongos.addProduct(p4);
        bongos.addProduct(p5);
        bongos.addProduct(p6);
        bongos.addProduct(p7);
        
        //sort by price
        System.out.println("Bongos: SORT BY PRICE");
        System.out.println("---------------------");
        bongos.setSorter(new PriceSorter());
        bongos.showAllProducts();
        System.out.println("");
        bongos.showProductsInCategory("dairy");
        System.out.println("");
        bongos.showProductsInPriceRange(4, 8);
        System.out.println("");
        
        //sort by name
        System.out.println("Bongos: SORT BY NAME");
        System.out.println("--------------------");
        bongos.setSorter(new NameSorter());
        bongos.showAllProducts();
        System.out.println("");
        bongos.showProductsInCategory("dairy");
        System.out.println("");
        bongos.showProductsInPriceRange(4, 8);
        System.out.println("");
        

        POSfoolmart foolmart = new POSfoolmart();
        foolmart.addProduct(p1);
        foolmart.addProduct(p2);
        foolmart.addProduct(p3);
        foolmart.addProduct(p4);
        foolmart.addProduct(p5);
        foolmart.addProduct(p6);
        foolmart.addProduct(p7);
        
        //sort by price
        System.out.println("Foolmart: SORT BY PRICE");
        System.out.println("-----------------------");
        foolmart.setSorter(new PriceSorter());
        foolmart.showAllProducts();
        System.out.println("");
        foolmart.showProductsInCategory("dairy");
        System.out.println("");
        foolmart.showProductsInPriceRange(4, 8);
        System.out.println("");
        
        //sort by name
        System.out.println("Foolmart: SORT BY NAME");
        System.out.println("----------------------");
        foolmart.setSorter(new NameSorter());
        foolmart.showAllProducts();
        System.out.println("");
        foolmart.showProductsInCategory("dairy");
        System.out.println("");
        foolmart.showProductsInPriceRange(4, 8);
        System.out.println("");
    }
}
