package com.microservice.product;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class ProductController {

    private static Map<String,Product> products= new HashMap<>();


    @PostMapping("/products")
    public ResponseEntity postProduct(@RequestBody Product product){
        products.put(product.getId(),product);

        return new ResponseEntity(HttpStatus.OK);

    }
    @PutMapping("/products")
    public ResponseEntity putProduct(@RequestBody Product product){
        products.put(product.getId(),product);

        return new ResponseEntity(HttpStatus.OK);

    }
    @GetMapping("/products")
    public ResponseEntity getProduct(@RequestBody Product product){
        return new ResponseEntity<>(products.values(), HttpStatus.OK);
    }
}
