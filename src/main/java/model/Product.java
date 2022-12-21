package model;

public class Product {
    private int idProduct;
    private String nameProduct;
    private double price;
    private String color;
    private String description;
    private int idCategory;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, double price, String color, String description, int idCategory) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.color = color;
        this.description = description;
        this.idCategory = idCategory;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }
}
