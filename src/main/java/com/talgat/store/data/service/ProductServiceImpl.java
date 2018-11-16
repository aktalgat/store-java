package com.talgat.store.data.service;

import com.talgat.store.api.payload.ProductRequest;
import com.talgat.store.data.dao.ProductRepository;
import com.talgat.store.data.model.Product;
import com.talgat.store.data.model.ProductImage;
import com.talgat.store.exception.InternalException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    @Transactional
    public Product saveProduct(ProductRequest saveRequest) {
        Product product = new Product(saveRequest.getCategoryId(), saveRequest.getName(), saveRequest.getDescription(),
                saveRequest.getShortDescription(), saveRequest.getAdditionalInfo(),
                saveRequest.getBadge(),saveRequest.getPrice(), saveRequest.getPriceOld(),
                saveRequest.getStars());
        List<ProductImage> list = product.getProductImageList();
        for (String url : saveRequest.getProductImageList()) {
            list.add(new ProductImage(url, product));
        }

        return saveProduct(product);
    }

    @Override
    @Transactional
    public Product saveProduct(Product product) {
        Product newProduct = null;
        try {
            newProduct = productRepository.save(product);
        } catch (Exception e) {
            log.error("error: {}", e.getMessage());
            throw new InternalException("Internal error in saving");
        }
        log.info("Saved product: {}", newProduct);
        return newProduct;
    }

    @Override
    public List<Product> getProductList() {
        return productRepository.findAll();
    }
}
