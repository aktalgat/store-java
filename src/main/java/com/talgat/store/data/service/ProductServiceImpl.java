package com.talgat.store.data.service;

import com.talgat.store.api.payload.ProductSaveRequest;
import com.talgat.store.data.dao.ProductRepository;
import com.talgat.store.data.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(ProductSaveRequest saveRequest) {
        Product product = new Product(saveRequest.getCategoryId(), saveRequest.getName(), saveRequest.getDescription(),
                saveRequest.getShortDescription(), saveRequest.getAdditionalInfo(),
                saveRequest.getBadge(),saveRequest.getPrice(), saveRequest.getPriceOld(),
                saveRequest.getStars());

        return saveProduct(product);
    }

    @Override
    public Product saveProduct(Product product) {
        Product newProduct = productRepository.save(product);
        log.info("Saved product: {}", newProduct);
        return newProduct;
    }
}
