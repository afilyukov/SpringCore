package ru.veles.spring.core.repositories;


import ru.veles.spring.core.model.Product;
import java.util.List;

public interface ProductRepository {
    void addProduct(Product product);
    Product getProductById(int id);
    Product getProduct(Product product);
    boolean isExist(int id);
    List<Product> getAll();
    void updateProduct(Product product);
    void deleteProduct(Product product);
    void deleteProductById(int id);
}