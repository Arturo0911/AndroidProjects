package com.example.primerparcialprogramacion5;

import android.content.Intent;

import java.util.ArrayList;
import java.util.Hashtable;

public class Licorera {

    private String productName;
    private String productType;
    private String productBrand;
    private String category;
    private String productCode;
    private String sanitaryRegister;
    private String clientdCed;
    private int clientAge;
    private double  value;
    private String yearProduction;


    // this parameter gonna store by the product and the quantity objects sold
    private Hashtable<String, Integer> searchProductsByCode;


    // store the quantity in stock of products, wnenever product is solded, the table automatically is updated
    private Hashtable<String, Integer> getSearchProductsByCategory;

    // store the producst and ther price or value in this case, wnenever product is solded, the table automatically is updated
    private Hashtable<String, Double> getSearchByPrice;



    private Hashtable<String, String> productAndCode;
    private ArrayList<Integer   > listProducts;

    /*
    *     • Nombre Producto
    • Tipo Producto
    • Marca
    • Categoría
    • Código Producto
    • Registro sanitario
    • Cedula del Cliente
    • Edad del Cliente
    • Valor.
    • Año fabricación.
    * */

    /*
    * Set two constructors
    * One with elements to be loaded, and another without elements
    * */

    public Licorera(){
        listProducts = new ArrayList<Integer>();
        searchProductsByCode = new Hashtable<String, Integer>();
        getSearchProductsByCategory  = new Hashtable<String, Integer>();
        getSearchByPrice = new Hashtable<String, Double>();
        productAndCode = new Hashtable<String, String>();

        // store the products in each instance
        this.productAndCode.put("0001", "cerveza");
        this.productAndCode.put("0002", "Whiskey");
        this.productAndCode.put("0003", "Ron");
        this.productAndCode.put("0004", "Tequila");
        this.productAndCode.put("0005", "Vodka");




    }
    public Licorera(String productName, String productType, String productBrand,
                    String category, String productCode, String sanitaryRegister, String clientdCed,
                    int clientAge, double value, String yearProduction){

        this.productName = productName;
        this.productType = productType;
        this.productBrand = productBrand;
        this.category = category;
        this.productCode = productCode;
        this.sanitaryRegister = sanitaryRegister;
        this.clientdCed = clientdCed;
        this.clientAge= clientAge;
        this.value = value;
        this.yearProduction = yearProduction;

    }




    public void loadProducts(String productCode, int clientAge, String clientdCed, double value, int quantity){

        if (!clientdCed.equals("") && value == this.getSearchByPrice.get(productCode) && clientAge >= 18){
             // then give the product and store

            // store the new quantity
            addNewProductSold(productCode, quantity);

            System.out.println("This is your product "+getValueProductByname(productCode) );

        }

    }

    public void storeProductsIntoHashTable(String productCode, Integer quantity){

        // stored the products
        this.searchProductsByCode.put(productCode, quantity);
    }

    public void queryProuctsStored(){

        // this one gonna print the actual state of dictionary
        System.out.println(searchProductsByCode);
    }


    public Double getValueProductByname (String productCode){


        // return product type double
        return  this.getSearchByPrice.get(productCode);
    }

    public void addNewProductSold(String productCode, int quantity){


        // with this if the product doesn't exist, then create, else plus new quantity
        if (!this.searchProductsByCode.containsKey(productCode)){

            this.searchProductsByCode.put(productCode, quantity);
        }else{

            this.searchProductsByCode.put(productCode, this.searchProductsByCode.get(productCode) + quantity);
        }

    }

    public void deleteProduct(String productCode){

        // delete prodcut by code
        this.searchProductsByCode.remove(productCode);
    }
















    /*
    * Created getters and setters
    *
    * */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getSanitaryRegister() {
        return sanitaryRegister;
    }

    public void setSanitaryRegister(String sanitaryRegister) {
        this.sanitaryRegister = sanitaryRegister;
    }

    public String getClientdCed() {
        return clientdCed;
    }

    public void setClientdCed(String clientdCed) {
        this.clientdCed = clientdCed;
    }

    public int getClientAge() {
        return clientAge;
    }

    public void setClientAge(int clientAge) {
        this.clientAge = clientAge;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(String yearProduction) {
        this.yearProduction = yearProduction;
    }

    public ArrayList<Integer> getListProducts() {
        return listProducts;
    }

    public void setListProducts(ArrayList<Integer> listProducts) {
        this.listProducts = listProducts;
    }
}
