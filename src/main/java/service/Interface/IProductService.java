package service.Interface;

import model.Product;

import java.util.List;

public interface  IProductService {
    List<Product> getAllProduct();
    List<Product> getAllProductByKwAndIdCategory(String kw, int idCategory);
//    List<Product> getAllCustomersByIdCountryPagging(String kw, long idCountry,int page, int pageNumber);
    void    addProduct(Product product);
    Product findProductById(int id);
    void updateProduct(Product product);
    void deleteProduct(int id);
    List<Product> getAllProductByIdCategory(int idCategory);
//    int getNoOfRecords();
}
