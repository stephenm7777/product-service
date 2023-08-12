package com.stephen7777.product.service.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.stephen7777.product.service.model.Product;

public interface ProductRepository extends MongoRepository <Product, String>{

}
