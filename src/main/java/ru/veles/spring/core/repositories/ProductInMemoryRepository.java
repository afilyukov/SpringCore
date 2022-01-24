package ru.veles.spring.core.repositories;

import org.springframework.stereotype.Component;
import ru.veles.spring.core.model.Product;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ProductInMemoryRepository implements ProductRepository {
    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
        products.add(new Product(121, "Orange", 7));
        products.add(new Product(15, "Spoon", 15));
    }

    @Override
    public Product getProduct(Product product) {
        return products.get(product.getId());
    }

    @Override
    public void addProduct(Product product) {
        if (product.getId()>0) {
            if (products.get(product.getId()) == null) {
                products.add(product);
            } else {
                throw new IllegalArgumentException("Product is already exist!");
            }
        } else {
            throw new IllegalArgumentException("Product ID is illegal!");
        }
    }

    @Override
    public Product getProductById(int id) {
        return products.get(id);
    }

    @Override
    public List<Product> getAll() {
        return Collections.unmodifiableList(products);
    }

    @Override
    public void updateProduct(Product product) {
        if (products.get(product.getId()) != null) {
            products.add(product);
        } else {
            throw new IllegalArgumentException("There is no such product!");
        }
    }

    @Override
    public void deleteProduct(Product product) {
        if (products.get(product.getId()) != null) {
            products.remove(product.getId());
        } else {
            throw new IllegalArgumentException("There is no such product!");
        }
    }

    @Override
    public void deleteProductById(int id) {
        if (products.get(id) != null) {
            products.remove(id);
        } else {
            throw new IllegalArgumentException("There is no such product!");
        }
    }

    @Override
    public boolean isExist(int id) {
        return products.get(id) != null;
    }
}
